package com.ms.saaspt.service;

import com.ms.saaspt.model.Client;
import com.ms.saaspt.model.dto.ClientDto;

import java.util.List;

public interface IClientService {

    List<ClientDto> findAll();

    Client findClientById(Long id);
}
