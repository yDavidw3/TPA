package prjAula02;
import java.util.Scanner;

public class LojaPagamento {
	public static void main(String[] args) {
		Scanner ler =  new Scanner (System.in);
		
		double PrecoProduto, DescontoPix, AcrescimoCartaoCredito;
		
		System.out.println("Olá! Neste programa calcularemos o desconto do produto por pagamento via Pix e ");
		System.out.println("Acréscimo ao valor do produto por pagamento via Cartão de Crédito.");
		
		System.out.println("Para iniciarmos, insira o preço do produto:");
		PrecoProduto = ler.nextDouble();
		
		DescontoPix = PrecoProduto * 0.10;
		
		AcrescimoCartaoCredito = PrecoProduto + (PrecoProduto * 0.05);
		
		System.out.println("Tudo certo! O desconto do pagamento via Pix é de -->  R$" + DescontoPix);
		System.out.println("Já o acréscimo ao valor do produto por pagamento via Cartão de Crédito é de -->  R$" + AcrescimoCartaoCredito);
		
		ler.close();
	}

}