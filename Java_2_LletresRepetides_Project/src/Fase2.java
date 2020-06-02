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
				
				System.out.println(lletra + " és VOCAL");
				
			}else if (esConsonant(lletra)) {
				
				System.out.println(lletra + " és CONSONANT");
				
			}else if (esNumero(lletra)) {
				
				System.out.println(lletra + " és NÚMERO i els noms de persones no contenen números!");
				
			}else {
				
				System.out.println(lletra);
				
			}
		}
	}

	public static boolean esConsonant(char lletra) {
		return "bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(lletra).toLowerCase());
	}
	
	public static boolean esVocal(char lletra) {
		return "aeiou".contains(String.valueOf(lletra).toLowerCase());
	}
	
	public static boolean esNumero(char lletra) {
		return "1234567890".contains(String.valueOf(lletra));
	}
	
}
