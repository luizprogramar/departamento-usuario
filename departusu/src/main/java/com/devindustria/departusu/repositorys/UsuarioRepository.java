package com.devindustria.departusu.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devindustria.departusu.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
