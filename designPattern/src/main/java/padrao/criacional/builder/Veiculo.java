package padrao.criacional.builder;

public abstract class Veiculo {
	
	private String modelo;
	private String tipo;
	
	
	public Veiculo(String modelo, String tipo) {
		this.modelo = modelo;
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public String getTipo() {
		return tipo;
	}	
	
}
