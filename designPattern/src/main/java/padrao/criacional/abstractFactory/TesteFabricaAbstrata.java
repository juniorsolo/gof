package padrao.criacional.abstractFactory;

import java.util.Scanner;

public class TesteFabricaAbstrata {

	private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		new TesteFabricaAbstrata().executar();
	}
	
	public void executar() {
		System.out.println("Digite 1-Companhia ou 2-Guarda. ");
		Byte opc= sc.nextByte();
		Modelo modelo = null;
		
		switch (opc) {
		case 1:
			modelo = new FabricaCompanhia();
			break;
		case 2:
			modelo = new FabricaGuarda();
			break;
		default:
			System.out.println("Opção inválida!!!");
			break;
			
		}
		if(modelo != null) {
			System.out.println(modelo.getCachorro());
			System.out.println( modelo.getGato());
		}
	}
	
}
