package entities;

public class PessoaJuridica extends Pessoa {
	
	private Integer numeroFunc;
	
	public PessoaJuridica () {
		super ();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFunc) {
		super(nome, rendaAnual);
		this.numeroFunc = numeroFunc;
	}
	
	public Integer getNumeroFunc() {
		return numeroFunc;
	}

	public void setNumeroFunc(Integer numeroFunc) {
		this.numeroFunc = numeroFunc;
	}

	@Override
	public double calcularImposto() {
		if (numeroFunc >= 10) {
			return super.getRendaAnual() * 0.14;
		}
		else {
			
		return super.getRendaAnual() * 0.16;	
		}
		
		
	}

}
