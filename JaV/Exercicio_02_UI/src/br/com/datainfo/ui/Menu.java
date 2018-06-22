package br.com.datainfo.ui;

import java.util.Date;


public class Menu {

	public static void selecionarOpMenu(int op) {
		switch (op) {
		case 1:
			Tela.incluirUsuarioViewModel();

			break;
		case 2:
			Tela.alterarUsuarioViewModel();

			break;
		case 3:
			Tela.excluirUsuarioViewModel(op);

			break;
		case 4:
			Tela.consultarDados();

			break;
		case 5:
			Tela.exibirUsuarioViewModelsCadastrados();

			break;
		case 9:
			
			break;
			
		default:
			System.out.println("Opção Inválida");
			Tela.imprimirSeparadorTraco();
			Tela.escreverMenu();
			Tela.imprimirSeparadorTraco();
		}
	}

	public static Date getData() {
		return new Date();
	}
}
