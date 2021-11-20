package br.com.serratec.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.serratec.api.model.Endereco;
import br.com.serratec.api.repository.EnderecoRepository;

@RestController
public class EnderecoController {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@GetMapping  (path = "/endereco-id/{}")
	public ResponseEntity<Optional<Endereco>> buscarEnderecoPorId(@PathVariable (name = "id" , required = true) Long idEndereco) {
		return ResponseEntity.ok(enderecoRepository.findById(idEndereco));
		
	}
}
