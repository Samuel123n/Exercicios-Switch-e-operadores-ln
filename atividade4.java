package LaçosCondicionaisIF;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String palavra1, palavra2, palavra3;

		System.out.println("\nEntre com a primeira palavra: ");
		palavra1 = leia.nextLine();
		System.out.println("\nEntre com a primeira palavra: ");
		palavra2 = leia.nextLine();
		System.out.println("\nEntre com a primeira palavra: ");
		palavra3 = leia.nextLine();

		if (palavra1.equalsIgnoreCase("vertebrado")) {
			if (palavra2.equalsIgnoreCase("ave")) {
				if (palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("\nÉ uma Águia");
				} else {
					if (palavra3.equalsIgnoreCase("onivoro")) {
						System.out.println("\nÉ um ser Humano");
					} else {
						System.out.println("\nÉ uma vaca");
					}

				}
			} else {
				if (palavra2.equalsIgnoreCase("inseto")) {
					if (palavra3.equalsIgnoreCase("hematofago")) {
						System.out.println("\nÉ uma Largata");
					}
				} else {
					if (palavra3.equalsIgnoreCase("hematofago")) {
						System.out.println("\nÉ uma sanguessuga");
					} else {
						System.out.println("\nÉ uma minhoca");
					}
				}
			}

		}

	}

}
