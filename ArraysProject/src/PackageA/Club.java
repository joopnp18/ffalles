package PackageA;

import java.util.ArrayList;

abstract class Speler {
	String naam;		// naam van de speler
	
	Speler (String naam) {
		this.naam = naam;
	}
	
	abstract String getPosition();
	
	void printSpeler() {
		System.out.println(this.naam + "       " + getPosition());
	}
	
}

class Keeper extends Speler {
	
	Keeper(String naam){
		super(naam);
	}
	
	String getPosition() {
		return "Keeper";
	}
	
}

class Verdediger  extends Speler {
	
	Verdediger  (String naam){
		super(naam);
	}
	
	String getPosition() {
		return "Verdediger";
	}
}

class Middenvelder extends Speler {
	
	Middenvelder (String naam){
		super(naam);
	}
	
	String getPosition() {
		return "Middenvelder";
	}
}

class Spits extends Speler {
	
	Spits(String naam){
		super(naam);
	}
	
	String getPosition() {
		return "Spits";
	}
}


class Team {
	String naam;						// naam van het team
	ArrayList <Speler> spelers;
	
	Team (String naam) {
		this.naam = naam;
		spelers = new ArrayList <> (20); 
	}
	
	void addSpeler (Speler speler) {
		if (!spelers.contains(speler)) {
			spelers.add(speler);
		}
	}
	
	void removeSpeler (Speler speler) {
		spelers.remove(speler);
	}	
	
	void printTeam() {
		System.out.println(this.naam);
		System.out.println("======================");
		
		for (Speler speler: spelers) {
			speler.printSpeler();
		}
		
	}
	
}


public class Club {
	static ArrayList <Team> teams;
	
	Club(){
		Team team;
		
		if (teams== null) {
			 teams= new ArrayList<> ();
			 
			 team = new Team ("JO19-1");
			 team.addSpeler(new Keeper("K.Eeper"));
			 team.addSpeler(new Verdediger("L.Inksback"));
			 team.addSpeler(new Verdediger("R.Echtsback"));
			 team.addSpeler(new Verdediger("M.Middenback"));
			 team.addSpeler(new Middenvelder("R.Echtsmidden"));
			 team.addSpeler(new Middenvelder("M.Idden"));
			 team.addSpeler(new Middenvelder("L.inksmdden"));
			 team.addSpeler(new Spits("R.Echtsvoor"));
			 team.addSpeler(new Spits("S.Ppits"));
			 team.addSpeler(new Spits("L.Inksvoor"));
			 
			 teams.add(team);
			 
			 team = new Team ("JO17-1");
			 team.addSpeler(new Keeper("K.Eeper"));
			 team.addSpeler(new Verdediger("L.Inksback"));
			 team.addSpeler(new Verdediger("R.Echtsback"));
			 team.addSpeler(new Verdediger("M.Middenback"));
			 team.addSpeler(new Middenvelder("R.Echtsmidden"));
			 team.addSpeler(new Middenvelder("M.Idden"));
			 team.addSpeler(new Middenvelder("L.inksmdden"));
			 team.addSpeler(new Spits("R.Echtsvoor"));
			 team.addSpeler(new Spits("S.Ppits"));
			 team.addSpeler(new Spits("L.Inksvoor"));

			 teams.add(team);
			 
		}
				
	}
	
	void printInfo() {
		for (Team team : teams ) {
			team.printTeam();
		}
	}
	
	
	

}
