package com.javaNauta.usuario.infrastructure.repository;

import com.javaNauta.usuario.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    boolean existsByEmail(String email);

    Optional<Usuario> findByEmail(String mail);

    @Transactional
    void deleteByEmail(String email);
}
