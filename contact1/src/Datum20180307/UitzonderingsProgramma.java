package Datum20180307;

public class UitzonderingsProgramma {
	public static void main(String args[]) {
		UitzonderingsProgramma up = new UitzonderingsProgramma();
		up.start();
	}
	void start() {
		Pasje hetpasje = new Pasje();
		hetpasje.geldig = false;
		Toegangspoort toegangspoort = new Toegangspoort();
		try {
			toegangspoort.binnenlaten(hetpasje);

		}catch(Exception e) {
			System.out.println("Arresteer de man");
		}
	}
}

class Toegangspoort{
	void binnenlaten(Pasje pasje) throws Exception{
		if(pasje.geldig == true) {
			System.out.println("u mag binnen");
		}else {
			throw new Exception("in exception");
		}
	}
}

class Pasje{
	boolean geldig = true;
}