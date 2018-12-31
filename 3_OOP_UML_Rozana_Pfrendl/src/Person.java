
public class Person {
	private Long svnr;
	private String vorname;
	private String nachname;
	private Date geburtsdatum;
	private String email;
	
	public Person(Long svnr, String vorname, String nachname, Date geburtsdatum, String email) {
		this.svnr = svnr;
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
		this.email = email;
	}
	
	private Adresse adresse;
	
	public Adresse getAdresse() {
		return adresse;
	}
	
	public Long getSvnr() {
		return svnr;
	}
	
	public String getVorname() {
		return vorname;
	}
	
	public String getNachname() {
		return nachname;
	}
	
	public Date getGeburtsdatum() {
		return geburtsdatum;
	}
	
	public String getEmail() {
		return email;
	}
}
