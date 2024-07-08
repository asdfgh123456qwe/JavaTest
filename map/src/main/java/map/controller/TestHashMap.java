package map.controller;

import map.pojo.Student;

import java.util.*;
import java.util.function.BiConsumer;

/**
 * HashMap练习
 *
 * @author LENOVO
 * @since 2024/7/4 10:59
 */
public class TestHashMap {
    public static void main(String[] args) {
//        Map<Student, String> map = new TreeMap<>((o1, o2) -> o1.getAge() - o2.getAge());
//        map.put(new Student("蜘蛛精", 25, '女'), "盘丝洞");
//        map.put(new Student("蜘蛛精", 25, '女'), "水帘洞");
//        map.put(new Student("至尊宝", 23, '男'), "水帘洞");
//        map.put(new Student("牛魔王", 28, '男'), "牛头山");
//        System.out.println(map);

        List<String> cities1 = new ArrayList<>();
        List<String> cities2 = new ArrayList<>();
        List<String> cities3 = new ArrayList<>();
        Map<String, List<String>> map1 = new HashMap<>();
        map1.put("江苏省", cities1);
        map1.put("湖北省", cities2);
        map1.put("河北省", cities3);
        Collections.addAll(cities1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        Collections.addAll(cities2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
        Collections.addAll(cities3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");
        System.out.println(map1);
        List<String> cities = map1.get("江苏省");
        map1.forEach((String k, List<String> v) -> System.out.println(k + "------->" + v));
    }
}
