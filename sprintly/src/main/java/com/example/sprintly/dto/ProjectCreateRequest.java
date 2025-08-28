package com.example.sprintly.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProjectCreateRequest {
    @NotBlank
    private String name;
    private String description;
    @NotNull
    private Long userId;
}
