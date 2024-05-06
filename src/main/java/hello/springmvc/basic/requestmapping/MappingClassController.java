package hello.springmvc.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
@Slf4j
public class MappingClassController {
    /**
     *
     * * 회원 목록 조회: GET /users
     * * 회원 등록: POST /users
     * * 회원 조회: GET /users/{userId}
     * * 회원 수정: PATCH /users/{userId}
     * * 회원 삭제: DELETE /users/{userId}
     */

    @GetMapping
    public String users() {
        return "get users";
    }

    @PostMapping
    public String addUser() {
        return "post users";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId) {
        return "get userId";
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId) {
        return "patch userId";
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "delete userId";
    }


}
