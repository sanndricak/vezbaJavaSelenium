package planinarenje;

import java.util.ArrayList;
import java.util.List;

public class Alpinista extends Planinar {
	
	private double visinaPenje;
	public Planinar planinar;
	
	public Alpinista(String ime, String prezime, String zemljaPorekla,Planinar planinar) {
		super(ime, prezime, zemljaPorekla);
		
		
	}
	/* Alpinista je planinar kome moze da se dodeli drugi Alpinista kao partner i koji se penje po
planinama visim od 3000m. Partner moze da se dohvati i postavi. Nije moguce postaviti
partnera ukoliko partner vec ima dodeljenog partnera. Ukoliko alpinista nema dodeljenog
partnera ili je planina manja od 3000m, penjanje je neuspesno. Tekstualni opis je A_ime-zemlja porekla.
*Napomena: Ukoliko je Alpinista A1 partner Alpinisti A2 onda je i Alpinista A2 partner Alpinisti
A1.*/

	public double getVisinaPenje() {
		return visinaPenje;
	}

	public void setVisinaPenje(double visinaPenje) {
		this.visinaPenje = visinaPenje;
	}



	
	
}
