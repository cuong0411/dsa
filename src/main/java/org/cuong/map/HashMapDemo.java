package org.cuong.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("bad", "evil");
        map.put("ace", "star");
        map.put("ace", "star");
        System.out.println(map);
        for (var s : map.entrySet()) {
            System.out.println("Key: " + s.getKey() + " - Value: " + s.getValue());
        }
        System.out.println(map.get("ace"));
    }
}
