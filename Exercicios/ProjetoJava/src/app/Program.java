package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Pessoa> list = new ArrayList<>(); 
		
		System.out.print("Informe o numero de contribuentes: ");
		int n = sc.nextInt();	
		
		for (int i = 1; i <= n ; i ++) {
			
			System.out.println ("Informe se a pessoa é juridica ou fisica: (f/j)");
			char ch = sc.next().charAt(0);
			System.out.println ("Nome:");
			sc.nextLine();
            String name = sc.nextLine();
        	System.out.println ("Renda Anual:");
            Double rendaAnual = sc.nextDouble();
        	
            if (ch == 'f') {
            	System.out.print("Gastos com saude:");
            	Double gastosSaude = sc.nextDouble ();
            	
            	list.add(new PessoaFisica(name, rendaAnual, gastosSaude));
            } 
            if (ch == 'j') {
            	
            	System.out.print ("Informe a quantidade de funcionarios :");
            	Integer qtdfunc = sc.nextInt();
            	
            	list.add(new PessoaJuridica(name, rendaAnual, qtdfunc));
            }
		}
		System.out.println();
		System.out.println("impostos a serem pagos: ");
		
		for(Pessoa pessoa:list){
			System.out.println(pessoa.getNome()+ " :$ "+ String.format("%.2f", pessoa.calcularImposto()));
		}
	}
}
