package prjAula12;

import java.util.Scanner;

public class IdadeUser {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int anoAtual, anoNascimento, idade, opcao, i = 0;

        do {
            System.out.print("Informe o ano atual: ");
            anoAtual = ler.nextInt();

            System.out.print("Informe o seu ano de nascimento: ");
            anoNascimento = ler.nextInt();

            idade = anoAtual - anoNascimento;
            System.out.println("Você tem " + idade + " anos de idade.");

            do {
                System.out.print("Deseja calcular novamente? (1 - Sim | 0 - Não): ");
                opcao = ler.nextInt();

                if (opcao == 0) {
                    System.out.println("Encerrando o programa... Até mais!");
                    i = 1;
                } else if (opcao == 1) {
                    System.out.println("Beleza! Vamos de novo então!");
                    i = 1;
                } else {
                    System.out.println("Opção inválida, tente novamente.");
                }
            } while (i == 0);

        } while (opcao != 0);

        ler.close();
    }
}