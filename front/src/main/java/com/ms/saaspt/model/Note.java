package com.ms.saaspt.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "note")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_note")
    private Long id;

    @Column(name = "title", length = 200)
    private String title;

    @Column(name = "createdAt")
    private LocalDate createdAt;

    @ManyToOne
    @JoinColumn(name = "id_client", foreignKey = @ForeignKey(name = "fk_note_client"))
    private Client client;

}

