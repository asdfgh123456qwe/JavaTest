package map.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * Map集合遍历测试类
 *
 * @author LENOVO
 * @since 2024/7/2 15:03
 */
public class MapTest3 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("蜘蛛精", 162.5);
        map.put("蜘蛛精", 169.8);
        map.put("紫霞", 165.8);
        map.put("111", 183.85);
        map.put("eee", 183.6);
        System.out.println(map);

        // 1.第一种方法
//        Set<String> keys = map.keySet();
//
//        for (String key : keys) {
//            System.out.println(map.get(key));
//        }

        // 2.第二种方法
//        for (Map.Entry<String, Double> entry : map.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

        // 3.第三种方法
//        map.forEach((K, V) -> {
//            System.out.println(K + "--->" + V);
//        });

        map.forEach((K, V) -> System.out.println(K + "--->" + V));

//        map.forEach(new BiConsumer<String, Double>() {
//            @Override
//            public void accept(String k, Double v) {
//                System.out.println(k +  "--->" + v)
//            }
//        });
    }
}
