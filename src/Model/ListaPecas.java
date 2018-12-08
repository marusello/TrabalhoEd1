package Model;

public class ListaPecas implements Ilista {

	private Object[] pecas;
	private int fim;
	private int qtde;

	public ListaPecas(int tamanho) {
		this.pecas = new Object[tamanho];
		this.fim = 0;
		this.qtde = 0;
	}

	@Override
	public int tamanho() {
		return this.qtde;
	}

	@Override
	public boolean vazio() {
		return (this.qtde == 0);
	}

	public boolean cheio() {
		return this.fim >= this.pecas.length;
	}

	@Override
	public boolean adiciona(Object obj) {
		if (!cheio()) {
			this.pecas[this.fim] = obj;
			this.fim++;
			this.qtde++;
			return true;
		}
		return false;
	}

	@Override
	public boolean adiciona(int pos, Object obj) {
		if (!cheio() && pos < this.fim) {
			for (int i = this.fim - 1; i >= pos; i--) {
				this.pecas[i + 1] = this.pecas[i];
			}

			this.pecas[pos] = obj;
			this.fim++;
			this.qtde++;
			return true;
		} else if (!cheio() && pos >= this.fim) {
			return this.adiciona(obj);
		}
		return false;
	}

	@Override
	public Object remove(int pos) {
		Object removido;
		if (pos < this.fim) {
			removido = this.pecas[pos];
			for (int i = pos; i < this.fim; i++) {
				this.pecas[i] = this.pecas[i + 1];
			}
			this.fim--;
			this.qtde--;
			return removido;
		}
		return null;
	}

	@Override
	public Object[] toArray() {
		Object[] objs = new Object[this.fim];
		for (int i = 0; i < this.fim; i++) {
			objs[i] = this.pecas[i];
		}
		return objs;
	}
}
