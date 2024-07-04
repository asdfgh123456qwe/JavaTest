package collectionMap.pojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 斗地主房间
 *
 * @author LENOVO
 * @since 2024/7/1 16:14
 */
public class Room {
    private List<Card> cards = new ArrayList<>();

    public Room(){
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♠", "♥", "♣", "♦"};
        int size = 0;
        for (String number : numbers) {
            size++;
            for (String color : colors) {
                Card c = new Card(number, color, size);
                cards.add(c);
            }
        }

        Card c1 = new Card("", "🃏", ++size);
        Card c2 = new Card("", "🃏", ++size);

        Collections.addAll(cards, c1, c2);

        System.out.println("新牌"+cards);
    }

    public void start() {
        Collections.shuffle(cards);
        System.out.println("洗牌后：" + cards);
    }
}