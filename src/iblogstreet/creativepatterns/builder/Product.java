package iblogstreet.creativepatterns.builder;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Armyone
 * @date 2019/2/15 13:30
 * @desc
 */

public class Product {
    private HashMap<String, String> part = new HashMap<>();

    public void addPart(String key, String value) {
        part.put(key, value);
    }

    public void show() {
        Set<Map.Entry<String, String>> entries = part.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }
}
