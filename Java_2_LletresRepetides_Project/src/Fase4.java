import java.util.ArrayList;
import java.util.List;

public class Fase4 {
	
	public static void executar() {
		
		System.out.println("------");
		System.out.println("FASE 4");
		System.out.println("------");
		
		List<Character> name = new ArrayList<>();
		name.add('I');
		name.add('v');
		name.add('a');
		name.add('n');
		
		List<Character> surname = new ArrayList<>();
		surname.add('P');
		surname.add('e');
		surname.add('r');
		surname.add('e');
		surname.add('z');

		List<Character> fullName = new ArrayList<>();
		fullName.addAll(name);
		fullName.add(' ');	
		fullName.addAll(surname);	
		
		System.out.println(fullName);
		
		for (char lletra : fullName) {
			System.out.print(lletra);
		}
		System.out.print("\n");
		
		
	}

}
