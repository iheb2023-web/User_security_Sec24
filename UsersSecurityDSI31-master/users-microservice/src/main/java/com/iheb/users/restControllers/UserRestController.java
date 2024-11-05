package com.iheb.users.restControllers;

import com.iheb.users.entities.User;
import com.iheb.users.service.UserService;
import com.iheb.users.service.register.RegistationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserRestController {
    @Autowired
    UserService userService;
    @GetMapping("all")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @PostMapping("/register")
    public  User register(@RequestBody RegistationRequest request){
        return  userService.registerUser(request);
    }

    @GetMapping("/verifyEmail/{token}")
    public User verifyEmail(@PathVariable("token") String token){
        return userService.validateToken(token);
    }
}
