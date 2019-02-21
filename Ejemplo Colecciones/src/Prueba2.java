import java.util.HashSet;
import java.util.Set;

public class Prueba2 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		Integer n1 = new Integer(1);
		Integer n2 = new Integer(1);
//		Integer n1 = 1;
//		Integer n2 = 1;
		
		Integer n3 = n1;
		set.add(n1);
		set.add(n2);
		set.add(n3);
		Prueba.mostrarColeccion(set);
	}

}
