package com.example.springini;

import com.example.springini.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @PostMapping("/user")
    public User insertUser(User user) {
        System.out.println("user add");
        return user;
    }

    @GetMapping("/user")
    public List<User> findAll(){
        System.out.println("find all");
        User user1 = new User(1001,"aaa","bbb");
        User user2 = new User(1002,"ccc","ddd");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        return list;
    }
}
