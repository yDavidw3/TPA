package prjAula02;
import java.util.Scanner;

public class Produto {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int x, y, z;
		
		System.out.println("Esse programa calcula o produto entre números inteiros.");
		
		System.out.println("Insira o primeiro valor:");
		x = ler.nextInt();
		
		System.out.println("Agora, insira o segundo valor:");
		y = ler.nextInt();
		
		z = x * y;
		
		System.out.println("Resultado da multiplicação entre dois números inteiros = " + z);
		
		ler.close();
		
	}

}
