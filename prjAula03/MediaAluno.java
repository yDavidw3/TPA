package prjAula03;
import java.util.Scanner;

public class MediaAluno {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Esse programa calcula a média do aluno. São necessárias 4 notas.");
		

		System.out.println("Digite as notas, uma seguida da outra:");
		nota1 = ler.nextDouble();
		nota2 = ler.nextDouble();
		nota3 = ler.nextDouble();
		nota4 = ler.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("A média do aluno é --> ." + media);
		ler.close();
		
	}

}
