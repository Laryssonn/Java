package br.com.datainfo.repository;

import java.util.ArrayList;

import br.com.datainfo.model.Usuario;

public class UsuarioRepository {
	private static ArrayList<Usuario> usuarios = new ArrayList<>();

	public static void carregarUsuario() {
		usuarios.add(new Usuario("Larysson", 1, "Larysson_cb", "Rua 25", "52912"));
		usuarios.add(new Usuario("Luiz", 2, "Lauiz@10", "Rua 28", "545612"));
		usuarios.add(new Usuario("Luiza", 3, "Lauiza@580", "Rua 28", "47111"));
		usuarios.add(new Usuario("Laura", 4, "Laura@5454", "Rua 48", "55844"));
		usuarios.add(new Usuario("Larysson", 5, "Larysson_cb", "Rua 25", "52912"));
		usuarios.add(new Usuario("Luiz", 6, "Lauiz@10", "Rua 28", "545612"));
		usuarios.add(new Usuario("Luiza", 7, "Lauiza@580", "Rua 28", "47111"));
		usuarios.add(new Usuario("Laura", 8, "Laura@5454", "Rua 48", "55844"));
		usuarios.add(new Usuario("Larysson", 9, "Larysson_cb", "Rua 25", "52912"));
		usuarios.add(new Usuario("Luiz", 10, "Lauiz@10", "Rua 28", "545612"));
		usuarios.add(new Usuario("Luiza", 11, "Lauiza@580", "Rua 28", "47111"));
		usuarios.add(new Usuario("Laura", 12, "Laura@5454", "Rua 48", "55844"));
		usuarios.add(new Usuario("Larysson", 13, "Larysson_cb", "Rua 25", "52912"));
		usuarios.add(new Usuario("Luiz", 14, "Lauiz@10", "Rua 28", "545612"));
		usuarios.add(new Usuario("Luiza", 15, "Lauiza@580", "Rua 28", "47111"));
		usuarios.add(new Usuario("Laura", 16, "Laura@5454", "Rua 48", "55844"));
		usuarios.add(new Usuario("Luiza", 17, "Lauiza@580", "Rua 28", "47111"));
		usuarios.add(new Usuario("Laura", 18, "Laura@5454", "Rua 48", "55844"));
		usuarios.add(new Usuario("Larysson", 19, "Larysson_cb", "Rua 25", "52912"));
		usuarios.add(new Usuario("Luiz", 20, "Lauiz@10", "Rua 28", "545612"));
		usuarios.add(new Usuario("Luiza", 21, "Lauiza@580", "Rua 28", "47111"));
		usuarios.add(new Usuario("Laura", 22, "Laura@5454", "Rua 48", "55844"));
		usuarios.add(new Usuario("Luiza", 23, "Lauiza@580", "Rua 28", "47111"));
		usuarios.add(new Usuario("Laura", 24, "Laura@5454", "Rua 48", "55844"));
		usuarios.add(new Usuario("Larysson", 25, "Larysson_cb", "Rua 25", "52912"));
		usuarios.add(new Usuario("Luiz", 26, "Lauiz@10", "Rua 28", "545612"));
		usuarios.add(new Usuario("Luiza", 27, "Lauiza@580", "Rua 28", "47111"));
		usuarios.add(new Usuario("Laura", 28, "Laura@5454", "Rua 48", "55844"));
		usuarios.add(new Usuario("Luiza", 29, "Lauiza@580", "Rua 28", "47111"));
		usuarios.add(new Usuario("Laura", 30, "Laura@5454", "Rua 48", "55844"));
		usuarios.add(new Usuario("Larysson", 31, "Larysson_cb", "Rua 25", "52912"));

	}

	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public static int contarCadastrados() {

		return usuarios.size();
	}

	public static Usuario buscarUsuario(int cod) {
		for (int x = 0; x < usuarios.size(); x++) {
			if (usuarios.get(x).getCodigo() == cod) {
				cod = x;
				return usuarios.get(x);
			}

		}

		return null;
	}

	public static void excluirUsuario(int indice) {
		usuarios.remove(buscarUsuario(indice));
	}

	public static void alterarUsuario(int indice, Usuario usuario) {
		usuarios.set(usuarios.indexOf(buscarUsuario(indice)), usuario);

	}

	static public void incluirUsuario(Usuario usuario) {
		usuarios.add(usuario);
		usuario.setCodigo(usuarios.size());

	}
	static public Usuario retornarUsuario(int indice){
		return usuarios.get(indice);
	}
}
