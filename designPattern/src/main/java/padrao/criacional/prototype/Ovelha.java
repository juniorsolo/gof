package padrao.criacional.prototype;

public class Ovelha implements Cloneable{
	
	private String nome;
	
	private int idade;

	public Ovelha(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String toString() {
		return getNome() + " - " + getIdade();
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch (CloneNotSupportedException e) {
			System.err.println(e.getStackTrace());
		}
		return obj;
		
	}
}
