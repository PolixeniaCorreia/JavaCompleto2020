package curso;

public class Split {

	public static void main(String[] args) {
		
		String s = "PAOLA JOÃO PEDRO";
		
		String[] vetor = s.split(" ");
		
		String palavra1 = vetor[0];
		String palavra2 = vetor[1];
		String palavra3 = vetor[2];
		
		for (int i = 0; i < vetor.length; i++) {
		
			System.out.println("VETOR ["+i+"] " +vetor[i]);
		}

	}

}
