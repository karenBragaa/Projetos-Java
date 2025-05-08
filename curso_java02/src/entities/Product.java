package entities;

public class Product {

		public String nome;
		public double preco;
		public int quantidade;
		
		public Product(String nome, double preco, int quantidade) {
			this.nome = nome;
			this.preco = preco;
			this.quantidade = quantidade;
		}
		
		public Product(String nome, double preco) {
			this.nome = nome;
			this.preco = preco;
		}
		
		public double totalValorEmEstoque(){
			return preco * quantidade;
		}
		public void adicionarProdutos (int quantidade) {
			this.quantidade += quantidade;
		}
		public void removerProdutos (int quantidade) {
			this.quantidade -= quantidade;
		}
		
		public String toString() {
			return nome
			+ ", $ "
			+ preco
			+ ", "
			+ quantidade 
			+ " unidade, Total: $ "
			+ totalValorEmEstoque();
			 
		}
}
