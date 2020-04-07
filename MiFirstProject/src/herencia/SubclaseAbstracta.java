package herencia;

import java.io.Serializable;

public class SubclaseAbstracta extends Claseabstracta implements Interfaz, Serializable {
	
	public SubclaseAbstracta(int numero) {
		super(numero);
	}

	@Override
	public void metodoAbstracto() {
		System.out.println("implementando método abstracto");
	}

	@Override
	public void hacerAlgo() {
		super.hacerAlgo();
		System.out.println("Hacer algo desde la subclase");
	}

	@Override
	public void haceralgo2() {
		// TODO Auto-generated method stub
		
	}
}
