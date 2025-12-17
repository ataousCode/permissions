package com.almousleck.mapper;

import com.almousleck.dtos.CreateUserRequest;
import com.almousleck.dtos.UserResponse;
import com.almousleck.models.Role;
import com.almousleck.models.User;

import java.util.stream.Collectors;

public class UserMapper {

    public static User toEntity(CreateUserRequest request) {
        User user = new User();
        user.setEmail(request.email());
        user.setPassword(request.password());
        user.setEnabled(true);
        return user;
    }

    public static UserResponse toDTO(User user) {
        return new UserResponse(
                user.getEmail(),
                user.isEnabled(),
                user.getCreatedAt(),
                user.getUpdatedAt(),
                user.getRoles().stream()
                        .map(Role::getName)
                        .collect(Collectors.toSet())
        );
    }
}
