package Model;

public class Pilha implements IPilha {

	private Object[] peca;
	private int maxSize;
	private int top;

	ListaPecas pecas = new ListaPecas(10);

	public Pilha(int s) // constructor
	{
		maxSize = s;
		top = -1;
	}

	@Override
	public void insere(String nome) {
		this.pecas.adiciona(nome);

	}

	@Override
	public Object remove() {
		return this.pecas.remove(this.pecas.tamanho() - 1);
	}

	@Override
	public boolean vazia() {
		return this.pecas.tamanho() == 0;
	}

	@Override
	public boolean cheia() {
		return (top == maxSize - 1);
	}

	public Object[] toArray() {
		Object[] objs = new Object[this.maxSize];
		for (int i = 0; i < this.maxSize; i++) {
			objs[i] = peca;
		}
		return objs;
	}

}
