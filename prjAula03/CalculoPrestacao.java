package prjAula03;
import java.util.Scanner;

public class CalculoPrestacao {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double valor, taxa, tempo, prestacao;
		
		System.out.println("Esse programa efetua o cálculo de uma prestação em atraso");
		System.out.println("Entre com o valor original da prestação:");
		valor = ler.nextDouble();
		
		System.out.println("Entre com a taxa de juros aplicada ao dia para correção da prestação:");
		taxa = ler.nextDouble();
		
		System.out.println("Entre com a quantidade de dias que a prestação está atrasada:");
		tempo = ler.nextDouble();
		
		prestacao = valor + (valor *(taxa/100)*tempo);
		
		System.out.println("A prestação é: "+prestacao);
		ler.close();
		
	}

}
