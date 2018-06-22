package Exercicio01;

import java.util.Scanner;

public class Usuario {
	private String nome;
	private  int codigo;
	private String login;
	private String endereco;
	private String senha;

	

	public Usuario() {
		
	}

	public Usuario(String nome,int cod,String login, String endereco, String senha) {
		this.nome = nome;
		this.login = login;
		this.endereco = endereco;
		this.senha = senha;
		this.codigo  = codigo;
		
	}

	@Override
	public String toString() {
		String s = "Nome: " + nome;
		s += "\nCódigo: " + codigo;
		s += "\nLogin: " + login;
		s += "\nEndereço: " + endereco;
		s += "\nSenha: " + senha;

		return s;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
