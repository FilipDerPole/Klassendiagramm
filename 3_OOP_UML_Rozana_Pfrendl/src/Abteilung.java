
public class Abteilung {
	
	private String kuerzel;
	private String name;
	
	public Abteilung(String kuerzel, String name) {
		this.kuerzel = kuerzel;
		this.name = name;
	}
	
	private Lehrer abteilungsvorstand;
	
	public Lehrer getAbteilungsvorstand() {
		return abteilungsvorstand;
	}
	
	public String getName() {
		return name;
	}
	
	public String getKuerzel() {
		return kuerzel;
	}
	
	public getSchueler() {
		
	}
	
	public boolean addLehrer(Lehrer l) {
		
	}
	
	public boolean setAbteilungsvorstand(Lehrer l) {
		abteilungsvorstand = l;
	}
}
