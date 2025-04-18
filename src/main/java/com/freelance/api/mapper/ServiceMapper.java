package com.freelance.api.mapper;

import com.freelance.api.dto.ServiceDTO;
import com.freelance.api.entity.Service;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ServiceMapper {
    ServiceDTO toDto(Service service);
    Service toEntity(ServiceDTO serviceDTO);
}
