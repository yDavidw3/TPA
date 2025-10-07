package prjAula02;
import java.util.Scanner;

public class VolumeLataOleo {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	double pi, raio, altura, volume;
	
	System.out.println("Insira o valor do Raio:");
	raio = ler.nextDouble();
	
	System.out.println("insira a altura:");
	altura = ler.nextDouble();
	
	pi = 3.14;
	
	volume = pi*(raio*raio)*altura;
	
	System.out.println("Volume = " + volume);
	ler.close();
	
	}
}
