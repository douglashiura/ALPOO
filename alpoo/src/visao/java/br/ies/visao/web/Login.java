package br.ies.visao.web;

import java.io.Serializable;
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

	private Boolean primeiraInteracaoDoUsuario;
	private Boolean estaLogado;
	private Boolean permissaoConcedida;
	private String retornoDoStatusDoLogin;
	private String nome;
	private String senha;
	private Pessoa jogador;

	public Login() {
		setNome("");
		setSenha("");
		jogador = new Pessoa(nome, senha);
		setEstaLogado(false);
		setRetornoDoStatusDoLogin("");
		setPrimeiraInteracaoDoUsuario(true);
		setPermissaoConcedida(false);

	}
	
	public String statusDoLogin() {
		try {
			HashMap<Boolean, String> hashmap = new HashMap<Boolean, String>();
			hashmap.put(true, "Sucesso!");
			hashmap.put(false, "Senha Incorreta.");

			HashMap<Boolean, Runnable> mapPrimeiraInteracao = new HashMap<Boolean, Runnable>();
			mapPrimeiraInteracao.put(false, () -> {
				setRetornoDoStatusDoLogin(hashmap.get(getEstaLogado()));
			});

			mapPrimeiraInteracao.get(getPrimeiraInteracaoDoUsuario()).run();
			return getRetornoDoStatusDoLogin();
		} catch (Exception e) {
			return "";
		}
	}

	public void autenticar() {
		Boolean preenchido = nome.equals("") || senha.equals("");

		HashMap<Boolean, Runnable> nomeJaCadastrado = new HashMap<Boolean, Runnable>();
		HashMap<Boolean, Runnable> campoPreenchido = new HashMap<Boolean, Runnable>();
		BancoDeDadosPessoa banco = new BancoDeDadosPessoa();

		setPrimeiraInteracaoDoUsuario(false);
		try {
			List<String> nomesJaExistentes = new BancoDeDadosPessoa().retornarTodosOsNomeDePessoas();
			for (Integer i = 0; i < nomesJaExistentes.size(); i++) {
				nomeJaCadastrado.put(true, () -> {
					jogador.setNome(nome);
					jogador.setSenha(senha);
					try {
						banco.jaExistente(jogador);
					} catch (Exception e2) {

					}
					permissaoConcedida = true;
					nomesJaExistentes.get(-1);
				});

				nomeJaCadastrado.put(false, () -> permissaoConcedida = false);
				Boolean x = nomesJaExistentes.get(i).equals(nome)
						&& new BancoDeDadosPessoa().retornarSenha(nomesJaExistentes.get(i)).equals(senha);

				nomeJaCadastrado.get(x).run();
			}

			try {
				for (Integer i = 0; i < nomesJaExistentes.size(); i++) {
					Boolean x = nomesJaExistentes.get(i).equals(nome);
					nomeJaCadastrado.put(true, () -> {
						permissaoConcedida = false;
						nomesJaExistentes.get(-1);
					});
					nomeJaCadastrado.put(false, () -> permissaoConcedida = true);
					nomeJaCadastrado.get(x).run();
				}

				campoPreenchido.put(false, () -> {
					jogador.setNome(nome);
					jogador.setSenha(senha);
					try {
						banco.jaExistente(jogador);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					permissaoConcedida = true;
				});
				campoPreenchido.put(true, () -> permissaoConcedida = false);

				campoPreenchido.get(preenchido).run();
			} catch (Exception e) {

			}

		} catch (Exception e3) {

		}
	}

	public String irParaOJogo() {
		autenticar();
		HashMap<Boolean, String> mapa = new HashMap<Boolean, String>();
		mapa.put(true, "jogo");
		mapa.put(false, "");
		return mapa.get(getPermissaoConcedida());
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

	public Boolean getPermissaoConcedida() {
		return permissaoConcedida;
	}

	public void setPermissaoConcedida(Boolean permitido) {
		this.permissaoConcedida = permitido;
	}
	

	public Boolean getPrimeiraInteracaoDoUsuario() {
		return primeiraInteracaoDoUsuario;
	}
	

	public void setPrimeiraInteracaoDoUsuario(Boolean primeiraInteracaoDoUsuario) {
		this.primeiraInteracaoDoUsuario = primeiraInteracaoDoUsuario;
	}
	

	public Boolean getEstaLogado() {
		return estaLogado;
	}
	

	public void setEstaLogado(Boolean estaLogado) {
		this.estaLogado = estaLogado;
	}

	public String getRetornoDoStatusDoLogin() {
		return retornoDoStatusDoLogin;
	}

	public void setRetornoDoStatusDoLogin(String retornoDoStatusDoLogin) {
		this.retornoDoStatusDoLogin = retornoDoStatusDoLogin;
	}

}