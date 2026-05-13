package oo; // Define o pacote (pasta) onde a classe está organizada

import java.util.Scanner; // Importa a classe para leitura de dados do teclado
import java.util.InputMismatchException; // Importa a exceção específica para erro de tipo de dado


public class Excecao { // Declaração da classe pública

	public static void main(String[] args) { // Método principal onde a execução começa
	
		/* 
		 * O bloco TRY contém o código que "tentaremos" executar. 
		 * Se algo der errado aqui dentro, o Java pula direto para o CATCH.
		 */
		
	try { // Início do bloco de monitoramento de erros
		Scanner in = new Scanner(System.in); // Cria o objeto para ler o que o usuário digita
		System.out.println("Informe o Número: "); // Exibe instrução no console
		int num = in.nextInt(); // Tenta ler um número inteiro (ponto crítico de erro)
		System.out.println("Número "+ num); // Se não houver erro, exibe o número digitado
	} 
	catch (NumberFormatException e) { // Captura erro de formato numérico (ex: conversão de String)
		System.out.println("Número inválido!!!!"); // Mensagem caso ocorra NumberFormatException
	}
	catch (InputMismatchException e) { // Captura erro se o usuário digitar texto em vez de número
		System.out.println("Número informado inválido!!!!"); // Mensagem específica para erro de entrada
	}
	catch (Exception e) { // Captura qualquer outro erro genérico que não foi previsto acima
		System.out.println("Ocorre um erro!!!"); // Mensagem de erro genérica
	}
	
	finally { // Bloco que SEMPRE será executado, ocorrendo erro ou não
		System.out.println("Finalização"); // Mensagem de encerramento do processo
	}
	
	
	} // Fecha o método main

} // Fecha a classe Excecao