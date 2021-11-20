package br.com.serratec.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity (name = "endereco")
public class Endereco {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	

	@NotNull
	private String rua;
	
	@NotNull
	private String numero;
	
	@NotNull
	private String cidade;
	
	@NotNull
	private String estado;
	
	@NotNull
	private String Pais;
	
	@NotNull
	private String CEP;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public Endereco(long id, String rua, String numero, String cidade, String estado, String pais, String cEP) {
		super();
		this.id = id;
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		Pais = pais;
		CEP = cEP;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", rua=" + rua + ", numero=" + numero + ", cidade=" + cidade + ", estado="
				+ estado + ", Pais=" + Pais + ", CEP=" + CEP + "]";
	}

	
	
	
}
