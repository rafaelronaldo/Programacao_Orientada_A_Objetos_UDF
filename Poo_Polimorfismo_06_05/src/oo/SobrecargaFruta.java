package oo;

public class SobrecargaFruta {
    // Atributos: Representam os dados que cada objeto "Fruta" terá
    int gramas; 
    int calorias_por_grama; 
    
    // CONSTRUTOR 1: Sem parâmetros
    // Chamado quando você cria a fruta sem passar valores: new SobrecargaFruta()
    public SobrecargaFruta() { 
        gramas = 55;             // Define um valor padrão de 55
        calorias_por_grama = 0;  // Define um valor padrão de 0
    } 
    
    // CONSTRUTOR 2: Com parâmetros (Aqui ocorre a SOBRECARGA)
    // Chamado quando você quer definir os valores na hora da criação: new SobrecargaFruta(100, 2)
    public SobrecargaFruta(int g, int c) { 
        this.gramas = g;           // 'this' indica que estamos guardando o valor 'g' no atributo da classe
        this.calorias_por_grama = c; // Guarda o valor 'c' no atributo da classe
    }
}