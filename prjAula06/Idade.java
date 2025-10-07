package prjAula06;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade1, idade2, idade3, idade4, idade5, maiores, menores, porcentagemMaiores, porcentagemMenores ;

        maiores = 0;
        menores = 0;

        System.out.print("Digite a idade da primeira pessoa: ");
        idade1 = ler.nextInt();

        System.out.print("Digite a idade da segunda pessoa: ");
        idade2 = ler.nextInt();

        System.out.print("Digite a idade da terceira pessoa: ");
        idade3 = ler.nextInt();

        System.out.print("Digite a idade da quarta pessoa: ");
        idade4 = ler.nextInt();

        System.out.print("Digite a idade da quinta pessoa: ");
        idade5 = ler.nextInt();

        if (idade1 >= 18) {
            maiores = maiores + 1;
        } else {
            menores = menores + 1;
        }

        if (idade2 >= 18) {
            maiores = maiores + 1;
        } else {
            menores = menores + 1;
        }

        if (idade3 >= 18) {
            maiores = maiores + 1;
        } else {
            menores = menores + 1;
        }

        if (idade4 >= 18) {
            maiores = maiores + 1;
        } else {
            menores = menores + 1;
        }

        if (idade5 >= 18) {
            maiores = maiores + 1;
        } else {
            menores = menores + 1;
        }
        
        porcentagemMaiores = (maiores * 100) / 5;
        porcentagemMenores = (menores * 100) / 5;
        
        System.out.println(+ maiores + " aluno(s) é/são maior(es) de idade e " + menores + " aluno(s) é/são maiore(s) de idade.");
        System.out.println(+ porcentagemMaiores + "% dos alunos são maiores de idade. Já " + porcentagemMenores + "% dos alunos são menores de idade.");

        ler.close();
    }
}