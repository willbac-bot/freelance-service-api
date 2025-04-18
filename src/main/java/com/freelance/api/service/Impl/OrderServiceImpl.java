package com.freelance.api.service.Impl;

import com.freelance.api.entity.Order;
import com.freelance.api.repository.OrderRepository;
import com.freelance.api.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(UUID id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }

//    @Override
//    public Order findByUserId(UUID id) {
//        return orderRepository.findByUserId(id)
//                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
//    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void delete(UUID id) {
        orderRepository.deleteById(id);
    }
}
