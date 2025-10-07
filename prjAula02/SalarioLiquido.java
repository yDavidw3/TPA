package prjAula02;
import java.util.Scanner;

public class SalarioLiquido {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	Double SalarioBruto, inss, ValeTransporte,SalarioLiquido;
	
	System.out.println("Insira vosso salário bruto:");
	SalarioBruto = ler.nextDouble();
	
	inss = SalarioBruto*0.08;
	ValeTransporte = SalarioBruto*0.06;
	SalarioLiquido = SalarioBruto - inss - ValeTransporte;
	
	System.out.println("Seu salário líquido é equivalente a R$ " + SalarioLiquido);
	ler.close();
			
			
	}
}
