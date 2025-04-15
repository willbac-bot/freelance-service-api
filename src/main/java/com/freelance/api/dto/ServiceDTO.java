package com.freelance.api.dto;

import com.freelance.api.entity.User;

import java.math.BigDecimal;
import java.util.UUID;

public record ServiceDTO(
        UUID id,
        String nome,
        String descricao,
        BigDecimal preco,
        User profissional
) {}
