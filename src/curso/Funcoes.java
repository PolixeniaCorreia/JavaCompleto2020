package curso;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 

		System.out.println("Digite 3 numeros: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int maior = max(num1, num2, num3);

		showResult(maior);
		
		sc.close();

	}

	private static void showResult(int maior) {
		System.out.println("Maior: " +maior);
		
	}

	public static int max(int x, int y, int z) {
		int aux;
		
		if(x > y && x > z) {
			aux = x;

		}else if(y > z){
			aux = y;

		}else {
			aux = z;
		}
		
		return aux;
	}

}
