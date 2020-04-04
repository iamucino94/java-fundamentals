package herencia;

public class Superclase {
	public int numero;
	private int numero2;
	protected int numero3;
	int numero4;
	
	public Superclase(int a) {
		System.out.println("constructor de la superclase");
		this.numero = 1;
	}
	
	public void hacerAlgo() {
		System.out.println("Haciendo algo desde la superclase");
	}
}
