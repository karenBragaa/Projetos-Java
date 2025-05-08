package service;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Inserir dados do produto: ");
	System.out.print("Nome: ");
	String nome = sc.nextLine();
	System.out.print("Preço: ");
	double preco = sc.nextDouble();

	Product produto = new Product(nome, preco);
	
	System.out.println();
	System.out.println("Dados do produto: " + produto);
	
	System.out.println();
	System.out.print("Digite o numero de produtos para serem adiconados ao estoque: ");
	int quantidade = sc.nextInt();
	produto.adicionarProdutos(quantidade);
	
	System.out.println();
	System.out.println("Dados atualizados: " + produto);
	
	System.out.println();
	System.out.print("Digite o numero de produtos para serem removidos do estoque: ");
	quantidade = sc.nextInt();
	produto.removerProdutos(quantidade);
			
	System.out.println();
	System.out.println("Dados atualizados: " + produto);
	
	sc.close();
	}

}
