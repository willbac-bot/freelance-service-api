package com.freelance.api.dto;

import com.freelance.api.Enum.StatusSolicitacao;
import com.freelance.api.entity.Service;
import com.freelance.api.entity.User;

import java.time.LocalDateTime;
import java.util.UUID;

public record OrderDTO(
        UUID id,
        LocalDateTime dataSolicitacao,
        User cliente,
        Service service,
        StatusSolicitacao statusSolicitacao
) {}
