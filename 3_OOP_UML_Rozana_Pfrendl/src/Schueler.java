
public class Schueler extends Person{

	private int katalognummer;
	private boolean eigenberechtigt;
	private Date eintrittsdatum;
	
	public Schueler(Long svnr, String vorname, String nachname, Date geburtsdatum, String email, int katalognummer, boolean eigenberechtigt, Date eintrittsdatum) {
		super(svnr, vorname, nachname, geburtsdatum, email);
		this.katalognummer = katalognummer;
		this.eigenberechtigt = eigenberechtigt;
		this.eintrittsdatum = eintrittsdatum;
	}
	
	public int getKatalognummer() {
		return katalognummer;
	}
	
	public boolean isEigenberechtigt() {
		return eigenberechtigt;
	}
	
	public Date getEintrittsdatum() {
		return eintrittsdatum;
	}
}
