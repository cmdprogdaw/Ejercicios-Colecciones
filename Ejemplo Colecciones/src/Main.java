import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class Main {
	
	static int [] numeros = {3, 7, 2, 9, 8, 6, 4, 5, 1};
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>(); //crear una cola a partir de una linkedlist, podemos hacerlo porque queue implementa a linked list
		HashSet<Integer> hashSet = new HashSet<Integer>();
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		//insertar elementos
		for(int i =0; i <numeros.length; i++) {
			arrayList.add(numeros[i]);
			linkedList.add(numeros[i]);
			queue.add(numeros[i]);
			hashSet.add(numeros[i]);
			treeSet.add(numeros[i]);
		}
		mostrarColeccion(arrayList);
		mostrarColeccion(linkedList);
		mostrarColeccion(queue);
		mostrarColeccion(hashSet);
		mostrarColeccion(treeSet);
	}
	
	static void mostrarColeccion(Collection c) {
		Iterator<Integer> i = c.iterator();
		while (i.hasNext()) {
			Integer numero = i.next();
			System.out.print(numero + ", ");
		}
		System.out.println();
	}
}
