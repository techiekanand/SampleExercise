package com.exercise.userprofile.service;

import com.exercise.userprofile.entity.User;
import com.exercise.userprofile.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User saveUser(User user) {
        log.info("inside save of UserService.");
        return userRepository.save(user);
    }

    public User findByUserId(Long userId) {
        log.info("inside findUserById of UserService.");
        return userRepository.findByUserId(userId);
    }

    public User updateUser(User user, Long userId) {
        log.info("inside updateUser of UserService.");
        User userById = findByUserId(userId);
        user.setUserId(userById.getUserId());
        return userRepository.save(user);
    }

    public void deleteUserById(Long userId) {
        log.info("inside deleteByUserId of UserService.");
        userRepository.deleteById(userId);
    }
}
