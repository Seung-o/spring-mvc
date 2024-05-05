package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
public class MappingClassController {
    /**
     *
     * * 회원 목록 조회: GET /users
     * * 회원 등록: POST /users
     * * 회원 조회: GET /users/{userId}
     * * 회원 수정: PATCH /users/{userId}
     * * 회원 삭제: DELETE /users/{userId}
     */

    @GetMapping("/users")
    public String users() {
        return "get users";
    }

    @PostMapping("/users")
    public String addUser() {
        return "post users";
    }

    @GetMapping("/users/{userId}")
    public String findUser() {
        return "get userId";
    }

    @PatchMapping("/users/{userId}")
    public String updateUser() {
        return "patch userId";
    }

    @DeleteMapping("/users/{userId}")
    public String deleteUser() {
        return "delete userId";
    }


}
