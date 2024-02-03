package lk.ijse.test.controller;

import lk.ijse.test.util.ResponseUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
@CrossOrigin
@RequiredArgsConstructor
public class UserController {

    @GetMapping()
    public ResponseUtil getTestApi(){
        return new ResponseUtil(200,"Ok........",null);
    }

    @GetMapping(path = "save")

}
