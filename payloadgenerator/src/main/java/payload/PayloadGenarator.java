package payload;

import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;

import com.github.javafaker.Faker;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PayloadGenarator {

    private static final Faker faker = new Faker();
    private static final Random random = new Random();

    public static Map<String, Object> generatePayload(Map<String, Rule> rules) {
        Map<String, Object> payload = new LinkedHashMap<>();

        for (Map.Entry<String, Rule> entry : rules.entrySet()) {
            String key = entry.getKey();
            Rule rule = entry.getValue();

            switch (rule.getType()) {
                case "string":
                    payload.put(key, randomString(rule.getLength() != null ? rule.getLength() : 10));
                    break;

                case "int":
                    int min = rule.getMin() != null ? rule. getMin() : 0;
                    int max = rule.getMax() != null ? rule.getMax() : 100;
                    payload.put(key, random.nextInt(max - min + 1) + min);
                    break;

                case "boolean":
                    payload.put(key, random.nextBoolean());
                    break;

                case "date":
                    payload.put(key, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(faker.date().past(365, TimeUnit.DAYS)));
                    break;

                default:
                    payload.put(key, null);
                    break;
            }

        }
        return payload;
    }
    private static String randomString(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder(length);
        while (sb.length() < length) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }

    private static String generationCustom(String pattern) {
        StringBuilder sb = new StringBuilder();
        for(char c : pattern.toCharArray()) {
            if (c == '#') {
                sb.append(random.nextInt(10));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}