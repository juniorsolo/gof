package padrao.criacional.builder;

public class MontadoraBuilderImpl implements MontadoraBuilder {
	
	private Veiculo veiculo;
	
	public void montar(char tipo, String modelo) {
		
		switch (tipo) {
		case 'F':
			veiculo = new Ferrari(modelo);
			break;
		case 'J':
			veiculo = new Jeep(modelo);
			break;
			
		default:
			break;
		}
		
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

}
