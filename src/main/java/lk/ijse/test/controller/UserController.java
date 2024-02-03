package lk.ijse.test.controller;

import lk.ijse.test.dto.UserDto;
import lk.ijse.test.service.UserService;
import lk.ijse.test.util.ResponseUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseUtil getTestApi(){
        return new ResponseUtil(200,"Ok........",null);
    }

    @GetMapping(path = "save")
    public ResponseUtil saveUser(@RequestBody() UserDto user){

        return new ResponseUtil(201,"User saved", null);
    }

}
