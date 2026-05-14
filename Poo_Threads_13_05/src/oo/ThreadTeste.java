package oo;

class ThreadTeste {
    // O método main é o ponto de entrada principal do programa (Thread Main)
    public static void main(String args[]) {
        
        // 1. Criamos o objeto que contém o código que queremos rodar (a tarefa)
        ThreadInterface tiJ = new ThreadInterface();
        
        // 2. Criamos o objeto Thread propriamente dito, 
        // informando qual 'Runnable' ele deve executar.
        Thread thread = new Thread(tiJ);
        
        // 3. Solicitamos o início da execução. 
        // A partir daqui, existem DUAS coisas acontecendo ao mesmo tempo:
        // O método main continua e a nova thread começa a contar até 100.
        thread.start();
        
        // Se escrevêssemos algo aqui, seria executado ENQUANTO a thread conta.
        System.out.println("A thread principal continua rodando em paralelo!");
    }
}