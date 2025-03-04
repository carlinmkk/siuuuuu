package Exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n;

		System.out.print("Informe um número: ");
		n = input.nextInt();

		System.out.println(Boolean(n));
		input.close();
	}

	public static boolean Boolean(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
