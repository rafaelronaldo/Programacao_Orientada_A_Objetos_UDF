package oo;

public class TesteSobrecargaFruta {

    public static void main(String[] args) {
        
        SobrecargaFruta melancia = new SobrecargaFruta(4000, 5); 
        
        SobrecargaFruta manga = new SobrecargaFruta(); 
        
        manga.gramas = 100; 
        manga.calorias_por_grama = 100; 
        
        System.out.println("manga " + manga.gramas + " gs " + manga.calorias_por_grama); 
    }
}