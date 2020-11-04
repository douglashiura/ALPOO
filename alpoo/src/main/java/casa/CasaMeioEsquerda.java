package casa;

public class CasaMeioEsquerda extends Casa {

	public CasaMeioEsquerda(Integer numero, String nomePosicao) {
		super(numero, nomePosicao);
	}

	@Override
	public void moveEsquerda() {
	}

	@Override
	public Casa getEsquerda() {
		return this;
	}
}
