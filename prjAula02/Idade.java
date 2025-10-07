package prjAula02;
import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int AnoNasc, AnoAtual, idade;
		
		System.out.println("Digite o ano atual:");
		AnoAtual = ler.nextInt();
		
		System.out.println("Digite o ano de seu nascimento:");
		AnoNasc = ler.nextInt();
		
		idade = AnoAtual - AnoNasc;
		
		System.out.println("Você fez ou vai fazer " + idade + " anos");
		ler.close();
	}

}
