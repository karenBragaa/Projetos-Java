package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int valor1 ;
		int valor2 ;
		
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = sc.nextInt();
		
		int igual = valor1 + valor2;
		
		System.out.println("A soma dos valores é: "+ igual);
		
		sc.close();
		
	}

}
