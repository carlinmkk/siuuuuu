package Exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double a, l;

		System.out.print("Informe a altura do retângulo: ");
		a = input.nextInt();

		System.out.print("Informe a largura do retângulo: ");
		l = input.nextDouble();
		
		System.out.println("Perímetro: " + Perimetro(a,l) + "\nÁrea: " + Area(a,l));
	}

	public static double Perimetro(double a, double l) {
		double perimetro;

		perimetro = (a * 2) + (l * 2);
		
		return perimetro;

	}

	public static double Area(double a,double l) {
		double area;
		
		area = a * l;
		
		return area;
	}
}
