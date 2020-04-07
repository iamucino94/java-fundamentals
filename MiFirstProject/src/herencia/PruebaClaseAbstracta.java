package herencia;

public class PruebaClaseAbstracta {

	public static void main(String[] args) {
		Claseabstracta ejemplo = new SubclaseAbstracta(5);
		ejemplo.metodoAbstracto();
		ejemplo.hacerAlgo();
		
		final Claseabstracta ejemplo2 = new SubclaseAbstracta(10);
//		ejemplo2 = new SubclaseAbstracta(1);
		ejemplo.modificable = 100;
	}

}
