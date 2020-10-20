package casa;

public class CasaMeioDireita extends Casa {

	public CasaMeioDireita(Integer numero) { super(numero); }
	
	@Override
	public void moveDireita() {}
	
	@Override
	public Casa getDireita() { return this; }

}
