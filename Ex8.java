package Exercicios;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double max, min, lim;

		System.out.print("Informe o limite máximo:");
		max = input.nextDouble();
		System.out.print("Informe o limite mínimo:");
		min = input.nextDouble();
		System.out.print("Insira um número:");
		lim = input.nextDouble();

		System.out.println(limite(max, min, lim));
	}

	public static String limite(double max, double min, double lim) {

		if (lim <= max && lim >= min) {
			return lim + " está nos limites impostos.";
		} else {
			return lim + " não nos limites impostos.";
		}
	}
}
