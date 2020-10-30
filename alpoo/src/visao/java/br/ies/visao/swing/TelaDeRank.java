package br.ies.visao.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

import br.ies.main.banco.de.dados.BancoDeDadosPessoa;

public class TelaDeRank {

	private JFrame frame;
	List<String> listaDeNomesDoRank;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeRank window = new TelaDeRank();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaDeRank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		getFrame().setBounds(100, 100, 450, 300);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		DefaultListModel<String> listaDeVencedores = new DefaultListModel<String>();
		JList<String> list = new JList<String>(retornaListaDeNomes(listaDeVencedores));

		getFrame().getContentPane().add(list, BorderLayout.NORTH);
	}

	public JFrame getFrame() {
		return frame;
	}

	public DefaultListModel<String> retornaListaDeNomes(DefaultListModel<String> listaDeVencedores) {
		try {
			listaDeNomesDoRank = new BancoDeDadosPessoa().retornarTodosOsNomeDePessoas();
			for (int i = 0; i < listaDeNomesDoRank.size(); i++) {
				listaDeVencedores.add(i, listaDeNomesDoRank.get(i));
			}
			return listaDeVencedores;
		} catch (Exception e) {
			listaDeVencedores.add(0, "Não foi possível contatar o servidor.");
			return listaDeVencedores;
		}
	}

}
