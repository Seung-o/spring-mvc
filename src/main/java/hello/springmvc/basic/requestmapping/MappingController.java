package hello.springmvc.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
