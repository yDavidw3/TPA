package prjAula10;

public class ProgramaAltura {

	public static void main(String[] args) {
		double j=134, p=145, jcresce=2.5, pcresce=2; 
		int i=0;
		do {
			j=j+jcresce;
			p=p+pcresce;
			i++;
		}while (j<=p);
		System.out.println("João só ficará mais alto que Pedro em "+i+" anos.");
		System.out.println("João terá " +j+ "cm, e Pedro " +p+ "cm.");

	}

}
