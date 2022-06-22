package com.devindustria.departusu.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devindustria.departusu.entity.Usuario;
import com.devindustria.departusu.repositorys.UsuarioRepository;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioControler {
	
	@Autowired
	private UsuarioRepository repo;
	
	@GetMapping
	public List<Usuario> findAll(){
		List<Usuario> resu = repo.findAll();
		   return resu;
		
	}
	
	@GetMapping(value = "/{id}")
	public Usuario findById(@PathVariable Long id){
		Usuario resu = repo.findById(id).get();
		   return resu;
	}
}
