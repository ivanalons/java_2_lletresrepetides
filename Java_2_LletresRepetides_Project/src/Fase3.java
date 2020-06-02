import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fase3 {
	
	public static void executar() {
		
		System.out.println("------");
		System.out.println("FASE 3");
		System.out.println("------");		
		
		Map <Character, Integer> map = new HashMap <Character, Integer> ();
		
		//Inicialitzar la llista
		List<Character> llistaNom = new ArrayList<>();
		llistaNom.add('I');
		llistaNom.add('v');
		llistaNom.add('a');
		llistaNom.add('n');
		llistaNom.add('A');
		llistaNom.add('i');
		
		//Emmagatzemar en el Map el nombre de vegades que apareixen les lletres de la llista
		int contador = 0;
		char lletra;
		
		for(char element : llistaNom) {
			
			lletra = Character.toLowerCase(element);
			
			if (map.containsKey(lletra)==false) {
				map.put(lletra,1);
			}else {
				contador = map.get(lletra);
				contador++;
				map.put(lletra,contador);
			}
			
		}

		//Mostrar el Map per la consola
		String nom = llistaNom.toString();
		System.out.println("El nom és : " + nom);
		
		for (char i : map.keySet()) {
			
			lletra = Character.toLowerCase(i);
			System.out.println("La lletra \"" + lletra + "\" apareix " + map.get(lletra) + " vegades");
		}
		
	}

}
