package PackageA;

import java.util.ArrayList;

public class ArrayListVb {
	
	public void test() {
		ArrayList<String> aList = new ArrayList<>();
		
//		aList.add(1, "Vier");				// Voeg toe op positie
//		aList.set(1, "1.5");				// Wijzig de waarde van een element
//		aList.remove(1);					// verwijder een index element 	
//		aList.remove(aList.get(1));			// verwijder een object 
		
//		aList.remove("Twee");				// verwijderd een object  (Dit werkt obv equals)
//		aList.remove(new String("Twee"));	// verwijderd een object dat niet in de lijst staat.

		aList.add("Een");
		aList.add("Twee");
		aList.add("Drie");

		for (String s : aList ) {
			System.out.println(s);			
		}
		
		
//		ELEMENTEN ZELF WIJZIGEN -- STRINGBUILDER
		ArrayList<StringBuilder> sbList = new ArrayList<>();
		sbList.add(new StringBuilder("Een"));
		sbList.add(new StringBuilder("Twee"));
		sbList.add(new StringBuilder("Drie"));
//		sbList.remove(new StringBuilder("Twee"));	// verwijderd een object dat niet in de lijst staat. --> Object.equeals

		for (StringBuilder sb : sbList ) {
			System.out.println(sb);			
		}

		for (StringBuilder s : sbList ) {
			s = s.append("TEST");			
		}
		
			

	}

}
