package map.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Map练习
 *
 * @author LENOVO
 * @since 2024/7/2 9:13
 */
public class MapTest {
    public static void main(String[] args) {
    //    Map<String, Integer> map = new HashMap<>();  // 经典代码
        Map<String, Integer> map1 = new LinkedHashMap<>();  // 经典代码
        map1.put("手表", 100);
        map1.put("手表", 5);
        map1.put(null, null);
        map1.put("d", 3);
        System.out.println(map1);

        Map<Integer, String> map2 = new TreeMap<>();
        map2.put(22, "java");
        map2.put(22, "mysql");
        map2.put(19, "李四");
        map2.put(23, "王五");
        System.out.println(map2);
    }
}
