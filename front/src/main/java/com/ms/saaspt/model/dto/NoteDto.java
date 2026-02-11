package com.ms.saaspt.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteDto {

    private Long id;
    private String title;
    private LocalDate createdAt;

}
