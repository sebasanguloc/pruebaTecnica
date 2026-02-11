package com.ms.saaspt.controller;

import com.ms.saaspt.model.Client;
import com.ms.saaspt.model.dto.ClientDto;
import com.ms.saaspt.service.IClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/clients")
public class ClientController {

    public final IClientService clientService;

    @GetMapping
    public ResponseEntity<List<ClientDto>> findAll() {
        List<ClientDto> all = clientService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(all);
    }

}
