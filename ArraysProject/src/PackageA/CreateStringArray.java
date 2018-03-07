package PackageA;

public class CreateStringArray {
	void test ( ) {
		String [] teamledenlijst[];
		teamledenlijst = new String [][] { 
			{"Keeper 1", "Verdediger 1", "Middenvelder 1", "Aanvaller 1"},
			{"Keeper 2", "Verdediger 2", "Middenvelder 2", "Aanvaller 2"}
		};

		System.out.println("Team    Speler");
		System.out.println("====    ==================");
		for (int i = 0; i<teamledenlijst.length ; i++) {
			for (int j = 0; j < teamledenlijst[i].length ; j++) {
				System.out.println( i+1  + "       "+ teamledenlijst [i][j]);
				// System.out.println( i+1  + "       "+ teamledenlijst [i][j]  + "       " +  i+1);  //Wat wordt hier geprint?
			}
		}

	}

}
