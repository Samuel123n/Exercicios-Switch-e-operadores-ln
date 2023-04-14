package LaçosCondicionaisIF;

import java.util.Scanner;

import JavaTech.Main;

public class atividade1 {

	public static void main(String[] args) {

		int a, b, c, soma;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite o numero A: ");
		a = leia.nextInt();
		System.out.println("\nDigite o numero B: ");
		b = leia.nextInt();
		System.out.println("\nDigite o numero C: ");
		c = leia.nextInt();

		soma = a + b;
		if (soma > c) {
			System.out.println("A Soma de A + B é Maior do que C");

		} else if (soma < c) {
			System.out.println("A Soma de A + B é Menor do que C");
		} else if (soma == c) {
			System.out.printf("\nMédia aritmética: %d", soma);
		}
	}

}
