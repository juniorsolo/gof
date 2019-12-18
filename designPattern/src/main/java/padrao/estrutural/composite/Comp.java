package padrao.estrutural.composite;

public class Comp {

	public static void main(String[] args) {
		new Comp().montarMenu();

	}
	
	public void montarMenu() {
		Menu parte1 = new Menu("Parte 1");
		parte1.add(new MenuItem("Item 1", "Evento 1"));
		parte1.add(new MenuItem("Item 2", "Evento 2"));
		parte1.add(new MenuItem("Item 3", "Evento 3"));
		
		Menu parte2 = new Menu("Parte 2");
		parte2.add(new MenuItem("Item 1", "Evento 4"));
		parte2.add(new MenuItem("Item 2", "Evento 5"));
		
		parte1.add(parte2);
		parte1.print();
		
//		Menu principal = new Menu("Principal");
//		principal.add(parte1);
//		principal.add(parte2);
//		principal.print();
	}

}
