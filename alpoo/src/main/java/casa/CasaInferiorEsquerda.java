package casa;

public class CasaInferiorEsquerda extends Casa {

	public CasaInferiorEsquerda(Integer numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void moveBaixo() {}

	@Override
	public void moveEsquerda() {}

	@Override
	public Casa getEsquerda() { return this; }

	@Override
	public Casa getBaixo() { return this; }


}
