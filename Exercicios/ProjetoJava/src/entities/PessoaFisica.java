package entities;

public class PessoaFisica extends Pessoa {
	
	private Double gastosSaude;
	
	public PessoaFisica (){
		super ();
	}	
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calcularImposto() {
	
		double valorImposto ;
		if ( super.getRendaAnual() <= 20000.00) {
			valorImposto = super.getRendaAnual() * 0.15;
		}
		else {
		   valorImposto = super.getRendaAnual() * 0.25;
		}
		
		if (gastosSaude >= 0.1) {
			return valorImposto - (gastosSaude * 0.50);
		}
		else {
			return valorImposto;
		}
	}	
}
