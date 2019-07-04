package padrao.criacional.factoryMethod;

public class GMCriadorImp extends GMCriador{

	@Override
	public Opala factoryOpala() {
		return new Opala();
	}

	@Override
	public Vectra factoryVectra() {
		return new Vectra();
	}

}
