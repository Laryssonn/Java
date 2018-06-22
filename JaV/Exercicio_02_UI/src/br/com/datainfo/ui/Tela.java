package br.com.datainfo.ui;

import java.util.Scanner;

import br.com.datainfo.controller.UsuarioController;
import br.com.datainfo.viewmodel.UsuarioViewModel;


public class Tela {

	private static int inicio = 0;
	private static int fim = 10;
	private static Scanner teclado = new Scanner(System.in);

	public static void exibirUsuarioViewModelsCadastrados() {

		imprimirSeparadorTraco();
		int pagina = 0;
		for (int i = inicio; i < fim; i++) {
			UsuarioViewModel UsuarioViewModel = UsuarioController.retornarUsuarioViewModel(i);
			if (UsuarioViewModel != null) {
				System.out.println(String.format("|%-10d|%-44s|%-30s|", UsuarioViewModel.getCodigo(),
						UsuarioViewModel.getNome() == null ? "" : UsuarioViewModel.getNome(),
						UsuarioViewModel.getEndereco() == null ? "" : UsuarioViewModel.getEndereco()));
				pagina = i + 1;
			}
		}
		Tela.imprimirSeparadorTraco();
		System.out.println("<E> Proxima P�gina - " + "<H> Primeira P�gina - " + "<U> Ultima P�gina - <M> Menu -   "
				+ inicio + " - " + pagina + "Total: " + UsuarioController.contarCadastrados());
		String saida = "";
		saida = teclado.next();
		verificarSaida(saida);
		imprimirSeparadorTraco();
	}

	public static void verificarSaida(String saida) {
		if (saida.equalsIgnoreCase("E")) {
			if (fim <= UsuarioController.contarCadastrados()) {
				inicio += 10;
				fim += 10;
			}
			exibirUsuarioViewModelsCadastrados();
		}

		if (saida.equalsIgnoreCase("H")) {
			inicio = 0;
			fim = 10;
			exibirUsuarioViewModelsCadastrados();
		}
		if (saida.equalsIgnoreCase("U")) {
			double b = 0;
			b = UsuarioController.contarCadastrados() % 10;
			inicio = UsuarioController.contarCadastrados() - (int) b;
			fim = UsuarioController.contarCadastrados();
			exibirUsuarioViewModelsCadastrados();
		}
		if (saida.equalsIgnoreCase("M")) {
			escreverMenu();
		} else {
			System.out.println("Op��o Inv�lida");
			imprimirSeparadorTraco();
			exibirUsuarioViewModelsCadastrados();
		}
	}

	public static void alterarUsuarioViewModel() {
		Tela.exibirData();
		System.out.println("Tela: Alterar Usu�rio");
		Tela.imprimirSeparadorTraco();
		System.out.println("Digite o c�digo do UsuarioViewModel");
		int cod = teclado.nextInt();
		Tela.imprimirSeparadorTraco();
		UsuarioViewModel UsuarioViewModel = UsuarioController.buscarUsuarioViewModel(cod);
		
		if(UsuarioViewModel==null){
			System.out.println("Usu�rio n�o cadastrado");
			Tela.imprimirSeparadorTraco();
		}
		
		if (UsuarioViewModel != null) {
			System.out.println(UsuarioViewModel);
			Tela.imprimirSeparadorTraco();
			System.out.println("Alterando Dados");
			Tela.imprimirSeparadorTraco();
			cadastrarUsuarioViewModel(UsuarioViewModel);
			System.out.println(UsuarioViewModel);
			Tela.imprimirSeparadorTraco();
			System.out.println("Mensagem: 1) Voltar, 2) Confirmar");
			if (Integer.parseInt(teclado.next()) == 2) {
				UsuarioController.alterarUsuarioViewModel(cod, UsuarioViewModel);
				Tela.imprimirSeparadorTraco();

				System.out.println("Usu�rio Alterado");
				Tela.imprimirSeparadorTraco();

				System.out.println(UsuarioViewModel);
				Tela.imprimirSeparadorTraco();
			} else {
				Tela.imprimirSeparadorTraco();
				System.out.println("Opera��o cancelada");
				Tela.imprimirSeparadorTraco();
			}

		}

		escreverMenu();
	}
	
