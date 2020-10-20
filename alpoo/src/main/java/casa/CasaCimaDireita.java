package casa;

public class CasaCimaDireita extends Casa {

	public CasaCimaDireita(Integer numero) { super(numero); }
	
	@Override
	public void moveCima() {}
	
	@Override
	public void moveDireita() {}


	@Override
	public Casa getCima() { return this; }
	
	@Override
	public Casa getDireita() { return this;	}

}
