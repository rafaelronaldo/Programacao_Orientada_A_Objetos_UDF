package oo;

public class TV implements ControleRemoto{
	public void ligaTV() {
		System.out.println("A TV está ligada...");
	} 
	public void desligaTV() {
		System.out.println("A TV está ligada");
	} 
	public void mudaCanalTV(int canalNovo) {
		System.out.println("Canal alterado para " + canalNovo);
	}
}
