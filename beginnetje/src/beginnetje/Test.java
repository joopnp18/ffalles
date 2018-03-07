package beginnetje;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Ha die ho!");
			
			 int eerste = 8;

		        int tweede = 5;

		        int derde = (eerste + tweede);

		        System.out.println(derde);
	kleurBepalen(0);
	}
	 static String kleurBepalen(int getal) {
         if(getal==0) {
           return "groen 0";
         } else {
           //Bepalen of getal even of oneven is: 
           /*
           if (getal % 2 == 0) {
             //getal is even
           } else {
             //getal is oneven
           }
           */
        	 System.out.println("Het is niet 0");
           return "iets anders";
         }
       }
}
