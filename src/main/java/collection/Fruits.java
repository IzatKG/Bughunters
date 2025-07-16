package collection;

import lombok.*;

@Data    // генерируте getter/setter, toString, hashcode,eqauls
@AllArgsConstructor
@NoArgsConstructor()
public class Fruits {
    private String name;
}
