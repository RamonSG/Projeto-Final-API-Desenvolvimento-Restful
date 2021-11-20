package br.com.serratec.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serratec.api.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
