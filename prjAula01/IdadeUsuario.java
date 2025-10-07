package prjAula01;

public class IdadeUsuario {
	public static void main(String[] args) {
		int DataNascimento, AnoAtual, idade;
		
		DataNascimento = 1993;
		AnoAtual = 2025;
		
		idade = AnoAtual - DataNascimento;
		
		System.out.println("Você tem " +idade);
		System.out.println("anos de idade");
	}

}
