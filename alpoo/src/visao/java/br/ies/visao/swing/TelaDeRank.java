package br.ies.visao.swing;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

import br.ies.main.banco.de.dados.BancoDeDadosPessoa;

public class TelaDeRank {

	private JFrame frame;
	List<String> listaDeNomesDoRank;
	List<Integer> listaDeTemposnoRank;

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
		frame.getContentPane().setLayout(null);
		JList<String> list = new JList<String>(retornaListaDeNomes(listaDeVencedores));
		list.setFont(new Font("Tahoma", Font.PLAIN, 22));
		list.setBounds(0, 0, 216, 261);

		getFrame().getContentPane().add(list);
		
		DefaultListModel<Integer> listaDeMelhoresTempos = new DefaultListModel<Integer>();

		JList<Integer> list_1 = new JList<Integer>(retornaListaDeTempos(listaDeMelhoresTempos));
		list_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		list_1.setBounds(226, 0, 208, 261);
		frame.getContentPane().add(list_1);
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
	
	public DefaultListModel<Integer> retornaListaDeTempos(DefaultListModel<Integer> listaDeVencedores) {
		try {
			listaDeTemposnoRank = new BancoDeDadosPessoa().retornarTodosOsTemposDePessoas();
			for (int i = 0; i < listaDeTemposnoRank.size(); i++) {
				listaDeVencedores.add(i, listaDeTemposnoRank.get(i));
			}
			return listaDeVencedores;
		} catch (Exception e) {
			return listaDeVencedores;
		}
	}
}
