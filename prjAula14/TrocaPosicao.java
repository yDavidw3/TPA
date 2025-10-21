package prjAula14;

import java.util.Scanner;

public class TrocaPosicao {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAM=10;
		int a[], b[], i;
		
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor A:" );
			a[i] = ler.nextInt();
		}
		
		System.out.print("B = [ ");
		for(int j=0; j<TAM; j++) {
			b[j] = a[TAM - 1 - j]; 
			System.out.print(b[j]+", ");
		}
		System.out.print(" ]");
		
		}

	}

