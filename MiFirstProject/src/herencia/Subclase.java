package herencia;

public class Subclase extends Superclase{
	
	public Subclase() {
		super(1);
	}
	
	public void hacerOtraCosa() {
		
//		System.out.println(this.numero2);
		System.out.println(this.numero3);
		System.out.println(this.numero4);
		System.out.println(super.numero);
	}
	
	@Override
	public void hacerAlgo() {
		System.out.println("haciendo algo desde la subclase");
	}
}
