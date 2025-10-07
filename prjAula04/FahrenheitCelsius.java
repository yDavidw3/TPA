package prjAula03;
import java.util.Scanner;

public class FahrenheitCelsius {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int f, c;
		
		System.out.println("Digite a temperatura em Fahrenheit e o programa converterá para Celsius");
		f = ler.nextInt();
		
		c = (f-32)*5/9;
		
		System.out.println("Está fazendo "+c+"°");
		if (c < 15) {
			System.out.println("Está frio! Se agasalhe!");
		}else if (c >=15 && c < 22) {
			System.out.println("O tempo está Ameno! Leve um agasalho de precaução!");
		}else{
			System.out.println("Está Calor! Aproveite e tome um sorvete!");
		}
		
		ler.close();
	}

}
