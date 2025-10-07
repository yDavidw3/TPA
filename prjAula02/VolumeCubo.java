package prjAula02;
import java.util.Scanner;

public class VolumeCubo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int aresta, volume;
		
		System.out.println("Insira a quantidade de arestas do cubo:");
		aresta = ler.nextInt();
		
		volume = aresta*aresta*aresta;
		
		System.out.println("Volume = " + volume);
		ler.close();
		
	}

}
