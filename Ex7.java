package Exercicios;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double n1,n2;

		System.out.print("Informe o 1º número:");
		n1 = input.nextDouble();
		System.out.print("Informe o 2º número:");
		n2 = input.nextDouble();
		
		System.out.println("Maior: " + TalvezMaior(n1,n2));
	}

	public static double TalvezMaior(double n1, double n2) {

		double maior = 0;

		if(n1 > n2) {
			maior = n1;
		}else if(n1 < n2){
			maior = n2;
		} else {
			System.out.println("Números iguais.");
		}
		return maior;
	}
}
