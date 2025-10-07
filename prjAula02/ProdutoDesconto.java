package prjAula02;
import java.util.Scanner;

public class ProdutoDesconto {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double PrecoProduto, Porcentagem, Desconto, ValorFinal;
		
		System.out.println("Esse programa calcula a porcentagem de desconto a ser concedida na compra à vista:");
		
		System.out.println("Informe o valor do produto:");
		PrecoProduto = ler.nextDouble();
		
		System.out.println("Informe a quantidade de desconto:");
		Porcentagem = ler.nextDouble();
		
		Desconto = PrecoProduto/100 * Porcentagem;
		
		ValorFinal = PrecoProduto - Desconto;
		
		System.out.println("Valor do produto com desocnto = " + ValorFinal);
		
		ler.close();
		
	}

}
