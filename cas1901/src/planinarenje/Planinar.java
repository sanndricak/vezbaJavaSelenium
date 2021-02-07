package planinarenje;

public class Planinar {
	/*Planinar ima ime, prezime i zemlju porekla. Planinar moze da se penje
po zadatoj planini. Penjanje moze biti uspesno ili neuspesno. Moze da se sastavi tekstualni
opis planinara u obliku ime-zemlja porekla.
Klasicni planinar je plainar koji se penje po planinama nizim od 2000m,inace je penjanje
neuspesno.Tekstualni oblik je K_ime-zemlja porekla.
*/
	
	private String ime;
	private String prezime;
	private String zemljaPorekla;
	//planina
	
	
	public Planinar (String ime, String prezime, String zemljaPorekla) {
		this.ime=ime;
		this.prezime=prezime;
		this.zemljaPorekla=zemljaPorekla;
	}
	public String getIme(){
		return ime;
	}
	
	public String getPrezime(){
		return prezime;
	}
	
	public String getZemljaPorekla(){
		return zemljaPorekla;
			}
	
	public void setZemljaPorekla (String zemljaPorekla){
		 this.zemljaPorekla=zemljaPorekla;
	}
}
