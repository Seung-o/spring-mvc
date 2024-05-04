package hello.springmvc.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
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

    /**
     * PathVariable 다중 사용
     * @param userId
     * @param orderId
     * @return
     */
    @GetMapping("/mapping/users/{userId}/orders/{orderId}") // GET 메서드만 매핑
    public String mappingPath(@PathVariable String userId, @PathVariable Long orderId) { // 변수 이름과 파라미터 이름이 같으면 생략 가능
        log.info("mappingPath userId={}, orderId={}", userId, orderId);
        return "ok";
    }

    /**
     * 파라미터로 추가 매핑
     * 특정 파라미터가 있어야만 호출되도록 설정
     * params="mode"
     * params="!mode"
     * params="mode=debug"
     * params="mode!=debug"
     * params={"mode=debug", "data=good"}
     */
    @GetMapping(value = "/mapping-param", params = "mode=debug") // GET 메서드만 매핑
    public String mappingParam() {
        log.info("mappingParam");
        return "ok";
    }

    /**
     * 특정 헤더로 추가 매핑
     */
    @GetMapping(value = "/mapping-header", headers = "mode=debug") // GET 메서드만 매핑
    public String mappingHeader() {
        log.info("mappingHeader");
        return "ok";
    }

    /**
     * 미디어 타입 조건 매핑
     */
    @PostMapping(value = "/mapping-consume", consumes = MediaType.APPLICATION_JSON_VALUE) // POST 메서드만 매핑
    public String mappingConsumes() {
        log.info("mappingConsumes");
        return "ok";
    }

    /**
     * Accept 헤더 기반 매핑
     */
    @PostMapping(value = "/mapping-produce", produces = MediaType.TEXT_HTML_VALUE) // POST 메서드만 매핑
    public String mappingProduces() {
        log.info("mappingProduces");
        return "ok";
    }
}
