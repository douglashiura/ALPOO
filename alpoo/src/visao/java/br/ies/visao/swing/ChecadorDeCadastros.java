package br.ies.visao.swing;

import java.util.HashMap;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.ies.main.banco.de.dados.BancoDeDadosPessoa;
import br.ies.main.entidades.Pessoa;

public class ChecadorDeCadastros {

	public ChecadorDeCadastros() {

	}

	public void checa(TelaDeLogin tela, JFrame frame) {
		Boolean preenchido = tela.getTextField().getText().equals("") || tela.getTextField_1().getText().equals("");

		HashMap<Boolean, Runnable> campoPreenchido = new HashMap<Boolean, Runnable>();

		try {
			List<String> nomesJáExistentes = new BancoDeDadosPessoa().retornarTodosOsNomeDePessoas();
			HashMap<Boolean, Runnable> nomeJaCadastrado = new HashMap<Boolean, Runnable>();

			for (int i = 0; i < nomesJáExistentes.size(); i++) {
				nomeJaCadastrado.put(true, () -> {
					BancoDeDadosPessoa banco = new BancoDeDadosPessoa();
					Pessoa pessoa = new Pessoa(tela.getTextField().getText(), tela.getTextField_1().getText());
					try {
						banco.jaExistente(pessoa);
					} catch (Exception e2) {
					}
					new TelaSwingJogoDoOito().getFrmJogoDoOito().setVisible(true);
					frame.dispose();
				});

				nomeJaCadastrado.put(false, () -> nomesJáExistentes.get(0));

				Boolean x = nomesJáExistentes.get(i).equals(tela.getTextField().getText()) && new BancoDeDadosPessoa()
						.retornarSenha(nomesJáExistentes.get(i)).equals(tela.getTextField_1().getText());

				nomeJaCadastrado.get(x).run();
			}
			System.out.println("Cadastrado com sucesso!");
			campoPreenchido.put(false, () -> {
				BancoDeDadosPessoa banco = new BancoDeDadosPessoa();
				Pessoa pessoa = new Pessoa(tela.getTextField().getText(), tela.getTextField_1().getText());
				try {
					banco.jaExistente(pessoa);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				new TelaSwingJogoDoOito().getFrmJogoDoOito().setVisible(true);
				frame.dispose();
			});
			campoPreenchido.put(true, () -> JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos!"));

			campoPreenchido.get(preenchido).run();
		} catch (Exception e3) {
			System.out.println("Nome já existente!");
		}
	}
}
