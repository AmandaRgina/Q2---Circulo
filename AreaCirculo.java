package areaCirculo;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		System.out.println("Informe o raio do círculo: ");
		
		Scanner input = new Scanner(System.in);
		
		double raio = input.nextDouble();
		
		double area = raio*raio*3.1416;
		
		System.out.println("O valor da área do círculo é: " + area);
		
		
		
		input.close();

	}

}
