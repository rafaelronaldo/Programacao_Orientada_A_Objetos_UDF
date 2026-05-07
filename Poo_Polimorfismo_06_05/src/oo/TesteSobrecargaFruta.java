package oo;

public class TesteSobrecargaFruta {

    public static void main(String[] args) {
        
        // Aqui você usa o CONSTRUTOR COM PARÂMETROS
        // Você já cria a melancia passando o peso (4000) e as calorias (5)
        SobrecargaFruta melancia = new SobrecargaFruta(4000, 5); 
        
        // Aqui você usa o CONSTRUTOR PADRÃO (Sem parâmetros)
        // A manga nasce com aqueles valores padrão (55g e 0 cal) definidos na outra classe
        SobrecargaFruta manga = new SobrecargaFruta(); 
        
        // Como a manga nasceu com valores padrão, agora você altera os atributos "na mão"
        manga.gramas = 100; 
        manga.calorias_por_grama = 100; 
        
        // Imprime no console os dados finais da manga
        System.out.println("manga " + manga.gramas + " gs " + manga.calorias_por_grama); 
    }
}