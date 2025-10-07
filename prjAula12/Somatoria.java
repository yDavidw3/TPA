package prjAula12;

public class Somatoria {
    public static void main(String[] args) {
        int i, soma = 0;

        System.out.println("Somando valores de 5 em 5 até 400...");

        for (i = 0; i < 400; i += 5) {
            soma += i;
            System.out.println("Somatório parcial: " + soma);
        }

        System.out.println("Somatório final: " + soma);
    }
}