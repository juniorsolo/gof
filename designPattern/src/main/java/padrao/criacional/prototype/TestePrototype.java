package padrao.criacional.prototype;

public class TestePrototype {

	public static void main(String[] args) {
		new TestePrototype().execute();

	}
	
	public void execute() {
		Prototype proto = new PrototypeImpl();
		Ovelha oveOriginal = new Ovelha("Dolly", 5);
		Ovelha oveClone = proto.duplicar(oveOriginal);
		
		System.out.println(oveOriginal);
		System.out.println(oveClone);
		
	}
}
