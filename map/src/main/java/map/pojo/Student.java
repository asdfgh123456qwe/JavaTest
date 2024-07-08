package map.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 学生
 *
 * @author LENOVO
 * @since 2024/6/26 15:25
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    private String name;
    private Integer age;
    private char gender;
}
