package map.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map集合测试类2
 *
 * @author LENOVO
 * @since 2024/7/2 9:38
 */
public class MapTest2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("手表",100);
        map.put("手表",200);
        map.put("手机",2);
        map.put("Java",2);
        map.put(null,23);

        // 2.获取集合的大小
        System.out.println(map.size());

        // 3.清空集合
//        map.clear();

        // 4.判断集合是否为空
        System.out.println(map.isEmpty());

        // 5.根据键获取值
        System.out.println(map.get("手表"));
        System.out.println(map.get("zhangsan"));
        System.out.println(map.get(null));

        // 6.根据键删除整个元素，返回值
        System.out.println(map.remove("手表"));
        System.out.println(map);

        // 7.判断是否包含某个键
        System.out.println(map.containsKey("手表"));
        System.out.println(map.containsKey("手机"));
        System.out.println(map.containsKey("java"));
        System.out.println(map.containsKey("Java"));

        // 8.获取map集合所有键
        Set<String> keys = map.keySet();
        System.out.println(keys);

        // 9.获取map集合所有值
        Collection<Integer> values = map.values();
        System.out.println(values);

        // 10.把其他Map集合的数据倒入到自己集合中来
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("java1", 10);
        map1.put("java2", 20);
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("java3", 30);
        map2.put("java2", 222);
        map1.putAll(map2);  // putAll：把map2中的元素全部倒入一份到map1中
        System.out.println(map1);
        System.out.println(map2);
    }
}
