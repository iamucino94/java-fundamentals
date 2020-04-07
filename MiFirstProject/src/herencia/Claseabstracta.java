package herencia;

public abstract class Claseabstracta {
	private int numero;
	public final int CONSTANTE = 1;
	public int modificable;
	
	public Claseabstracta(int numero) {
		this.numero = numero;
	}
	
	public abstract void metodoAbstracto();
	
	public void hacerAlgo() {
		System.out.println("hacer algo desde la superclase");
	}
}
