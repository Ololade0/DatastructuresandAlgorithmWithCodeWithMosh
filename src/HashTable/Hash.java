package HashTable;

import java.util.HashMap;
import java.util.Map;

public class Hash {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Mosh");
        map.put(2, "John");
        map.put(3, "Mary");
        System.out.println(map.values());
    }
}
