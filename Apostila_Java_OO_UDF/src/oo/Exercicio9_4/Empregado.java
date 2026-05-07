package oo.Exercicio9_4;

public class Empregado {
	
	// Atributos
	private String nome;
	private float salario;
	
	public Empregado(String nome, float salario) {
		super();
		this.nome = nome;
		this.salario = salario;
		
	}
	// Métodos Acessadores
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
	    return "Nome: " + nome + " | Salário Base: R$ " + salario;
	}
	
	
}
	