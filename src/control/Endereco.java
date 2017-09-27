package control;

import java.io.DataInput;
import java.io.IOException;
import java.nio.charset.Charset;

public class Endereco implements Comparable<Endereco>{
	
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String sigla;
	private String cep;
	
	public int getNumCep() {
		
		String trimCep = this.cep.trim();
		Integer numCep = 0;
		try {
			numCep = Integer.parseInt(trimCep);
		} catch (NumberFormatException e) {
			System.out.println("### " +this.cep + " ###");
		}
		
		return numCep;
	}

	public Endereco(String logradouro, String bairro, String cidade, String estado, String sigla, String cep) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.sigla = sigla;
		this.cep = cep;
	}
	
	public String toString() {
		return logradouro + " " + bairro + " " + cidade + " " + estado + " " + sigla + " " + cep;
		
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getBairro() {
		return bairro;
	}
			
	public void setBairro(String bairro) {
		this.bairro = bairro;
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
	
	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public int compareTo(Endereco outroEndereco) {
        if (this.getNumCep() < outroEndereco.getNumCep()) {
            return -1;
        }
        if (this.getNumCep() > outroEndereco.getNumCep()) {
            return 1;
        }
        return 0;
    }

}