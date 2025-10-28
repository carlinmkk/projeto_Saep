package com.lojaaviamento.aviamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojaaviamento.aviamento.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
