package padrao.estrutural.bridge;

public abstract class BridgePublicacao {
	private Publicacao publicacao;

	public BridgePublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}
	
	public Publicacao getPublicacao() {
		return this.publicacao;
	}
}
