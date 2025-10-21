package prjAula13;

import java.util.Scanner;

public class ProgramaDiaSeguinte {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int dia = 0, mes = 0, ano = 0, i=0, c=1;
		
		do {
			System.out.println("Digite um dia:");
			dia = ler.nextInt();
			System.out.println("Digite um mês:");
			mes = ler.nextInt();
			System.out.println("Digite um ano:");
			ano = ler.nextInt();
			
			switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (dia<32) {
					dia++;
					if (dia>31){
						dia=1;
						mes++;
						if (mes==13) {
							mes=01;
							ano++;
						}
					}
				}
				
			break;
			
			case 4:
			case 6:
			case 9:
			case 11:
				if (dia<31) {
					dia++;
					if (dia>30){
						dia=1;
						mes++;
						if (mes==13) {
							mes=01;
							ano++;
						}
					}
				}
				
			break; 
			
			case 2:
				if (dia<30) {
					dia++;
					if (dia>29) {
						dia=1;
						mes++;
						if (mes==13) {
							mes=01;
							ano++;
						}
					}
				}
				
			break;

			}			
			i++;	
			System.out.println(dia+ "/" +mes+ "/" +ano);
			System.out.println("Deseja continuar? Digite 1/Sim ou 2/Não.");
			i = ler.nextInt();
			}
		while (i==1);
			if (i!=2) {
		System.out.println("Programa encerrado.");
			}
		
		ler.close();
	}
}
