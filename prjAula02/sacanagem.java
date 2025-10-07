package prjAula02;
import java.util.Scanner;

public class sacanagem {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		String nome;
		int  idade;
		
		System.out.println("Digite seu nome:");
		nome = ler.next();
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		System.out.println( nome +  ", PARABÉNS!!! VOCÊ TEM " + idade + " ANOS");
		
		ler.close();
	}

}
