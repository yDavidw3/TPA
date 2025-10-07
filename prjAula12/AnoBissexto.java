package prjAula12;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int anoInicio, anoFim, i = 0;

        System.out.print("Digite o ano inicial: ");
        anoInicio = ler.nextInt();

        System.out.print("Digite o ano final: ");
        anoFim = ler.nextInt();

        int ano = anoInicio;

        System.out.println("Anos bissextos entre " + anoInicio + " e " + anoFim + ":");

        while (ano <= anoFim) {
            if (ano % 400 == 0) {
                System.out.println(ano);
            } else if (ano % 100 != 0 && ano % 4 == 0) {
                System.out.println(ano);
                i++;
            }
            ano++;
        }

        System.out.println("Total de anos bissextos encontrados: " + i);
        ler.close();
    }
}