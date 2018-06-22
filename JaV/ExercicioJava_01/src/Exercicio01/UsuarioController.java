package Exercicio01;

public class UsuarioController {

	public static void alterarUsuario(int cod,Usuario usuario) {
		UsuarioRepository.alterarUsuario(cod, usuario);
	}

	static public void incluirUsuario(Usuario usuario) {		
		UsuarioRepository.incluirUsuario(usuario);
	}

	public static void excluirUsuario(int cod) {
		UsuarioRepository.excluirUsuario(cod);
	}

	public static void cadastraUsuario(Usuario usuario){

		UsuarioRepository.incluirUsuario(usuario);
	}

	public static Usuario buscarUsuario(int cod) {
		Usuario usuario = UsuarioRepository.buscarUsuario(cod);

		return usuario;
	}

}
