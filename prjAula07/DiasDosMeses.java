package prjAula07;
import java.util.Scanner;
public class DiasDosMeses {
	public static void main(String[] args) {
				Scanner ler = new Scanner(System.in);
				
				int m;
				
				System.out.println("Entre com um número de um mês e este programa dirá se ele têm 28, 30 ou 31 dias:");
				m = ler.nextInt();
				
				switch(m) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println("Este mês tem 31 dias!");
					break;
					
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println("Este mês tem 30 dias!");
					break;
				
				case 2:
					System.out.println("Este mês tem 28 dias!");
					break;
					
				default:
					System.out.println("Mês inválido.");
					
				ler.close();
				}
			}


	}
