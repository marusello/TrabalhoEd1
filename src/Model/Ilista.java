package Model;

public interface Ilista {
	
	public int tamanho();
	public boolean vazio();
	public boolean adiciona(Object obj);
	public boolean adiciona(int pos, Object obj);
	public Object remove(int pos);
	public Object[] toArray();

}
