package com.example.sprintly.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping()
    private HttpStatus createUser() {
        return HttpStatus.METHOD_NOT_ALLOWED;
    }

    @PutMapping
    private HttpStatus updateUser() {
        return HttpStatus.METHOD_NOT_ALLOWED;
    }

    @DeleteMapping
    private HttpStatus deleteUser() {
        return HttpStatus.METHOD_NOT_ALLOWED;
    }
}
