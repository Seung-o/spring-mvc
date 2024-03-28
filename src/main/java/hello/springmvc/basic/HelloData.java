package hello.springmvc.basic;

import lombok.Data;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor를 한번에 사용할 수 있음
public class HelloData {
    private String username;
    private int age;
}
