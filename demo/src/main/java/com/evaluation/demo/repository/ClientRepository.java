package com.evaluation.demo.repository;

import com.evaluation.demo.entity.Client;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

    @Override
    List<Client> findAll();

}
