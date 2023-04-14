package LaçosCondicionaisIF;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {

		int n1;

		Scanner ler = new Scanner(System.in);

		System.out.println("\nDigite um numero: ");
		n1 = ler.nextInt();

		if (n1 > 0 && n1 % 2 == 0) {
			System.out.println("\nNumero par positivo");
		} else if (n1 > 0 && n1 % 2 != 0) {
			System.out.println("\nNumero impar positivo");
		} else if (n1 < 0 && n1 % 2 == 0) {
			System.out.println("\nNegativo e par");
		} else {
			System.out.println("\nNegativo e impar");
		}

	}

}
