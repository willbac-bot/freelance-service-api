package com.freelance.api.service;

import com.freelance.api.entity.Order;

import java.util.List;
import java.util.UUID;

public interface OrderService {
    List<Order> findAll();
    Order findById(UUID id);
//    Order findByUserId(UUID id);
    Order save(Order order);
    void delete(UUID id);
}
