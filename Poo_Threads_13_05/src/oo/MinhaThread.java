package oo;

// Ao estender (extends) Thread, MinhaThread ganha superpoderes de execução paralela
class MinhaThread extends Thread {

    // Construtor que recebe um nome para a Thread
    public MinhaThread(String nome) {
        // Passa o nome para a classe base (Thread)
        super(nome);
    }

    // Onde a mágica acontece quando a Thread é iniciada
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // getName() retorna o nome que passamos no construtor
            System.out.println(getName() + " - " + i);
        }
    }
}