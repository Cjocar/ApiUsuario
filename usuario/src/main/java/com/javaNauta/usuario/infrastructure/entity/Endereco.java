package com.javaNauta.usuario.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "endereco")
public class Endereco {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "rua", length = 100)
        private String rua;

        @Column(name = "numero", length = 100)
        private String numero;

        @Column(name = "complemento", length = 100)
        private String complemento;

        @Column(name = "cidade", length = 150)
        private String cidade;

        @Column(name = "estado", length = 2)
        private String estado;

        @Column(name = "cep", length = 9)
        private String cep;



}
