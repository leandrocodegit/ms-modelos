package br.modelos.entidades;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
@Getter
@Setter
public class User {
    @Id
    private UUID id;
    private String email;
    private String nome;
}
