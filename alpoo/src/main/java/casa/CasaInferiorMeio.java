package casa;

public class CasaInferiorMeio extends Casa {

	public CasaInferiorMeio(Integer numero) { super(numero); }
	@Override
	public void moveBaixo() {}
	
	@Override
	public Casa getBaixo() { return this; }

}
