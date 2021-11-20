package br.com.serratec.api.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.serratec.api.model.Endereco;
import br.com.serratec.api.repository.EnderecoRepository;

public class CadastroEndereco {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public void cadastro(Endereco endereco) {
		enderecoRepository.saveAndFlush(endereco);
	}

}
