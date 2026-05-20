package oo;

public class TV implements ControleRemoto, SmartTV{
	public void ligaTV() {
		System.out.println("A TV está ligada...");
	} 
	public void desligaTV() {
		System.out.println("A TV está ligada");
	} 
	public void mudaCanalTV(int canalNovo) {
		System.out.println("Canal alterado para " + canalNovo);
	}
	
	public void conectarInternet(String rede) {
		System.out.println("TV conectada na rede " + rede);
		
	}
	
	public void navegarInternet() {
		System.out.println("Navegando na Internet");
		
	}
	
	public void instalarApp(String aplicativo) {
		System.out.println("Aplicativo instalado" + aplicativo);
		
	}
}
