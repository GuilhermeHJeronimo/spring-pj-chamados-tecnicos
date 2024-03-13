package br.com.fiap.springpjchamadostecnicos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "TB_SOLICITANTE")
public class Solicitante {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ENDERECO")
    @SequenceGenerator(
            name = "SQ_SOLICITANTE",
            sequenceName = "SQ_SOLICITANTE",
            allocationSize = 1
    )
    @Column(name = "ID_DSOLICITANTE")
private Long id;

private String nome;
}
