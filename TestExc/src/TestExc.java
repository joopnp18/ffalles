import java.io.FileNotFoundException;
import java.io.*;

public class TestExc {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Ik throw helemaal iets");
		
		try {
			doeIets();
			System.out.println("Try maar eens een keer" );
			
			System.out.println("De waarde die ik nu ontvang is " + verkrijgWaarde());
		}
		catch (RuntimeException  e)  {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (FileNotFoundException e)  {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (Exception e)  {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (Error e)  {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (Throwable e)  {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Dat was het" );
		}
	}
	
	static void doeIets() throws  FileNotFoundException {
//		throw new FileNotFoundException("Deze file bestaat helemaal niet" );		
		
		System.out.println("DoeIets");

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test.txt");
			System.out.println("File test.txt is geopend");

			fis.read();
			System.out.println("File gelezen");

		} catch (FileNotFoundException e) {	
			System.out.println("File test.txt bestaat niet");
		} catch (IOException e) {
		} finally {
			if (fis !=null) {
				try {
					fis.close();
					System.out.println("File is gesloten");
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}			
		
	}
	
	
	static StringBuilder  verkrijgWaarde() {
		int i ; 		StringBuilder  s = new StringBuilder(20);
		try {
			
			double d = 0 / 0.0;
			System.out.println(d);
			
			for (i = 9; i>=0; i--) {
				System.out.println(i + ": "  + 1 / i);				
			}
			s.append("Geen Probleem" );
			System.out.println("Geen problemen");
			i = 5;
			return s;
			
		} catch (Exception e) {
			s.append("Probleem" );
			System.out.println("problemen");
			i = 8;
			return s;
		} finally {
			s.append("Finally" );
			System.out.println("Finally ");
			i = 9;			
		}
	}

}
