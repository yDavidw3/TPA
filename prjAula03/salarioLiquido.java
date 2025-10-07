package prjAula03;
import java.util.Scanner; 

public class salarioLiquido {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double hora, aula, desconto, salarioLiquido;
		
		System.out.println("Esse programa calcula o salário líquido dos professores. Para realizar essa tarefa, são necessários os seguintes dados:");
		
		System.out.println("Digite o valor da sua hora aula");
		hora = ler.nextDouble();
		System.out.println("Digite o seu número de aulas dadas no mês");
		aula = ler.nextDouble();
		System.out.println("Digite o seu percentual de desconto do INSS");
		desconto = ler.nextDouble();
		
		salarioLiquido = (hora*aula)/4; 
		
		System.out.println("Seu salário líquido é --> ." + salarioLiquido);
		ler.close();
	}
	
}