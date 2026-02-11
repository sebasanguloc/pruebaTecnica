package com.ms.saaspt.mapper;

import com.ms.saaspt.model.Note;
import com.ms.saaspt.model.dto.NoteDto;

import java.util.List;
import java.util.stream.Collectors;

public class NoteMapper {

    public static NoteDto toDto(Note note) {
        if (note == null) return null;

        return new NoteDto(
                note.getId(),
                note.getTitle(),
                note.getCreatedAt()
        );
    }

    public static List<NoteDto> toDtoList(List<Note> notes) {
        return notes.stream()
                .map(NoteMapper::toDto)
                .collect(Collectors.toList());
    }
}
