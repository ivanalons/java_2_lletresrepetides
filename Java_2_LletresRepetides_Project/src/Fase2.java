import java.util.ArrayList;
import java.util.List;


public class Fase2 {
	
	public static void executar() {
		
		System.out.println("------");
		System.out.println("FASE 2");
		System.out.println("------");
		
		List<Character> llistaNom = new ArrayList<>();
		llistaNom.add('I');
		llistaNom.add('v');
		llistaNom.add('a');
		llistaNom.add('n');
		llistaNom.add('3');

		
		for (char lletra : llistaNom) {
			
			if (esVocal(lletra)) {
				
				System.out.println(lletra + " �s VOCAL");
				
			}else if (esConsonant(lletra)) {
				
				System.out.println(lletra + " �s CONSONANT");
				
			}else if (esNumero(lletra)) {
				
				System.out.println(lletra + " �s N�MERO i els noms de persones no contenen n�meros!");
				
			}else {
				
				System.out.println(lletra);
				
			}
		}
	}

	public static boolean esConsonant(char lletra) {
		return "bcdfghjklmn�pqrstvwxyz".contains(String.valueOf(lletra).toLowerCase());
	}
	
	public static boolean esVocal(char lletra) {
		return "aeiou".contains(String.valueOf(lletra).toLowerCase());
	}
	
	public static boolean esNumero(char lletra) {
		return "1234567890".contains(String.valueOf(lletra));
	}
	
}
