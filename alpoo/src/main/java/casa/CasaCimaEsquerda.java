package casa;

public class CasaCimaEsquerda extends Casa {

	public CasaCimaEsquerda(Integer numero, String nomePosicao) {
		super(numero, nomePosicao);
	}

	@Override
	public void moveCima() {
	}

	@Override
	public void moveEsquerda() {
	}

	@Override
	public Casa getCima() {
		return this;
	}

	@Override
	public Casa getEsquerda() {
		return this;
	}

}
