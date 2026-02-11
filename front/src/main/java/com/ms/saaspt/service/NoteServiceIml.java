package com.ms.saaspt.service;

import com.ms.saaspt.mapper.NoteMapper;
import com.ms.saaspt.model.Client;
import com.ms.saaspt.model.Note;
import com.ms.saaspt.model.dto.NoteDto;
import com.ms.saaspt.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class NoteServiceIml implements INoteService{

    private final NoteRepository noteRepository;
    private final IClientService clientService;

    @Override
    public List<NoteDto> findNoteByClientId(Long id) {
        Client clientById = clientService.findClientById(id);
        List<Note> notesByClient = noteRepository.findNotesByClient(clientById);

        return NoteMapper.toDtoList(notesByClient);
    }
}
