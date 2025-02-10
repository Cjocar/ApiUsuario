package com.javaNauta.usuario.infrastructure.repository;

import com.javaNauta.usuario.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EnderecoRepository extends JpaRepository<Endereco,Long> {

}
