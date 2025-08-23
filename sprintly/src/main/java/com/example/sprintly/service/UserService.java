package com.example.sprintly.service;

import com.example.sprintly.model.User;
import com.example.sprintly.repository.UserRepository;
import com.example.sprintly.util.PasswordUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void saveAllUsers(List<User> users) {
        if (users == null || users.isEmpty()) return;
        for (User user : users) {
            user.setPassword(PasswordUtils.hashPasswordSHA256(user.getPassword()));
        }
        userRepository.saveAll(users);
    }

}
    /**
     * Zadanie nr 1: Zwraca wszystkich użytkowników z bazy w formie mapy: ROLA -> lista UserResponse
     */
