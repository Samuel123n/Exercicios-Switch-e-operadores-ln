package LaçosCondicionaisIF;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {

		String nome;
		float idade;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite o nome do doador:");
		nome = leia.nextLine();
		System.out.println("\nDigite a idade do doador: ");
		idade = leia.nextFloat();
		System.out.println("\nVocê ja doou sangue? ");
		boolean escolha = leia.nextBoolean();

		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && idade <= 69 && escolha) {
				System.out.println(nome + "\nNão está apto para doar sangue");
			} else {
				System.out.println(nome + "\nEstá apto para doar sangue");
			}
		} else {
			System.out.println(nome + " não está apto para doar sangue");

		}
	}

}
