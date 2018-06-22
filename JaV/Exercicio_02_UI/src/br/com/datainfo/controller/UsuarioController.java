package br.com.datainfo.controller;

import br.com.datainfo.model.Usuario;
import br.com.datainfo.services.UsuarioServices;
import br.com.datainfo.viewmodel.UsuarioViewModel;

public class UsuarioController {
	public static void carregarUsuario() {
		UsuarioServices.carregarUsuario();
	}

	public static UsuarioViewModel retornarUsuarioViewModel(int indice) {
		return makeUsuarioToUsuarioViewModel(UsuarioServices.retornarUsuarioViewModel(indice));
	}

	public static int contarCadastrados() {
		return UsuarioServices.contarCadastrados();
	}

	public static UsuarioViewModel buscarUsuarioViewModel(int cod) {
		return makeUsuarioToUsuarioViewModel(UsuarioServices.buscarUsuario(cod));
	}

	public static void alterarUsuarioViewModel(int cod, UsuarioViewModel usuarioViewModel) {
		UsuarioServices.alterarUsuario(cod, makeUsuarioViewModelToUsuario(usuarioViewModel));
	}

	public static void incluirUsuarioViewModel(UsuarioViewModel usuarioViewModel) {
		UsuarioServices.incluirUsuario(makeUsuarioViewModelToUsuario(usuarioViewModel));
	}

	public static void excluirUsuarioViewModel(int cod) {
		UsuarioServices.excluirUsuario(cod);
	}

	private static UsuarioViewModel makeUsuarioToUsuarioViewModel(Usuario usuario) {
		if(usuario == null){
			return null;
		}
		UsuarioViewModel usuarioViewModel = new UsuarioViewModel();
		usuarioViewModel.setCodigo(usuario.getCodigo());
		usuarioViewModel.setNome(usuario.getNome());
		usuarioViewModel.setLogin(usuario.getLogin());
		usuarioViewModel.setEndereco(usuario.getEndereco());
		usuarioViewModel.setSenha(usuario.getSenha());
		return usuarioViewModel;
	}

	private static Usuario makeUsuarioViewModelToUsuario(UsuarioViewModel usuarioViewModel) {
		Usuario usuario = new Usuario();
		if(usuarioViewModel == null){
			return usuario;
		}
		usuario.setCodigo(usuarioViewModel.getCodigo());
		usuario.setNome(usuarioViewModel.getNome());
		usuario.setLogin(usuarioViewModel.getLogin());
		usuario.setEndereco(usuarioViewModel.getEndereco());
		usuario.setSenha(usuarioViewModel.getSenha());
		return usuario;
	}
}