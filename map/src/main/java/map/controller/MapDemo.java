package map.controller;

import java.util.*;

/**
 * Map集合综合案例
 *
 * @author LENOVO
 * @since 2024/7/2 17:40
 */
public class MapDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] selects = {"A", "B", "C", "D"};
        Random random = new Random();
        for (int i = 1; i <= 80; i++) {
            int index = random.nextInt(4);
            list.add(selects[index]);
        }
        System.out.println(list);

        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            if (map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
    }
}
