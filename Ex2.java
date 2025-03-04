package Exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double n1 = 0, n2 = 0, n3 = 0, n4 = 0;

		for (int i = 0; i < 4; i++) {
			System.out.print("Informe o 1º número: ");
			n1 = input.nextDouble();
			System.out.print("Informe o 2º número: ");
			n2 = input.nextDouble();
			System.out.print("Informe o 3º número: ");
			n3 = input.nextDouble();
			System.out.print("Informe o 4º número: ");
			n4 = input.nextDouble();

			System.out.println("Soma:" + Soma(n1, n2, n3, n4));
			break;
		}
	}
	public static double Soma(double n1, double n2, double n3, double n4) {
		return n1 + n2 + n3 + n4;
	}
}
