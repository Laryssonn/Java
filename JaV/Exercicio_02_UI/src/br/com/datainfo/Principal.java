package br.com.datainfo;

import br.com.datainfo.controller.UsuarioController;
import br.com.datainfo.ui.Tela;

public class Principal {

	public static void main(String[] args) {
		UsuarioController.carregarUsuario();
		Tela.escreverMenu();
	}
}
