package prjAula11;

import java.util.Scanner;

public class ProgramaIdadeAlturaPeso {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, idade,idMais50=0,id10a20=0, pesoMenor40=0, maisVelho=0, maisNovo=0;
		double altura, somaAltura=0, peso;
		
		for (i=1;i<26;i++) {
			System.out.println("Digite a idade da "+i+"a pessoa: ");
			idade=ler.nextInt();
			System.out.println("Digite a altura da "+i+"a pessoa (em metros): ");
			altura=ler.nextDouble();
			System.out.println("Digite o peso da "+i+"a pessoa (em kg): ");
			peso=ler.nextDouble();
			
			if (i==1) {
				maisVelho=idade;
				maisNovo=idade;
			}
			if (idade>50) {
				idMais50++;	
			}
			else if (idade>9) {
				if (idade<21) {
					somaAltura=altura+somaAltura;
					id10a20++;
				}
			}
			if (peso<40) {
				pesoMenor40++;
			}
			if (idade>maisVelho) {
				maisVelho=idade;
			}
			if (idade<maisNovo) {
				maisNovo=idade;
			}
		}
		double mediaAltura=somaAltura/id10a20;
		double porMenor40=(pesoMenor40*100)/25;
		System.out.println("RESULTADOS");
		System.out.println("Quantidade de pessoas com idade maior que 50: "+idMais50);
		System.out.println("Média das alturas de pessoas de 10 a 20 anos: "+mediaAltura);
		System.out.println("Porcentagem das pessoas com peso menor que 40kg: "+porMenor40+"%");
		System.out.println("Idade da pessoa mais velha: "+maisVelho+" anos");
		System.out.println("Idade da pessoa mais nova: "+maisNovo+" anos");
		ler.close();
	}
}
