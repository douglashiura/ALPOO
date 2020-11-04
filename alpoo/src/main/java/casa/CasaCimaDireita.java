package casa;

public class CasaCimaDireita extends Casa {

	public CasaCimaDireita(Integer numero, String nomePosicao) {
		super(numero, nomePosicao);
	}

	@Override
	public void moveCima() {
	}

	@Override
	public void moveDireita() {
	}

	@Override
	public Casa getCima() {
		return this;
	}

	@Override
	public Casa getDireita() {
		return this;
	}

}
