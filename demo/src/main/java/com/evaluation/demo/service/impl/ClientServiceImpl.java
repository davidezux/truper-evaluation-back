package com.evaluation.demo.service.impl;

import com.evaluation.demo.controller.mapper.ClientMapper;
import com.evaluation.demo.dto.ClientRequestDTO;
import com.evaluation.demo.entity.Client;
import com.evaluation.demo.repository.ClientRepository;
import com.evaluation.demo.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository repository;
    private final ClientMapper mapper;

    @Override
    public List<Client> findAll() {
        return repository.findAll();
    }

    @Override
    public void create(ClientRequestDTO request) {
        Client client = mapper.toEntity(request);
        repository.save(client);

    }
    

}
