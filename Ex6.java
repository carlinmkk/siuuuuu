package Exercicios;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double n1, n2, n3;

		System.out.print("Informe sua 1ª nota:");
		n1 = input.nextDouble();
		System.out.print("Informe sua 2ª nota:");
		n2 = input.nextDouble();
		System.out.print("Informe sua 3ª nota:");
		n3 = input.nextDouble();

		System.out.println("Sua média:" + Media(n1, n2, n3));
	}

	public static double Media(double n1, double n2, double n3) {

		double media;

		media = (n1 + n2 + n3) / 3;

		return media;
	}

}
