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
					"******************************\n" + " MENU \n" + " 1 - Inserir Peça \n" + " 2 - Remover Peça \n"
							+ " 3 - Verificar Lista de Peças \n" + " 4 - Comprar Peça \n" + " 5 - Devolver Peça \n"
							+ " 6 - Lista de Compras \n" + " 0 - Sair \n" + "******************************\n"
							+ "Digite uma das opções: \n",
					"Estoque de Peças", JOptionPane.INFORMATION_MESSAGE));

			switch (item) {
			case 1: {
				if (!lista.cheio()) {
					String nome = (JOptionPane.showInputDialog(null, "Digite o nome da Peça", "Estoque de Peças!",
							JOptionPane.INFORMATION_MESSAGE));
					lista.adiciona(nome);

					JOptionPane.showMessageDialog(null, "Peça inserida! ");

					if (lista.cheio()) {
						JOptionPane.showMessageDialog(null, "Lista Cheia! ");
					}

				} else {
					JOptionPane.showMessageDialog(null, "Estoque de Peças Cheio! ");
				}
			}
				break;
			case 2: {
				if (!lista.vazio()) {

					int pos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a posição da Peça",
							JOptionPane.INFORMATION_MESSAGE));
					lista.remove(pos);
					JOptionPane.showMessageDialog(null, "Peça Removida da lista Apenas! ");
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
					String peca = (JOptionPane.showInputDialog(null, "Digite o nome da Peça a Comprar",
							"Compra de Peças!", JOptionPane.INFORMATION_MESSAGE));
					pilha.insere(peca);

					JOptionPane.showMessageDialog(null, "Peça Comprada! ");

					if (pilha.cheia()) {
						JOptionPane.showMessageDialog(null, "Erro ao efetuar Compra! ");
					}

				}
			}

				break;

			case 5: {

				if (!pilha.vazia()) {

					pilha.remove();
					JOptionPane.showMessageDialog(null, "Peça Devolvida! ");
				} else {
					JOptionPane.showMessageDialog(null, "Não há Peças a ser Devolvida! ");
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
					JOptionPane.showMessageDialog(null, "Valor inválido, digite novamente!");
				} else {
					if (item == 0)
						JOptionPane.showMessageDialog(null, "Você está saindo do programa!");
				}
			}
				break;
			}

		} while (item != 0);

	}

}
