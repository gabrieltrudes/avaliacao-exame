package br.com.soc.avaliacao.teste.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import br.com.soc.avaliacao.teste.model.Exame;
import br.com.soc.avaliacao.teste.model.StatusExame;

public class RequisicaoNovoExame {

	@NotBlank
	private String nomeExame;
	
	@NotBlank @Size(min = 5, max = 8)
	private String codigoExame;
	
	@NotBlank
	private String nomeFuncionario;
	
	@NotBlank @Size(min = 5, max = 8)
	private String codigoFuncionario;
	
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
	public Exame toExame() {
		Exame exame = new Exame();
		exame.setNomeExame(nomeExame);
		exame.setCodigoExame(codigoExame);
		exame.setStatus(StatusExame.AGUARDANDO);
		exame.setNomeFuncionario(nomeFuncionario);
		exame.setCodigoFuncionario(codigoFuncionario);
		return exame;
	}
}
