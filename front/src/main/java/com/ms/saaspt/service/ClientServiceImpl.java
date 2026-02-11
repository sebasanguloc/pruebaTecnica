package com.ms.saaspt.service;

import com.ms.saaspt.exception.EntityNotFoundException;
import com.ms.saaspt.mapper.ClientMapper;
import com.ms.saaspt.model.Client;
import com.ms.saaspt.model.dto.ClientDto;
import com.ms.saaspt.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ClientServiceImpl implements IClientService{

    private final ClientRepository clientRepository;

    @Override
    public List<ClientDto> findAll() {
        List<Client> all = clientRepository.findAll();
        return ClientMapper.toDtoList(all);
    }

    @Override
    public Client findClientById(Long id) {
        return clientRepository.findClientById(id).orElseThrow(() -> new EntityNotFoundException("client no encontrado"));
    }


}
