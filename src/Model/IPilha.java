package Model;

public interface IPilha {

	public void insere(String peca); 
	public Object remove();
	public boolean vazia() ;
	public boolean cheia();
	
}
