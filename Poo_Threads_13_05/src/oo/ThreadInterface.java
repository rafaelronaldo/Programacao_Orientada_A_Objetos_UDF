package oo;

/**
 * A classe ThreadInterface implementa a interface Runnable.
 * Isso significa que ela define uma "tarefa" que pode ser executada 
 * por uma linha de processamento (Thread) separada.
 */

public class ThreadInterface implements Runnable {
	
	// O método run() é obrigatório ao implementar Runnable.
    // Tudo o que estiver aqui dentro será executado de forma assíncrona.
	public void run()
	// Iniciamos um laço que repetirá 100 vezes
	{
		for (int i=0; i<100; i++) {
			// Exibe no console o progresso da contagem
			System.out.println(" Contador --> "+i);
		}
	}
}

