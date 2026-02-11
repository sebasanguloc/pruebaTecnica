package com.ms.saaspt.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {

    private Long id;
    private String name;
    private List<NoteDto> notes;

}
