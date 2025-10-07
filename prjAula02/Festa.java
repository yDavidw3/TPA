package prjAula02;
import java.util.Scanner;

public class Festa {
	public static void main(String[] args) {
		Scanner ler =  new Scanner (System.in);
		
		int ConvidadoHomem, ConvidadaMulher, ConvidadoTotal, SalgadoHomem, SalgadoMulher, SalgadoTotal;
		double RefriHomem, RefriMulher, RefriTotal, Bolo;
		
		System.out.println("Olá! Seja muito bem-vindo(a) ao programa que calcula quantos salgaados, litros de refri e kilos de bolo serão necessários para sua festa.");
		
		System.out.println("Para começar, insira a quantidade de convidados homens:");
		ConvidadoHomem = ler.nextInt();
		
		System.out.println("Agora, insira a quantidade de convidadas mulheres");
		ConvidadaMulher = ler.nextInt();
		
		//Total de convidados, abaixo:
		ConvidadoTotal = ConvidadoHomem + ConvidadaMulher;
		
		SalgadoHomem = ConvidadoHomem * 10;
		
		SalgadoMulher = ConvidadaMulher * 6;
		
		//Total de salgados, abaixo:
		SalgadoTotal = SalgadoMulher + SalgadoHomem;
		
		RefriMulher = ConvidadaMulher * 600;
		
		RefriHomem = ConvidadoHomem * 800;
		
		//Total de refri, abaixo:
		RefriTotal = (RefriHomem + RefriMulher)/1000;
		
		//Total de bolo, abaixo:
		Bolo = (ConvidadoTotal * 100)/1000;
		
		System.out.println("A quantidade recomendada de salgados para compra será de --> " + SalgadoTotal);
		System.out.println("A recomendação é você comprar " + RefriTotal + "L de refrigerante.");
		System.out.println("A recomendação é você comprar " + Bolo + "KG de bolo.");
		
		ler.close();
	
	}

}
