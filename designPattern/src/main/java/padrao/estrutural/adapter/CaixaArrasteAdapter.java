package padrao.estrutural.adapter;

public class CaixaArrasteAdapter implements Vetor{

	private CaixaArraste caixaArraste = new CaixaArraste();
	
	@Override
	public int getPosX() {
		Coordenada c = caixaArraste.getTopoEsq();
		return c.getX();
	}

	@Override
	public int getPosY() {
		Coordenada c = caixaArraste.getTopoEsq();
		return c.getY();
	}

	@Override
	public int getLargura() {
		Coordenada c1 = caixaArraste.getTopoEsq();
		Coordenada c2 = caixaArraste.getRodapeDir();
		
		return c2.getX() - c1.getX();
	}

	@Override
	public int getAltura() {
		Coordenada c1 = caixaArraste.getTopoEsq();
		Coordenada c2 = caixaArraste.getRodapeDir();
		
		return c2.getY() - c1.getX();
	}

}
