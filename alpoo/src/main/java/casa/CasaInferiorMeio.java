package casa;

public class CasaInferiorMeio extends Casa {

	public CasaInferiorMeio(Integer numero, String nomePosicao) {
		super(numero, nomePosicao);
	}

	@Override
	public void moveBaixo() {
	}

	@Override
	public Casa getBaixo() {
		return this;
	}
}
