package prjAula01;

public class Pagamento {
	public static void main(String[] args) {
		double PrecoProduto, Pix, CartaoCredito;
		
		PrecoProduto = 98.0;
		
		Pix = PrecoProduto * 0.10;
		CartaoCredito = PrecoProduto * 0.05;
		
		System.out.println("O desconto no pix será = R$ " +Pix);
		System.out.println("O desconto no cartão de crédito será = R$ " +CartaoCredito);

	}

}
