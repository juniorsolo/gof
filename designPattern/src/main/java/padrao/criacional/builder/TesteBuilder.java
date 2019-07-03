package padrao.criacional.builder;

public class TesteBuilder {
	public static void main(String[] args) {
		new TesteBuilder().executar();
	}
	
	public void executar() {
		Montadora montadora = new Montadora();
		
		Veiculo car1 = montadora.montar('F', "Testerossa");
		Veiculo car2 = montadora.montar('J', "Renegade");
		
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		
	}
}
