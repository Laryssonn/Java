package Exercicio01;

public class UsuarioRepository {
	private static Usuario[] usuarios = new Usuario[100];

	public static void carregarUsuario() {
		usuarios[0] = new Usuario("Larysson",1, "Larysson_cb", "Rua 25", "52912");
		usuarios[1] = new Usuario("Luiz", 2 ,"Lauiz@10", "Rua 28", "545612");
		usuarios[2] = new Usuario("Luiza", 3, "Lauiza@580", "Rua 28", "47111");
		usuarios[3] = new Usuario("Laura", 4, "Laura@5454", "Rua 48", "55844");
		usuarios[4] = new Usuario("Larysson",5,"Larysson_cb", "Rua 25", "52912");
		usuarios[5] = new Usuario("Luiz", 6,"Lauiz@10", "Rua 28", "545612");
		usuarios[6] = new Usuario("Luiza",7,  "Lauiza@580", "Rua 28", "47111");
		usuarios[7] = new Usuario("Laura", 8,"Laura@5454", "Rua 48", "55844");
		usuarios[8] = new Usuario("Larysson", 9,"Larysson_cb", "Rua 25", "52912");
		usuarios[9] = new Usuario("Luiz",10,  "Lauiz@10", "Rua 28", "545612");
		usuarios[10] = new Usuario("Luiza",11,  "Lauiza@580", "Rua 28", "47111");
		usuarios[11] = new Usuario("Laura", 12, "Laura@5454", "Rua 48", "55844");
		usuarios[12] = new Usuario("Larysson", 13,"Larysson_cb", "Rua 25", "52912");
		usuarios[13] = new Usuario("Luiz",14,  "Lauiz@10", "Rua 28", "545612");
		usuarios[14] = new Usuario("Luiza",15, "Lauiza@580", "Rua 28", "47111");
		usuarios[15] = new Usuario("Laura",16,  "Laura@5454", "Rua 48", "55844");
		usuarios[16] = new Usuario("Luiza", 17,"Lauiza@580", "Rua 28", "47111");
		usuarios[17] = new Usuario("Laura", 18, "Laura@5454", "Rua 48", "55844");
		usuarios[18] = new Usuario("Larysson",19, "Larysson_cb", "Rua 25", "52912");
		usuarios[19] = new Usuario("Luiz",20,  "Lauiz@10", "Rua 28", "545612");
		usuarios[20] = new Usuario("Luiza", 21,"Lauiza@580", "Rua 28", "47111");
		usuarios[21] = new Usuario("Laura",22,  "Laura@5454", "Rua 48", "55844");
		usuarios[22] = new Usuario("Luiza",23, "Lauiza@580", "Rua 28", "47111");
		usuarios[23] = new Usuario("Laura", 24, "Laura@5454", "Rua 48", "55844");
		usuarios[24] = new Usuario("Larysson",25, "Larysson_cb", "Rua 25", "52912");
		usuarios[25] = new Usuario("Luiz", 26, "Lauiz@10", "Rua 28", "545612");
		usuarios[26] = new Usuario("Luiza", 27,"Lauiza@580", "Rua 28", "47111");
		usuarios[27] = new Usuario("Laura",28,  "Laura@5454", "Rua 48", "55844");
		usuarios[28] = new Usuario("Luiza",29, "Lauiza@580", "Rua 28", "47111");
		usuarios[29] = new Usuario("Laura",30,  "Laura@5454", "Rua 48", "55844");
		usuarios[30] = new Usuario("Larysson",  31,"Larysson_cb", "Rua 25", "52912");

	}

	public static Usuario[] getUsuarios() {
		return usuarios;
	}

	public static int contarCadastrados() {
		int cont = 0;
		for (int x = 0; x < usuarios.length; x++) {
			if (usuarios[x] != null) {
				cont++;
			}
		}
		return cont;
	}

	public static Usuario buscarUsuario(int cod) {
		for (int x = 0; x < usuarios.length; x++) {
			if (usuarios[x] != null) {
				if (usuarios[x].getCodigo() == cod) {
					cod = x;
					return usuarios[x];
				}
			}
		}

		return null;
	}

	public static void excluirUsuario(int indice) {
		usuarios[indice] = null;
	}

	public static void alterarUsuario(int indice, Usuario usuario) {
		usuarios[indice] = usuario;

	}
	public static Usuario retornarUsuario(int indice){
		return usuarios[indice];
	}
	
	static public void incluirUsuario(Usuario usuario) {
		
		
		for (int x = 0; x < usuarios.length; x++) {
			if (usuarios[x] == null) {
				usuarios[x] = usuario;
				usuarios[x].setCodigo(x+1);
				break;
			}
		}

	}
}
