package za.co.ajk.jasonreader.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.ajk.jasonreader.domain.User;
import za.co.ajk.jasonreader.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    
    private UserService userService;
    
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/list")
    public Iterable<User> list() {
        return userService.list();
    }
    
    
}
