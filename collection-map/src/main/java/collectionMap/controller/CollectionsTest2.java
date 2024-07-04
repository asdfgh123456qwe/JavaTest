package collectionMap.controller;

import java.util.*;

/**
 * Collections工具类练习2
 *
 * @author LENOVO
 * @since 2024/7/1 14:53
 */
public class CollectionsTest2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三", "李四", "王五");
        System.out.println(names);

        Collections.shuffle(names);
        System.out.println(names);

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, (Integer o1, Integer o2) -> Integer.compare(o2, o1));
        System.out.println(list);
    }

}
