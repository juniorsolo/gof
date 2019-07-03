package padrao.criacional.builder;

public class Jeep extends Veiculo{
	
	private String nome;
	
	public Jeep(String modelo) {
		super(modelo, "Utilitário");
		this.nome = "Jeep";
	}
	
	public String toString() {
		return "Carro: " + this.nome + " " + getModelo() + " " + getTipo();
	}

}
