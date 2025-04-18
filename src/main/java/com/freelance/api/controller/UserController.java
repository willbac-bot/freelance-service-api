package com.freelance.api.controller;

import com.freelance.api.dto.UserDTO;
import com.freelance.api.mapper.UserMapper;
import com.freelance.api.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("v1/users")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("/findAll")
    public List<UserDTO> findAll() {
        return userService.findAll()
                .stream()
                .map(userMapper::toDto)
                .collect(Collectors.toList());
    }

    @PostMapping("/register")
    public UserDTO create(@RequestBody UserDTO dto) {
        return userMapper.toDto(
                userService.save(userMapper.toEntity(dto))
        );
    }

    // Pode adicionar outros endpoints (GET by id, PUT, DELETE etc.)
}
