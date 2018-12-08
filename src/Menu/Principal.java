package Menu;

import javax.swing.JOptionPane;
import Model.ListaPecas;
import Model.Pilha;

public class Principal {

	public static void main(String[] args) {
		int item;

		Pilha pilha = new Pilha(10);
		ListaPecas lista = new ListaPecas(10);

		do {
			item = Integer.parseInt(JOptionPane.showInputDialog(null,
					"******************************\n" + " MENU \n" + " 1 - Inserir Pe�a \n" + " 2 - Remover Pe�a \n"
							+ " 3 - Verificar Lista de Pe�as \n" + " 4 - Comprar Pe�a \n" + " 5 - Devolver Pe�a \n"
							+ " 6 - Lista de Compras \n" + " 0 - Sair \n" + "******************************\n"
							+ "Digite uma das op��es: \n",
					"Estoque de Pe�as", JOptionPane.INFORMATION_MESSAGE));

			switch (item) {
			case 1: {
				if (!lista.cheio()) {
					String nome = (JOptionPane.showInputDialog(null, "Digite o nome da Pe�a", "Estoque de Pe�as!",
							JOptionPane.INFORMATION_MESSAGE));
					lista.adiciona(nome);

					JOptionPane.showMessageDialog(null, "Pe�a inserida! ");

					if (lista.cheio()) {
						JOptionPane.showMessageDialog(null, "Lista Cheia! ");
					}

				} else {
					JOptionPane.showMessageDialog(null, "Estoque de Pe�as Cheio! ");
				}
			}
				break;
			case 2: {
				if (!lista.vazio()) {

					int pos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a posi��o da Pe�a",
							JOptionPane.INFORMATION_MESSAGE));
					lista.remove(pos);
					JOptionPane.showMessageDialog(null, "Pe�a Removida da lista Apenas! ");
				}
			}
				break;
			case 3: {

				if (lista.vazio()) {
					JOptionPane.showMessageDialog(null, "Lista vazio");
				} else {

					JOptionPane.showMessageDialog(null, lista.toArray());

				}
			}

				break;

			case 4: {

				if (!pilha.cheia()) {
					String peca = (JOptionPane.showInputDialog(null, "Digite o nome da Pe�a a Comprar",
							"Compra de Pe�as!", JOptionPane.INFORMATION_MESSAGE));
					pilha.insere(peca);

					JOptionPane.showMessageDialog(null, "Pe�a Comprada! ");

					if (pilha.cheia()) {
						JOptionPane.showMessageDialog(null, "Erro ao efetuar Compra! ");
					}

				}
			}

				break;

			case 5: {

				if (!pilha.vazia()) {

					pilha.remove();
					JOptionPane.showMessageDialog(null, "Pe�a Devolvida! ");
				} else {
					JOptionPane.showMessageDialog(null, "N�o h� Pe�as a ser Devolvida! ");
				}
			}

				break;

			case 6: {

				if (pilha.vazia()) {
					JOptionPane.showMessageDialog(null, "Lista de Compras vazia");
				} else {

					JOptionPane.showMessageDialog(null, pilha.toArray());

				}
			}

				break;

			default: {
				if (item != 0) {
					JOptionPane.showMessageDialog(null, "Valor inv�lido, digite novamente!");
				} else {
					if (item == 0)
						JOptionPane.showMessageDialog(null, "Voc� est� saindo do programa!");
				}
			}
				break;
			}

		} while (item != 0);

	}

}
