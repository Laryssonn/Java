package Exercicio01;

import java.util.Scanner;

public class Tela {

	private static int inicio = 0;
	private static int fim = 10;
	private static Scanner teclado = new Scanner(System.in);

	public static void exibirUsuariosCadastrados() {

		imprimirSeparadorTraco();
		int pagina = 0;
		for (int i = inicio; i < fim; i++) {
			Usuario usuario = UsuarioRepository.retornarUsuario(i);
			if (usuario != null) {
				System.out.println(String.format("|%-10d|%-44s|%-30s|", usuario.getCodigo(),
						usuario.getNome() == null ? "" : usuario.getNome(),
						usuario.getEndereco() == null ? "" : usuario.getEndereco()));
				pagina = i + 1;
			}
		}
		Tela.imprimirSeparadorTraco();
		System.out.println("<E> Proxima P�gina - " + "<H> Primeira P�gina - " + "<U> Ultima P�gina - <M> Menu -   "
				+ inicio + " - " + pagina + "Total: " + UsuarioRepository.contarCadastrados());
		String saida = "";
		saida = teclado.next();
		verificarSaida(saida);
		imprimirSeparadorTraco();
	}

	public static void verificarSaida(String saida) {
		if (saida.equalsIgnoreCase("E")) {
			if (fim <= UsuarioRepository.contarCadastrados()) {
				inicio += 10;
				fim += 10;
			}
			exibirUsuariosCadastrados();
		}

		if (saida.equalsIgnoreCase("H")) {
			inicio = 0;
			fim = 10;
			exibirUsuariosCadastrados();
		}
		if (saida.equalsIgnoreCase("U")) {
			double b = 0;
			b = UsuarioRepository.contarCadastrados() % 10;
			inicio = UsuarioRepository.contarCadastrados() - (int) b;
			fim = UsuarioRepository.contarCadastrados();
			exibirUsuariosCadastrados();
		}
		if (saida.equalsIgnoreCase("M")) {
			escreverMenu();
		} else {
			System.out.println("Op��o Inv�lida");
			imprimirSeparadorTraco();
			exibirUsuariosCadastrados();
		}
	}

	public static void alterarUsuario() {
		Tela.exibirData();
		System.out.println("Tela: Alterar Usu�rio");
		Tela.imprimirSeparadorTraco();
		System.out.println("Digite o c�digo do Usuario");
		int cod = teclado.nextInt();
		Tela.imprimirSeparadorTraco();
		Usuario usuario = UsuarioController.buscarUsuario(cod);
		
		if(usuario==null){
			System.out.println("Usu�rio n�o cadastrado");
			Tela.imprimirSeparadorTraco();
		}
		
		if (usuario != null) {
			System.out.println(usuario);
			Tela.imprimirSeparadorTraco();
			System.out.println("Alterando Dados");
			Tela.imprimirSeparadorTraco();
			cadastrarUsuario(usuario);
			System.out.println(usuario);
			Tela.imprimirSeparadorTraco();
			System.out.println("Mensagem: 1) Voltar, 2) Confirmar");
			if (Integer.parseInt(teclado.next()) == 2) {
				UsuarioController.alterarUsuario(cod, usuario);
				Tela.imprimirSeparadorTraco();

				System.out.println("Usu�rio Alterado");
				Tela.imprimirSeparadorTraco();

				System.out.println(usuario);
				Tela.imprimirSeparadorTraco();
			} else {
				Tela.imprimirSeparadorTraco();
				System.out.println("Opera��o cancelada");
				Tela.imprimirSeparadorTraco();
			}

		}

		escreverMenu();
	}
	
	public static void incluirUsuario(){
		Tela.exibirData();
		System.out.println("Tela: Incluir Usu�rio");
		Usuario usuario = new Usuario();
		cadastrarUsuario(usuario);
		imprimirSeparadorTraco();
		UsuarioController.incluirUsuario(usuario);
		Tela.imprimirSeparadorTraco();
		System.out.println("Usu�rio Cadastrado");
		Tela.imprimirSeparadorTraco();
		System.out.println(usuario);
		Tela.imprimirSeparadorTraco();
		escreverMenu();
	}
	
	public static void excluirUsuario(int op) {
		System.out.println("Digite o c�digo do Usuario");
		int cod = teclado.nextInt();
		Tela.imprimirSeparadorTraco();

		Usuario usuario = UsuarioController.buscarUsuario(cod);
		
		if(usuario==null){
			System.out.println("Usu�rio n�o cadastrado");
			Tela.imprimirSeparadorTraco();
		}else {
			System.out.println("Deseja Excluir Usuario?");
			Tela.imprimirSeparadorTraco();
			System.out.println(usuario);
			Tela.imprimirSeparadorTraco();
			System.out.println("Mensagem: 1) Voltar, 2) Confirmar");
			if (Integer.parseInt(teclado.next()) == 2) {
				Tela.imprimirSeparadorTraco();
				System.out.println("Usu�rio Excluido");
				Tela.imprimirSeparadorTraco();
				UsuarioController.excluirUsuario(cod);

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
		System.out.println("Tela Consultar Usuario");
		Tela.imprimirSeparadorTraco();
		System.out.println("Digite o c�digo do Usuario");
		int cod = teclado.nextInt();
		Tela.imprimirSeparadorTraco();
		Usuario usuario = UsuarioController.buscarUsuario(cod);
		
		if(usuario==null){
			System.out.println("Usu�rio n�o cadastrado");
			Tela.imprimirSeparadorTraco();
		}

		if (usuario != null) {
			Tela.imprimirSeparadorTraco();
			System.out.println(usuario);
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


	
	
	public static Usuario cadastrarUsuario(Usuario usuario) {
		
		teclado = new Scanner(System.in);
		System.out.println("Informe o Nome do Usu�rio");
		usuario.setNome(teclado.nextLine());
		System.out.println("Informe o Endere�o do Usu�rio");
		usuario.setEndereco(teclado.nextLine());
		teclado = new Scanner(System.in);
		System.out.println("Informe o Login do Usu�rio");
		usuario.setLogin(teclado.nextLine());
		System.out.println("Informe a Senha do Usu�rio");
		usuario.setSenha(teclado.nextLine());
		Tela.imprimirSeparadorTraco();
		
		return usuario;
	}

	public static void imprimirSeparadorTraco() {
		System.out.println("----------------------------------------------------------------------------------------");
	}

	public static void exibirData() {
		System.out.printf("Sistema de Coleta de Dados                            Data: %td de %<tB de %<tY %<tT\n",
				Menu.getData());
	}
}
