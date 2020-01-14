package curso;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int mask = 0b100000;   // b, para indicar que recebi binário
		int n = sc.nextInt();

		//113 true
		//89 false 
		
		if ((n & mask) != 0) {
			System.out.println("O 6º bit é 1.");
		}
		else {
			System.out.println("O 6º bit é 0.");
		}
		
		sc.close();
	}

}
