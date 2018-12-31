
public class Mitarbeiter extends Person{

	private static int anzahl = 0;
	
	public Mitarbeiter(Long svnr, String vorname, String nachname, Date geburtsdatum, String email) {
		super(svnr, vorname, nachname, geburtsdatum, email);
		anzahl ++;
	}
		
	int getAnzahl() {
		return anzahl;
	}
}
