package com.evaluation.demo.controller.mapper;

import com.evaluation.demo.dto.ClientRequestDTO;
import com.evaluation.demo.dto.ClientResponseDTO;
import com.evaluation.demo.entity.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface ClientMapper extends EntityMapper<ClientResponseDTO, Client>{


    ClientResponseDTO toDto(Client entity);

    Client toEntity(ClientRequestDTO request);

}
