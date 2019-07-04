package padrao.criacional.factoryMethod;

public class TesteFactoryMethod {
	public static void main(String[] args) {
		new TesteFactoryMethod().execute();
	}
	
	public void execute() {
		GMCriador factory = new GMCriadorImp();
		Veiculo car1 = factory.factoryOpala();
		Veiculo car2 = factory.factoryVectra();
		
		System.out.println(car1.getModelo());
		System.out.println(car2.getModelo());
		
	}
}
