
import java.util.HashMap;
import java.util.Map;

public class CuentaTexto {

	private int numLetras = 0;
	private int numPalabras = 0;
	private Map<Character, Integer> numOcurrenciasPorLetra = new HashMap<Character, Integer>();

	public CuentaTexto(String s) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.toLowerCase().charAt(i);
			if (Character.isAlphabetic(c)) {
				numLetras++;

				int valor;
				if (numOcurrenciasPorLetra.containsKey(c))
					valor = numOcurrenciasPorLetra.get(c) + 1;
				else
					valor = 1;
				numOcurrenciasPorLetra.put(c, valor);

//					if (numOcurrenciasPorLetra.containsKey(c))
//						numOcurrenciasPorLetra.put(c, numOcurrenciasPorLetra.get(c) + 1);
//					else
//						numOcurrenciasPorLetra.put(c, 1);

				if (i == 0 || !Character.isAlphabetic(s.charAt(i - 1))) {
					numPalabras++;
				}
			}
		}
	}

	public int getNumLetras() {
		return numLetras;
	}

	public int getNumPalabras() {
		return numPalabras;
	}

	public int getNumOcurrenciasPorLetra(char c) {
		if (!numOcurrenciasPorLetra.containsKey(c))
			throw new RuntimeException("No es una letra o la letra no est� en el texto");
		return numOcurrenciasPorLetra.get(c);
	}

	public static void main(String[] args) {
		CuentaTexto ct = new CuentaTexto("Esto es una prueba");
		System.out.println("Numero de letras: " + ct.getNumLetras());
		System.out.println("Numero de palabras: " + ct.getNumPalabras());
		System.out.println("Numero de aes: " + ct.getNumOcurrenciasPorLetra('a'));

	}

}
