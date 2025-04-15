package com.freelance.api.dto;

import com.freelance.api.Enum.TipoUsuario;

import java.util.UUID;

public record UserDTO(
        UUID id,
        String nome,
        String email,
        String senha,
        String telefone,
        String cidade,
        TipoUsuario tipo

) {}
