package oo.Exercicio9_4;

public class Gerente extends Empregado {
	// Atributos
	private float comissao;
	
	
	
	public Gerente(String nome, float salario, float comissao) {
		super(nome, salario);
		this.comissao = comissao;
		
		
	}

	// Métodos Acessadores
	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public float getSalario () {
		return super.getSalario() + this.comissao;
	}

	@Override
	public String toString() {
	    // super.toString() pega o Nome e Salário Base lá do Empregado
	    return super.toString() + " | Comissão: R$ " + comissao + " | Total: R$ " + getSalario();
	}
	
}
