package com.freelance.api.mapper;

import com.freelance.api.dto.UserDTO;
import com.freelance.api.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDto(User user);
    User toEntity(UserDTO userDTO);
}
