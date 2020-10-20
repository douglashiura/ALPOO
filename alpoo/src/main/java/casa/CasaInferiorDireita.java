package casa;

public class CasaInferiorDireita extends Casa {

	public CasaInferiorDireita(Integer numero) { super(numero); }
	
	@Override
	public void moveBaixo() {}

	@Override
	public void moveDireita() {}

	@Override
	public Casa getDireita() { return this; }

	@Override
	public Casa getBaixo() { return this; }

}
