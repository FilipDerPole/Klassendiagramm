import java.util.ArrayList;

public class Adresse {

	private String ort;
	private String strasse;
	private int hausnummer;
	private int plz;
	
	public Adresse(String ort, String strasse, int hausnummer, int plz) {
		this.ort = ort;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
	}
	/*
	private ArrayList pers;
	
	public Adresse() {
		pers = new ArrayList();
	}
	*/
	public String getOrt() {
		return ort;
	}
	
	public String getStrasse () {
		return strasse;
	}
	
	public int getHausnummer() {
		return hausnummer;
	}
	
	public int getPlz() {
		return plz;
	}
	
	public void printAdresse() {
		System.out.println("Ort: " + ort);
		System.out.println("Strasse: " + strasse);
		System.out.println("Hausnummer: " + hausnummer);
		System.out.println("PLZ: " + plz);
	}
}