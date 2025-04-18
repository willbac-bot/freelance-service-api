package com.freelance.api.entity;

import com.freelance.api.Enum.StatusSolicitacao;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "orders")
public class Order {
    public Order() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    private User cliente;
    @ManyToOne
    private Service service;
    private LocalDateTime dataSolicitacao;
    StatusSolicitacao statusSolicitacao;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public User getCliente() {
        return cliente;
    }

    public void setCliente(User cliente) {
        this.cliente = cliente;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public LocalDateTime getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDateTime dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public StatusSolicitacao getStatusSolicitacao() {
        return statusSolicitacao;
    }

    public void setStatusSolicitacao(StatusSolicitacao statusSolicitacao) {
        this.statusSolicitacao = statusSolicitacao;
    }
}
