package vorlage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bestellung {
    int bestellnummer;
    Date bestelldatum;
    List<Gericht> gerichte;
    Kunde kunde;
    Kellner kellner;
    double gesamtbetrag;

    // Konstruktor, Getter und Setter

    public double getGesamtbetrag() {
 
		return gesamtbetrag;
	}

	public void gerichtHinzufuegen(Gericht gericht) {
  
    }

    public double gesamtbetragBerechnen(double gesamtbetrag) {

    	
    	this.gesamtbetrag = gesamtbetrag;
    	return gesamtbetrag;
    }

	public Bestellung(int bestellnummer, Date bestelldatum, Kunde kunde, Kellner kellner) {
		super();
		this.bestellnummer = bestellnummer;
		this.bestelldatum = bestelldatum;
		this.gerichte = new ArrayList<Gericht>();
		this.kunde = kunde;
		this.kellner = kellner;
	}
	
	public int bestellnummer() {
		return bestellnummer;
	}
	
	public Date bestelldatum() {
		return bestelldatum;
	}
	
	public Kunde getKunde() {
		return kunde;
	}
	
	public Kellner getKellner() {
		return kellner;
	}
	
	public List<Gericht> getGerichte() {
		return gerichte;
	
	
    }
}
