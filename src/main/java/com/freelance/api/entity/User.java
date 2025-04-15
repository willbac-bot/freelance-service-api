package com.freelance.api.entity;

import com.freelance.api.Enum.TipoUsuario;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nome;
    private String email;
    private String senha;

    @Enumerated(EnumType.STRING)
    private TipoUsuario tipo; // CLIENTE ou PROFISSIONAL

    private String telefone;
    private String cidade;
}
