package padrao.criacional.singleton;

public class ContaCorrente {
	
	private String numeroConta;
	private static ContaCorrente contaCorrente;	

	private ContaCorrente() {
		//privado para não ser mais acessado
	}
	
	public static ContaCorrente newInstance() {
		if(contaCorrente == null) {
			contaCorrente =  new ContaCorrente();
		}
		return contaCorrente;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String toString() {
		return numeroConta;
	}
}
