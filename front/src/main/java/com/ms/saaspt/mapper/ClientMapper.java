package com.ms.saaspt.mapper;

import com.ms.saaspt.model.Client;
import com.ms.saaspt.model.dto.ClientDto;

import java.util.List;
import java.util.stream.Collectors;

public class ClientMapper {

    public static ClientDto toDto(Client client) {
        if (client == null) return null;

        return new ClientDto(
                client.getId(),
                client.getName(),
                null
        );
    }

    public static List<ClientDto> toDtoList(List<Client> clients) {
        return clients.stream()
                .map(ClientMapper::toDto)
                .collect(Collectors.toList());
    }
}
