package pt.po.edimilsonestevam.kafka;

import java.io.Closeable;
import java.time.Duration;
import java.util.Collections;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.regex.Pattern;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

class KafkaService<T> implements Closeable{

	private final KafkaConsumer<String, T> consumer;
	private final ConsumerFunction parse;

	KafkaService(String groupId, String topic, ConsumerFunction parse, Class<T> type, Map<String, String> properties) {
		this(parse, groupId, type, properties);
		consumer.subscribe(Collections.singletonList(topic));
	}

	KafkaService(String groupId, Pattern topic, ConsumerFunction parse, Class<T> type, Map<String, String> properties) {
		this(parse, groupId, type, properties);
		consumer.subscribe(topic);
	}

	private KafkaService(ConsumerFunction parse, String groupId, Class<T> type, Map<String, String> properties) {
		this.parse = parse;
		this.consumer = new KafkaConsumer<>(getProperties(type, groupId, properties));
	}

	void run() {
		while (true) {
			var records = consumer.poll(Duration.ofMillis(100));
			if (!records.isEmpty()) {
				System.out.println("It found" + records.count() + "registers");

				for (var record : records) {
					parse.consume(record);
				}
			}

		}
	}

	private Properties getProperties(Class<T> type, String groupId, Map<String, String> overrideproperties) {
		var properties = new Properties();
		properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, GsonDeserializer.class.getName());
		properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, groupId);
		properties.setProperty(ConsumerConfig.CLIENT_ID_CONFIG,
				FraudDetectorService.class.getSimpleName() + "-" + UUID.randomUUID().toString()); // Unique ID
		properties.setProperty(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, "1"); // Consumer 1 each 1
		properties.setProperty(GsonDeserializer.TYPE_CONFIG, type.getName());
		properties.putAll(overrideproperties);
		return properties;

	}

	@Override
	public void close(){
		consumer.close();
	}

}
