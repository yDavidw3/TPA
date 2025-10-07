package prjAula02;
import java.util.Scanner;

public class AntecessorSucessor {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int Valor1, Antecessor, Sucessor;
		
		System.out.println("Esse um programa que mostra o antecessor e o sucessor de um número inteiro.");
		
		System.out.println("Insira um número de sua escolha");
		Valor1 = ler.nextInt();
		
		Antecessor = Valor1 - 1;
		
		Sucessor = Valor1 + 1;
		
		System.out.println("O antecessor do número escolhido é = " + Antecessor + ". Já o sucessor do mesmo é = " + Sucessor);
		ler.close();
		
	}

}
