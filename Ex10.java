package Exercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String palavra;

		System.out.print("Escreva uma palavra:");
		palavra = input.next();

		System.out.println(Palavra(palavra));
	}

	public static String Palavra(String palavra) {

		if (palavra.length() % 2 == 0) {
			return "A palavra é par então:" + palavra.charAt(0);
		} else {
			return "A palavra é ímpar então:" + palavra.charAt(1);
		}
	}
}
