package planinarenje;

import java.util.List;

public class Planina {
	/* 
Planina ima ime i visinu (u metrima) koji mogu da se dohvate. Moze da se sastavi tekstualni
opis planine u obliku ime(visina). Takodje planina sadrizi listu planinara. Moze da se dohvati
planinar na neko*/
	
	private String imePlanine;
	private double visina;
//	private List <Planinar> ovdePlaninari;
	
	public Planina (String imePlanine , double visina){
		this.imePlanine=imePlanine;
		this.visina=visina;
		//this.ovdePlaninari=ovdePlaninari;
	}
	

}
