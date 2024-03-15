package pt.po.edimilsonestevam.kafka;

import java.util.HashMap;

import org.apache.kafka.clients.consumer.ConsumerRecord;

public class FraudDetectorService {

	public static void main(String[] args) {
		var fraudService = new FraudDetectorService();
		try (var service = new KafkaService<>(FraudDetectorService.class.getSimpleName(),
				"ECOMMERCE_NEW_ORDER", 
				fraudService::parse,
				Order.class,
				new HashMap<>() //<String, String> eh opcional usa-las
				)){
		service.run();
		}
	}

	private void parse(ConsumerRecord<String, Order> record) {
		System.out.println("---------------------------------------------");
		System.out.println("Processing new order, checking for fraud");
		System.out.println(record.key());
		System.out.println(record.value());
		System.out.println(record.partition());
		System.out.println(record.offset());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Email sent");
	}

}
