package LaçosCondicionaisIF;

import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int quant, codigo;
		float valorTotal;

		System.out.println("\nLanchonete--Comed burguer- By Natally");
		System.out.println("\nMenu de produtos");
		System.out.println("\n1 - Cachorro Quente - R$ 10,00");
		System.out.println("\n2 - x-Salada - R$ 15,00");
		System.out.println("\n3 - X-Bacon - R$ 18,00");
		System.out.println("\n4 - Bauru - R$ 12,00");
		System.out.println("\n5 - Refrigerante - R$ 8,00");
		System.out.println("\n6 - Suco de Laranja - R$ 13,00");
		System.out.println("\nEscolha o seu produto");
		codigo = leia.nextInt();
		System.out.println("\nDigite a quantidade desse produto");
		quant = leia.nextInt();

		switch (codigo) {
		case 1:
			valorTotal = quant * 10;
			System.out.println("\nCachorro Quente - Valor Total: R$ 10,00" + valorTotal);
			break;
		case 2:
			valorTotal = quant * 15;
			System.out.println("\nX-Salada - Valor Total: R$ 15,00" + valorTotal);
			break;
		case 3:
			valorTotal = quant * 18;
			System.out.println("\nX-Bacon - Valor Total: R$ 18,00" + valorTotal);
			break;
		case 4:
			valorTotal = quant * 12;
			System.out.println("\nBauru - Valor Total: R$ 12,00" + valorTotal);
			break;
		case 5:
			valorTotal = quant * 13;
			System.out.println("\nRefrigerante - Valor Total: R$ 8,00" + valorTotal);
			break;
		case 6:
			valorTotal = quant * 10;
			System.out.println("\nSuco de laranja - Valor Total: R$ 13,00" + valorTotal);
			break;
		default:
			System.out.println("\nOpcão invalida");
		}

	}

}
