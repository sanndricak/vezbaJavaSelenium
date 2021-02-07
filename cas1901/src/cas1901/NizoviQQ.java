package cas1901;

import java.util.Scanner;

public class NizoviQQ {

	public static void main(String[] args) {
		/*Napisati program koji sluzi za sabiranje elemenata dva niza iste duzine i rezultat upisuje u treci niz.  
	a konzole se ucitava prvo duzina nizova zatim svi elementi jednog niza, pa svi elementi drugog niza. Ucitavanje elemenata niza izdvojiti u posebnu funkciju.
Ta dva niza proslediti funkciji koja uzmima odgovarajuci element prvog niza i odgovarajuci element drugog niza 
i njihov zbir upisuje na odgovarajuce mesto u trecem nizu. Sabiraju se elementi sa istim indeksom. Ispisati niz sa zbirovima. Za ispis napraviti posebnu funkciju.
Primer:
prvi niz 	1 	3 	5
drugi niz	6 	7 	8
treci niz	7 	10 	13
*/
		System.out.println("Unesi broj clanova niza ");
     Scanner sc = new Scanner (System.in);
     int n=sc.nextInt();
		int [] niz1 = new int [n];
		int [] niz2 = new int [n];
		int [] niz3 = new int [n];
		
		for (int i=0; i<niz1.length; i++){
			System.out.println("Unesite " + i + " element prvog niza ");
			niz1[i] = sc.nextInt();
			}
		for (int i=0; i<niz2.length; i++){
			System.out.println("Unesite " + i + " element drugog niza ");
			niz2[i] = sc.nextInt();
					}
		
		for (int i=0; i<niz3.length; i++){
			
			niz3[i] = niz1[i]+niz2[i];
					}
				
		System.out.println(niz3[0]);
		System.out.println(niz3[1]);
		System.out.println(niz3[2]);
	}

}
