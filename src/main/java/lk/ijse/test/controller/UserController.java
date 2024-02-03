package lk.ijse.test.controller;

import lk.ijse.test.dto.UserDto;
import lk.ijse.test.service.UserService;
import lk.ijse.test.util.ResponseUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping()
    public ResponseUtil getTestApi(){
        return new ResponseUtil(200,"Ok........",null);
    }

    @GetMapping(path = "save")
    public ResponseUtil saveUser(@RequestBody UserDto user,@RequestHeader("Authorization") String token){


        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", token);
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<UserDto> requestEntity = new HttpEntity<>(user, headers);

        ResponseEntity<UserDto> response = restTemplate.exchange(
                "https://f7ae37eee3c540cb92b37777a225566e.weavy.io/api/users",
                HttpMethod.POST,
                requestEntity,
                UserDto.class);


        return new ResponseUtil(201,"User saved", null);
    }

}
