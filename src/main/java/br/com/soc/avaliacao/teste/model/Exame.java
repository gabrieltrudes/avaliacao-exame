package br.com.soc.avaliacao.teste.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exame {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeFuncionario;
	private String codigoFuncionario;
	private String nomeExame;
	private String codigoExame;
	private LocalDate dataDoExame;
	
	@Enumerated(EnumType.STRING)
	private StatusExame status;

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(String codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public String getNomeExame() {
		return nomeExame;
	}

	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}

	public String getCodigoExame() {
		return codigoExame;
	}

	public void setCodigoExame(String codigoExame) {
		this.codigoExame = codigoExame;
	}

	public LocalDate getDataDoExame() {
		return dataDoExame;
	}

	public void setDataDoExame(LocalDate dataDoExame) {
		this.dataDoExame = dataDoExame;
	}

	public StatusExame getStatus() {
		return status;
	}

	public void setStatus(StatusExame status) {
		this.status = status;
	}
}
