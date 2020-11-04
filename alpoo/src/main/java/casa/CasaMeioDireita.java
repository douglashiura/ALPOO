package casa;

public class CasaMeioDireita extends Casa {

	public CasaMeioDireita(Integer numero, String nomePosicao) {
		super(numero, nomePosicao);
	}

	@Override
	public void moveDireita() {
	}

	@Override
	public Casa getDireita() {
		return this;
	}

}
