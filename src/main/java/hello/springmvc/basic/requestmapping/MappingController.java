package hello.springmvc.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class MappingController {
    @RequestMapping("/hello-basic") // GET, POST 등 메서드와 상관 없이 모두 매핑
    public String helloBasic() {
        log.info("helloBasic");
        return "ok";
    }

    @RequestMapping(value = "/mapping-get-v1", method = RequestMethod.GET) // GET 메서드만 매핑
    public String mappingGetV1() {
        log.info("mappingGetV1");
        return "ok";
    }

    @GetMapping("/mapping-get-v2") // GET 메서드만 매핑
    public String mappingGetV2() {
        log.info("mappingGetV1");
        return "ok";
    }

    @GetMapping("/mapping/{userId}") // GET 메서드만 매핑
    public String mappingPath(@PathVariable("userId") String userId) {
        log.info("mappingPath userId={}", userId);
        return "ok";
    }

    @GetMapping("/mapping/users/{userId}/orders/{orderId}") // GET 메서드만 매핑
    public String mappingPath(@PathVariable String userId, @PathVariable Long orderId) { // 변수 이름과 파라미터 이름이 같으면 생략 가능
        log.info("mappingPath userId={}, orderId={}", userId, orderId);
        return "ok";
    }
}
