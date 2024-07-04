package collectionMap.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 斗地主游戏牌类
 *
 * @author LENOVO
 * @since 2024/7/1 16:06
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Card {
    private String number;
    private String color;
    private Integer size; // 每张牌的大小
}
