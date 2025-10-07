package prjAula02;
import java.util.Scanner;

public class CalculoIpva {
	public static void main(String[] args) {
		Scanner ler =  new Scanner (System.in);
		
		double PrecoVeiculo, ipva;
		
		System.out.println("Vamos calcular o IPVA correspondente com o valor de seu carro.");
		
		System.out.println("Nos informe o valor de seu veículo:");
		PrecoVeiculo  = ler.nextDouble();
		
		ipva = PrecoVeiculo/100 * 4;
		
		System.out.println("O valor do IPVA correspondente é --> " + ipva);
		ler.close();
	}

}
