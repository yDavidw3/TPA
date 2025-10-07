package prjAula10;
import java.util.Scanner;
public class programaFaixaEtaria2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double i=0, c, f1=0, f2=0, f3=0, f4=0, f5=0, idade;
		do {
			System.out.println("Insira a idade:");
			idade = ler.nextInt();
			if (idade<16) {
				System.out.println("1a faixa.");
				f1 = f1+1;
			}
			else if (idade<31) {
				System.out.println("2a faixa");
				f2=f2+1;
			}
			else if (idade<46) {
				System.out.println("3a faixa");
				f3=f3+1;
			}
			else if (idade<61) {
				System.out.println("4a faixa");
				f4=f4+1;
			}
			else {
				System.out.println("5a faixa");
				f5=f5+1;
			}
			i++;
			System.out.println("Deseja continuar? digite 1 se sim, ou qualquer outro número se não.");
			c = ler.nextInt();
			}
		while (c==1);
		if (c!=1) {
			System.out.println("Programa encerrado.");
		}
		System.out.println("1ª faixa: "+f1+" "+(f1*100/i)+"%");
		System.out.println("2ª faixa: "+f2+" "+(f2*100/i)+"%");
		System.out.println("3ª faixa: "+f3+" "+(f3*100/i)+"%");
		System.out.println("4ª faixa: "+f4+" "+(f4*100/i)+"%");
		System.out.println("5ª faixa: "+f5+" "+(f5*100/i)+"%");
		System.out.println("O total de idades calculadas é: "+(f1+f2+f3+f4+f5));
		ler.close();
	}

}
