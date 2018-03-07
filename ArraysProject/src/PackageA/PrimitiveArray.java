package PackageA;

public class PrimitiveArray {
	void test () {

//		========= Declaratie van een array 		
		int[] intArray;		
//		int intArray[] ;			
//		int intArray[5] ;				// Error --> Geen capaciteit opgeven
		
//		=========Allocatie
		intArray = new int[5];
//		intArray = new int[]; 			// --> error --> bij allocatie capaciteit opgeven, of initialiseren		
//		intArray = new byte[5];			// Error --> types moeten hetzelfde zijn 	
		
		int intMulti [] [] = new int [5][5];	
		intMulti = new int [5][];	
//		intMulti = new int [][5];		// Error --> Alloceren van geheugen waar geen reference naar bestaat mag niet: Je kunt geen dimensie opgeven na een lege dimensie
		
		intMulti = new int [5][];		// dit is geen matrix!
		intMulti [0] = new int [0];		// de rijen hebben verschillende lengtes
		intMulti [1] = new int [1];
		intMulti [2] = new int [2];
		intMulti [3] = new int [3];
		intMulti [4] = new int [4];
//		intMulti [5] = new int [5];		//--> ArrayIndexOutOfBounds
		intMulti [4][3] = 5;
//		intMulti [0][1] = 5;			//--> ArrayIndexOutOfBounds
		
		for(int i=0; i < intArray.length; i++ ) {
			System.out.println(intArray[i]); 
		}
		intArray = new int[] {1, 2, 3};				
	}
}
