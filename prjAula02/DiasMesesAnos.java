package prjAula02;
import java.util.Scanner;

public class DiasMesesAnos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int Dias, Meses, Anos;
		
		System.out.println("Digite o dia de hoje (ou qualquer outro número de dias):");
		Dias = ler.nextInt();
		
		Meses = Dias/30;
		Anos = Dias/365;
		
		System.out.println("CONVERSÃO BEM-SUCEDIDA!");
		System.out.println("Anos --> " + Anos + "   Meses --> " + Meses + "   Dias --> " + Dias);
		ler.close();
	}

}