	public static void incluirUsuarioViewModel(){
		Tela.exibirData();
		System.out.println("Tela: Incluir Usu�rio");
		UsuarioViewModel UsuarioViewModel = new UsuarioViewModel();
		cadastrarUsuarioViewModel(UsuarioViewModel);
		imprimirSeparadorTraco();
		UsuarioController.incluirUsuarioViewModel(UsuarioViewModel);
		Tela.imprimirSeparadorTraco();
		System.out.println("Usu�rio Cadastrado");
		Tela.imprimirSeparadorTraco();
		System.out.println(UsuarioViewModel);
		Tela.imprimirSeparadorTraco();
		escreverMenu();
	}
	
	public static void excluirUsuarioViewModel(int op) {
		System.out.println("Digite o c�digo do UsuarioViewModel");
		int cod = teclado.nextInt();
		Tela.imprimirSeparadorTraco();

		UsuarioViewModel UsuarioViewModel = UsuarioController.buscarUsuarioViewModel(cod);
		
		if(UsuarioViewModel==null){
			System.out.println("Usu�rio n�o cadastrado");
			Tela.imprimirSeparadorTraco();
		}else {
			System.out.println("Deseja Excluir UsuarioViewModel?");
			Tela.imprimirSeparadorTraco();
			System.out.println(UsuarioViewModel);
			Tela.imprimirSeparadorTraco();
			System.out.println("Mensagem: 1) Voltar, 2) Confirmar");
			if (Integer.parseInt(teclado.next()) == 2) {
				Tela.imprimirSeparadorTraco();
				System.out.println("Usu�rio Excluido");
				Tela.imprimirSeparadorTraco();
				UsuarioController.excluirUsuarioViewModel(cod);

			} else {
				Tela.imprimirSeparadorTraco();
				System.out.println("Opera��o cancelada");
				Tela.imprimirSeparadorTraco();
			}
		}

		escreverMenu();

	}
	
	public static void consultarDados() {
		Tela.exibirData();
		System.out.println("Tela Consultar UsuarioViewModel");
		Tela.imprimirSeparadorTraco();
		System.out.println("Digite o c�digo do UsuarioViewModel");
		int cod = teclado.nextInt();
		Tela.imprimirSeparadorTraco();
		UsuarioViewModel UsuarioViewModel = UsuarioController.buscarUsuarioViewModel(cod);
		
		if(UsuarioViewModel==null){
			System.out.println("Usu�rio n�o cadastrado");
			Tela.imprimirSeparadorTraco();
		}

		if (UsuarioViewModel != null) {
			Tela.imprimirSeparadorTraco();
			System.out.println(UsuarioViewModel);
			Tela.imprimirSeparadorTraco();
		}

		escreverMenu();

	}
	public static void escreverMenu() {
		Tela.exibirData();
		System.out.println("Tela Menu Principal");
		Tela.imprimirSeparadorTraco();
		System.out.println("Menu Principal");
		Tela.imprimirSeparadorTraco();
		System.out.println("1 - Incluir Usu�rio");
		System.out.println("2 - Alterar Usu�rio");
		System.out.println("3 - Excluir Usu�rio");
		System.out.println("4 - Consultar Usu�rio");
		System.out.println("5 - Listar Usu�rios");
		System.out.println("9 - Sair do Sistema");
		System.out.print("Digite a op��o desejada:");
		int op = teclado.nextInt();
		Tela.imprimirSeparadorTraco();
		Menu.selecionarOpMenu(op);
	}


	
	
	public static UsuarioViewModel cadastrarUsuarioViewModel(UsuarioViewModel UsuarioViewModel) {
		
		teclado = new Scanner(System.in);
		System.out.println("Informe o Nome do Usu�rio");
		UsuarioViewModel.setNome(teclado.nextLine());
		System.out.println("Informe o Endere�o do Usu�rio");
		UsuarioViewModel.setEndereco(teclado.nextLine());
		teclado = new Scanner(System.in);
		System.out.println("Informe o Login do Usu�rio");
		UsuarioViewModel.setLogin(teclado.nextLine());
		System.out.println("Informe a Senha do Usu�rio");
		UsuarioViewModel.setSenha(teclado.nextLine());
		Tela.imprimirSeparadorTraco();
		
		return UsuarioViewModel;
	}

	public static void imprimirSeparadorTraco() {
		System.out.println("----------------------------------------------------------------------------------------");
	}

	public static void exibirData() {
		System.out.printf("Sistema de Coleta de Dados                            Data: %td de %<tB de %<tY %<tT\n",
				Menu.getData());
	}
}
