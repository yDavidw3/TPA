package prjAula14;

import java.util.Scanner;

public class VetorMediaAritimetica {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAM=10;
		int a[], i, m, med;
		
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Insira o "+(i+1)+"º valor no vetor A:");
			a[i] = ler.nextInt();
			
			
		}
		
		m = a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9];
		med = m/TAM;
		
		System.out.println("essa é a média dos valores: "+med);
	}

}
