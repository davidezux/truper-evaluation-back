package com.evaluation.demo.controller;

import com.evaluation.demo.controller.mapper.ClientMapper;
import com.evaluation.demo.dto.ClientRequestDTO;
import com.evaluation.demo.dto.ClientResponseDTO;
import com.evaluation.demo.entity.Client;
import com.evaluation.demo.service.ClientService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Tag(name = "Clients", description = "Clients management APIs")
@RestController
@RequestMapping("/client")
@CrossOrigin(origins = "http://localhost:4200/")
@RequiredArgsConstructor
@Slf4j
public class ClientController implements Serializable {

    @Serial
    private static final long serialVersionUID = 5625234452831491650L;

    private final ClientService clientService;
    private final ClientMapper mapper;



    @GetMapping
    @Operation(description = "Find All clients")
    public ResponseEntity<List<ClientResponseDTO>> findAll(){
        return ResponseEntity.ok(mapper.toDto(clientService.findAll()));
    }

    @PostMapping
    @Operation(description = "Create a client")
    public ResponseEntity<Client> create(@RequestBody ClientRequestDTO request){
        clientService.create(request);
        return ResponseEntity.ok(null);
    }

}
