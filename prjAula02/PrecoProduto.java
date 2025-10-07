package prjAula02;
import java.util.Scanner;

public class PrecoProduto {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double PrecoProduto, QuantVendas, PrecoVenda, LucroTotal;
		
		System.out.println("Insira o valor do produto:");
		PrecoProduto = ler.nextDouble();
		
		System.out.println("Insira a quantidade de vendas do produto:");
		QuantVendas = ler.nextDouble();
		
		System.out.println("Insira o preço de venda do produto:");
		PrecoVenda = ler.nextDouble();
		
		LucroTotal = PrecoVenda - PrecoProduto * QuantVendas;
		
		System.out.println("O lucro total = " + LucroTotal);
		ler.close();
	}

}
