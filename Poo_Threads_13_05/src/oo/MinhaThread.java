package oo;

class MinhaThread extends Thread
{
	public MinhaThread(String nome){
		super(nome);
	}
	public void run(){
		for (int i=0; i<10; i++)
		{
			System.out.println(getName()+ " - " +i );
		}
	}
}
