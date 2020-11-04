package casa;

public class CasaInferiorEsquerda extends Casa {

	public CasaInferiorEsquerda(Integer numero, String nomePosicao) {
		super(numero, nomePosicao);
	}

	@Override
	public void moveBaixo() {
	}

	@Override
	public void moveEsquerda() {
	}

	@Override
	public Casa getEsquerda() {
		return this;
	}

	@Override
	public Casa getBaixo() {
		return this;
	}

}
