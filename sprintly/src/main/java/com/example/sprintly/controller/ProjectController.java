package com.example.sprintly.controller;

import com.example.sprintly.dto.ProjectCreateRequest;
import com.example.sprintly.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public HttpStatus createProject(@Valid @RequestBody ProjectCreateRequest request) {

        //Todo: projectService.createProject(request);

        return HttpStatus.CREATED;
    }
}