package lista;
import java.util.Scanner;

public class idade {
	public static void main(String[] args) {
		 Scanner ler = new Scanner (System.in);
		int AnoNasc, AnoAtual, idade;
		
		System.out.println("Esse programa calcula sua idade");
		System.out.println("DIgite o ano atual");
		AnoAtual = ler.nextInt();
		
		System.out.println("Digite o ano de seu nascimento");
		AnoNasc = ler.nextInt();
		
		idade = AnoAtual - AnoNasc;
		
		System.out.println("Sua idade � " +idade);
		if (idade < 10) {
			System.out.println("Tu � crian�a ainda!");
		}else if (idade <18) {
			System.out.println("Adolescente. Vai estudar meu fi!!");
		}else if (idade < 60) {
			System.out.println("Adulto, J� pode trabalhar!");
		}else {
			System.out.println("Ol� senhor(a), j� precisa de um asilo, hein!");
		}
		
		
	}

}
