package br.ies.visao.web;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.ies.main.banco.de.dados.BancoDeDadosPessoa;
import br.ies.main.entidades.Pessoa;

@SessionScoped
@ManagedBean(name = "login")
public class Login implements Serializable {
	private static final long serialVersionUID = 1L;

	private Boolean primeiraInteracao;
	private Boolean estaLogado;
	private Boolean senhaErrada;
	private String nome;
	private String senha;
	private Boolean permitido;

	private Pessoa usuario;

	public Login() {
		usuario = new Pessoa("", "");
		estaLogado = false;
		senhaErrada = false;
		primeiraInteracao = true;
		permitido = false;
		nome = "";
		senha = "";
	}

	public String autenticar() throws SQLException {
		usuario.setNome(nome);
		usuario.setSenha(senha);
		BancoDeDadosPessoa banco = new BancoDeDadosPessoa();
		List<String> nomesJaExistentes = banco.retornarTodosOsNomeDePessoas();
		primeiraInteracao = false;

		for (String iterator : nomesJaExistentes) {
			if (nome.equals(iterator)) {
				if (banco.retornarSenha(nome).equals(senha)) {
					estaLogado = true;
					senhaErrada = false;

					return "jogo.xhtml";
				} else {
					estaLogado = false;
					senhaErrada = true;
					return "index.xhtml";
				}
			} else {
				estaLogado = false;
				senhaErrada = false;
				return "index.xhtml";
			}
		}
		return "index.xhtml";

	}

	public String loginStatus() {
		if (!primeiraInteracao) {
			if (estaLogado) {
				return "Sucesso!";
			} else {
				if (senhaErrada) {
					;
					return "Senha Incorreta.";
				} else {
					return "Usuario não existe.";
				}
			}
		} else {
			return "";
		}
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void checa() {
		Boolean preenchido = nome.equals("") || senha.equals("");

		HashMap<Boolean, Runnable> campoPreenchido = new HashMap<Boolean, Runnable>();

		try {
			List<String> nomesJaExistentes = new BancoDeDadosPessoa().retornarTodosOsNomeDePessoas();
			HashMap<Boolean, Runnable> nomeJaCadastrado = new HashMap<Boolean, Runnable>();

			for (int i = 0; i < nomesJaExistentes.size(); i++) {
				nomeJaCadastrado.put(true, () -> {
					BancoDeDadosPessoa banco = new BancoDeDadosPessoa();
					Pessoa pessoa = new Pessoa(nome, senha);
					try {
						banco.jaExistente(pessoa);
					} catch (Exception e2) {
					}
					permitido = true;
				});

				nomeJaCadastrado.put(false, () -> nomesJaExistentes.get(0));

				Boolean x = nomesJaExistentes.get(i).equals(nome)
						&& new BancoDeDadosPessoa().retornarSenha(nomesJaExistentes.get(i)).equals(senha);

				nomeJaCadastrado.get(x).run();
			}

			try {
				for (int i = 0; i < nomesJaExistentes.size(); i++) {
					Boolean x = nomesJaExistentes.get(i).equals(nome);
					nomeJaCadastrado.put(true, () -> nomesJaExistentes.get(-1));
					nomeJaCadastrado.put(false, () -> nomesJaExistentes.get(0));
					nomeJaCadastrado.get(x).run();
				}

				System.out.println("Cadastrado com sucesso!");
				campoPreenchido.put(false, () -> {
					BancoDeDadosPessoa banco = new BancoDeDadosPessoa();
					Pessoa pessoa = new Pessoa(nome, senha);
					try {
						banco.jaExistente(pessoa);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					permitido = true;
				});
				campoPreenchido.put(true, () -> permitido = false);

				campoPreenchido.get(preenchido).run();
			} catch (Exception e) {
				System.out.println("Nome já existente!2");
			}

		} catch (Exception e3) {
			System.out.println("Nome já existente!");
		}
	}

	public String irParaOJogo() {
		checa();
		HashMap<Boolean, String> mapa = new HashMap<Boolean, String>();
		mapa.put(true, "jogo");
		mapa.put(false, "");
		return mapa.get(getPermitido());
	}

	public Boolean getPermitido() {
		return permitido;
	}

	public void setPermitido(Boolean permitido) {
		this.permitido = permitido;
	}

}