package areaCirculo;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		System.out.println("Informe o raio do c�rculo: ");
		
		Scanner input = new Scanner(System.in);
		
		double raio = input.nextDouble();
		
		double area = raio*raio*3.1416;
		
		System.out.println("O valor da �rea do c�rculo �: " + area);
		
		
		
		input.close();

	}

}
