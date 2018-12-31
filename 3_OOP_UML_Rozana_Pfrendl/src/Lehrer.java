
public class Lehrer extends Mitarbeiter{
	
	private String kuerzel;
	
	public Lehrer(Long svnr, String vorname, String nachname, Date geburtsdatum, String email, String kuerzel) {
		super(svnr, vorname, nachname, geburtsdatum, email);
		this.kuerzel = kuerzel;
	}
	
	private Abteilung geleiteteAbteilung;
	
	public Abteilung getGeleiteteAbteilung() {
		return geleiteteAbteilung;
	}
	
	private Schule geleiteteSchule;
	
	public Schule getGeleiteteSchule() {
		return geleiteteSchule;
	}
	
	public String getKuerzel() {
		return kuerzel;
	}
	
	public void exportStundenplan() {
		
	}
	
}
