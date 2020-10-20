package casa;

public class CasaMeioEsquerda extends Casa {

	public CasaMeioEsquerda(Integer numero) { super(numero); }
	
	@Override
	public void moveEsquerda() {}
	
	@Override
	public Casa getEsquerda() { return this; }

}
