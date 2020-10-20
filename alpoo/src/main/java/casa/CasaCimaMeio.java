package casa;

public class CasaCimaMeio extends Casa {

	public CasaCimaMeio(Integer numero) { super(numero); }
	@Override
	public void moveCima() {}

	@Override
	public Casa getCima() { return this; }

}
