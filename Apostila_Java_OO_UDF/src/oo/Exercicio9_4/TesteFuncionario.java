package oo.Exercicio9_4;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		// Criando um Empregado comum
        Empregado emp = new Empregado("João Silva", 2000.0f);
        
        // Criando um Gerente (Salário base 5000 + Comissão 1500)
        Gerente ger = new Gerente("Maria Souza", 5000.0f, 1500.0f);

        // Exibindo os resultados
        System.out.println("Salário do Empregado " + emp.getNome() + ": R$ " + emp.getSalario());
        
        // Aqui o Polimorfismo acontece: o método chamado é o da classe Gerente
        System.out.println("Salário da Gerente " + ger.getNome() + ": R$ " + ger.getSalario());
		
        System.out.println(emp); 
        System.out.println(ger);
	}

}
