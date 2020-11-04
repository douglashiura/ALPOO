package casa;

public class CasaCimaMeio extends Casa {

	public CasaCimaMeio(Integer numero, String nomePosicao) {
		super(numero, nomePosicao);
	}
	
	@Override
	public void moveCima() {}

	@Override
	public Casa getCima() { return this; }

}
