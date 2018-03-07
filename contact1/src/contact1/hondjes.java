package contact1;
public class hondjes{
	public static void main(String args[]) {
		String naam;
		int getal = 8;
		naam = "hallo";
		naam = "een ander waarde";
		System.out.println(naam);
		System.out.println(getal);
		
//		int boolean long short double float char byte;
		Hond fikkie = new Hond();
		fikkie.naam = "Astor";
		Hond hond;
		fikkie.leeftijd = 7;
		
		System.out.println(fikkie);
		
	}

}

class Hond{
	int leeftijd;
	String naam;
}

