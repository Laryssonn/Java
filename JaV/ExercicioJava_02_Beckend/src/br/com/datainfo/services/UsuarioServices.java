package br.com.datainfo.services;

import br.com.datainfo.model.Usuario;
import br.com.datainfo.repository.UsuarioRepository;


public class UsuarioServices {

	public static void alterarUsuario(int cod, Usuario usuario) {
		UsuarioRepository.alterarUsuario(cod, usuario);
	}
	
	public static Usuario retornarUsuarioViewModel(int indice) {
		return UsuarioRepository.retornarUsuario(indice);
	}

	static public void incluirUsuario(Usuario usuario) {
		UsuarioRepository.incluirUsuario(usuario);
	}

	public static void excluirUsuario(int cod) {
		UsuarioRepository.excluirUsuario(cod);
	}

	public static void cadastraUsuario(Usuario usuario) {

		UsuarioRepository.incluirUsuario(usuario);
	}

	public static Usuario buscarUsuario(int cod) {
		Usuario usuario = UsuarioRepository.buscarUsuario(cod);

		return usuario;
	}

	public static void carregarUsuario() {
		UsuarioRepository.carregarUsuario();
	}

	public static int contarCadastrados() {
		return UsuarioRepository.contarCadastrados();
	}

}
