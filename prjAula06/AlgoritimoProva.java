package prjAula06;
import java.util.Scanner;

public class AlgoritimoProva {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double n1, n2, n3, n4, mi, nm, ex;
		
		System.out.println("Vamos calcular a média das notas de um(a) aluno(a).");
		
		System.out.println("Digite a primeira nota:");
		n1 = ler.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		n2 = ler.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		n3 = ler.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		n4 = ler.nextDouble();
		
		mi = (n1 + n2 + n3+ n4)/4;
		
		System.out.println("Média do(a) aluno(a) = " + mi);
		
		if (mi >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Exame");
		}
		
		System.out.println("Apresente a nota do exame:");
		ex = ler.nextDouble();
		
		nm = (mi + ex)/2;
		
		System.out.println("Nova média do(a) aluno(a) = " + nm);
		
		if (nm >= 7) {
		System.out.println("Aprovado em exame");
		}else {
			System.out.println("Reprovado em exame");
		}
		
		ler.close();
	}
}