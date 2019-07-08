package padrao.estrutural.bridge;

public class TesteBridge {

	public static void main(String[] args) {
		
		new TesteBridge().publicar();
	}
	
	public void publicar() {
		 Livro livro = new Livro("Design Pattern", "Gof");
		 
		 System.out.println(livro);
	}	 
}
