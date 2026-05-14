package oo;

public class TesteMinhaThread {
	public static void main(String args[]){
		MinhaThread a,b;
		a = new MinhaThread("Joao");
		b = new MinhaThread("Jose");
		c = new MinhaThread("Pedro");
		a.setPriority(5);
		a.start();
		b.start();
	}
}
