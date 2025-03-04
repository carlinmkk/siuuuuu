package Exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int estacao = 0;

		do {
			System.out.print("Informe um número (1 a 4):");
			estacao = input.nextInt();

			switch (estacao) {
			case 1: {
				System.out.println(Verao(estacao));
				break;
			}
			case 2: {
				System.out.println(Outono(estacao));
				break;
			}
			case 3: {
				System.out.println(Inverno(estacao));
				break;
			}
			case 4: {
				System.out.println(Primavera(estacao));
				break;
			}
			}
		} while (estacao <= 0 || estacao > 4);
	}

	public static String Verao(int estacao) {
		return "É verão\nE o tempo está quente.";
	}

	public static String Outono(int estacao) {
		return "É outono\nE as folhas endurecem.";
	}

	public static String Inverno(int estacao) {
		return "É inverno\nE está frio.";
	}

	public static String Primavera(int estacao) {
		return "É Primavera\nE o verde é verde.";
	}

}
