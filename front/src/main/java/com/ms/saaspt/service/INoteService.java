package com.ms.saaspt.service;

import com.ms.saaspt.model.Client;
import com.ms.saaspt.model.dto.NoteDto;

import java.util.List;

public interface INoteService {

    List<NoteDto> findNoteByClientId(Long id);

}
