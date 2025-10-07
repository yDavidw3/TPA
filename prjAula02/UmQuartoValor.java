package prjAula02;
import java.util.Scanner;

public class UmQuartoValor {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double v1, nv;
		
		System.out.println("Esse é um programa que apresenta apenas 1/4 do valor lido.");
		
		System.out.println("Insira um valor de preferência:");
		v1 = ler.nextDouble();
		
		nv = v1 * 0.25;
		
		System.out.println("1/4 do valor do valor escolhido é = " + nv);
		
		ler.close();
	}

}
