package com.example.sprintly.service;

import com.example.sprintly.model.User;
import com.example.sprintly.repository.UserRepository;
import com.example.sprintly.util.PasswordUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void saveAllUsers(List<User> users) {
        if (users == null || users.isEmpty()) return;
        for (User user : users) {
            log.info("Saving user {}", user.getName());
            user.setPassword(PasswordUtils.hashPasswordSHA256(user.getPassword()));
        }
        userRepository.saveAll(users);
    }

}

