package br.com.serratec.api.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.serratec.api.model.Usuario;
import br.com.serratec.api.repository.UsuarioRepository;

@Service
public class DetalhesServiceUsuario implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> usuario = usuarioRepository.findByEmail(username);
		
		usuario.orElseThrow(() -> new UsernameNotFoundException(username + " not found."));
		
		return usuario.map(DetalhesImplementacaoUsuario::new).get();
	}
	
}
