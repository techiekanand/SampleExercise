package com.exercise.userprofile.controller;

import com.exercise.userprofile.entity.User;
import com.exercise.userprofile.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        log.info("inside saveUser of UserController.");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public User findByUserId(@PathVariable("id") Long userId) {
        log.info("inside findByUserId of UserController.");
        return userService.findByUserId(userId);
    }

    @PutMapping("/{id}")
    public User updateUser(@RequestBody User user, @PathVariable("id") Long userId) {
        log.info("inside updateUser of UserController.");
        return userService.updateUser(user, userId );
    }

    @DeleteMapping("/{id}")
    public void deleteByUserId(@PathVariable("id") Long userId) {
        log.info("inside deleteByUserId of UserController.");
        userService.deleteUserById(userId);
    }

}
