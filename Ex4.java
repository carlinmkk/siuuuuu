package Exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n;

		System.out.print("Informe um número: ");
		n = input.nextInt();

		System.out.println("Resultado:" + Operacao(n));

	}

	public static int Operacao(int n) {

		int resultado = 0;

		if (n % 2 == 0) {
			System.out.println("Seu número é par.");
			resultado = n * n;
		} else {
			System.out.println("Seu número é ímpar.");
			resultado = n * 2;
		}
		return resultado;
	}
}
