package com.evaluation.demo.service;

import com.evaluation.demo.dto.ClientRequestDTO;
import com.evaluation.demo.entity.Client;

import java.util.List;

public interface ClientService {

    List<Client> findAll();
    void create(ClientRequestDTO request);

}
