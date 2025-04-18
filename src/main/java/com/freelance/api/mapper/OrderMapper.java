package com.freelance.api.mapper;

import com.freelance.api.dto.OrderDTO;
import com.freelance.api.entity.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDTO toDto(Order order);
    Order toEntity(OrderDTO orderDTO);
}
