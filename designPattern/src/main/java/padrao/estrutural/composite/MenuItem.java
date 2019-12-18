package padrao.estrutural.composite;


public class MenuItem extends MenuComponente{
	
	public MenuItem(String descricao, String link) {
		super(descricao, link);
	}
	
	@Override
	public void print() {
		System.out.println(super.toString());
	}

}
