package otherPackage;

import com.example.domain.AccessExample;

public class AcessTester2 {

	public static void main(String[] args) {
		AccessExample ejemplo = new AccessExample();
		System.out.println(ejemplo.numero1);
		ejemplo.numero1 = 2;
//		ejemplo.numero2 = 1;
//		ejemplo.numero3 = 1;
//		ejemplo.numero4 = 1;
	}

}
