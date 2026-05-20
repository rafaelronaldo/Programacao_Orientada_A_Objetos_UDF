package oo;

public class TesteTV {

	public static void main(String[] args) {
		TV tvLG = new TV();
		tvLG.ligaTV();
		tvLG.mudaCanalTV(10);
		tvLG.conectarInternet("minhacasa");
		tvLG.instalarApp("primevideo");
		tvLG.navegarInternet();
		tvLG.desligaTV();
	}

}
