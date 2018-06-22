package Exercicio01;

import java.util.Date;


public class Menu {

	public static void selecionarOpMenu(int op) {
		switch (op) {
		case 1:
			Tela.incluirUsuario();

			break;
		case 2:
			Tela.alterarUsuario();

			break;
		case 3:
			Tela.excluirUsuario(op);

			break;
		case 4:
			Tela.consultarDados();

			break;
		case 5:
			Tela.exibirUsuariosCadastrados();

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
