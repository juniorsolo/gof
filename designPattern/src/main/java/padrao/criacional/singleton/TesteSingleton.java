package padrao.criacional.singleton;

public class TesteSingleton {

	public static void main(String[] args) {
		new TesteSingleton().execute();
	}
	
	public void execute() {
		ContaCorrente c1 = ContaCorrente.newInstance();
		c1.setNumeroConta("22344-5");
		System.out.println(c1 + " - " + c1.hashCode());
		
		ContaCorrente c2 = ContaCorrente.newInstance();
		c2.setNumeroConta("99887-7");
		System.out.println(c2 + " - " + c2.hashCode());
		
	}
}
