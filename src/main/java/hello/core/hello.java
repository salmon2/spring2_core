package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class hello {

     private String name;
    private int age;

    public static void main(String[] args) {
        hello h = new hello();
        h.getName();
    }
}
