package padrao.criacional.builder;

public class Montadora {
	
	private MontadoraBuilder builder = new MontadoraBuilderImpl();
	
	public Veiculo montar(char tipo, String modelo) {
		builder.montar(tipo, modelo);
		return builder.getVeiculo();
	}
}
