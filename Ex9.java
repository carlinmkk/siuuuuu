package Exercicios;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double vetNumeros[] = new double[5];

		for (int i = 0; i < vetNumeros.length; i++) {
			System.out.print("Informe o " + (i + 1) + "º número:");
			vetNumeros[i] = input.nextDouble();
		}
		System.out.println(FazTudo(vetNumeros));
	}

	public static String FazTudo(double vetNumeros[]) {

		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;
		double media = 0;
		double soma = 0;

		for (int i = 0; i < vetNumeros.length; i++) {

			if (vetNumeros[i] > maior) {
				maior = vetNumeros[i];
			}

			if (vetNumeros[i] < menor) {
				menor = vetNumeros[i];
			}
			soma += vetNumeros[i];
		}
		
		media = soma / vetNumeros.length;
		return ("Maior número:" + maior + "\nMenor número:" + menor +"\nMédia:" + media);
		
	}
}
