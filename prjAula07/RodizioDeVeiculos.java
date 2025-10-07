package prjAula07;
import java.util.Scanner;
public class RodizioDeVeiculos {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		int pVeiculo;
		
		System.out.println("Entre com o último número da placa do seu veículo:");
		pVeiculo = ler.nextInt();
		
		switch(pVeiculo) {
		case 1:
		case 2:
			System.out.println("Seu dia de rodízio é segunda-feira.");
			break;
			
		case 3:
		case 4:
			System.out.println("Seu dia de rodízio é terça-feira.");
			break;
		
		case 5:
		case 6:
			System.out.println("Seu dia de rodízio é quarta-feira.");
			break;
			
		case 7:
		case 8:
			System.out.println("Seu dia de rodízio é quinta-feira.");
			break;
			
		case 9:
		case 0:
			System.out.println("Seu dia de rodízio é sexta-feira.");;
			break;
			
		default:
			System.out.println("Número inválido.");
			
		ler.close();
		}
	}
}
