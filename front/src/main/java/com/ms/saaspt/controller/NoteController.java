package com.ms.saaspt.controller;

import com.ms.saaspt.model.dto.NoteDto;
import com.ms.saaspt.service.INoteService;
import com.ms.saaspt.service.NoteServiceIml;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/notes")
public class NoteController {

    private final INoteService noteService;

    @GetMapping("/{clientId}")
    public ResponseEntity<List<NoteDto>> notesById(@PathVariable Long clientId) {
        List<NoteDto> noteByClientId = noteService.findNoteByClientId(clientId);
        return ResponseEntity.status(HttpStatus.OK).body(noteByClientId);
    }

}
