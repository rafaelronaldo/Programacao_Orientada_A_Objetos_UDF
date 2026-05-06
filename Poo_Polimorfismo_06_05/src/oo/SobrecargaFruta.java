package oo;

public class SobrecargaFruta {
    int gramas; 
    int calorias_por_grama; 
    
 
    public SobrecargaFruta() { 
        gramas = 55; 
        calorias_por_grama = 0; 
    } 
    

    public SobrecargaFruta(int g, int c) { 
        this.gramas = g; 
        this.calorias_por_grama = c;
    }
}