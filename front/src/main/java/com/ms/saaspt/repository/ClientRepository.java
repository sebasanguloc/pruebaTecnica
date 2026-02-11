package com.ms.saaspt.repository;

import com.ms.saaspt.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Override
    List<Client> findAll();

   Optional<Client> findClientById(Long id);
}
