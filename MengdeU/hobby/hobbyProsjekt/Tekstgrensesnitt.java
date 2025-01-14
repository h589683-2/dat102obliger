package hobbyProsjekt;

import java.util.Scanner;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;
import hobbyProsjekt.Datakontakt;

public class Tekstgrensesnitt{
	
	
	public static Medlem lesMedlem(){
		Scanner s = new Scanner(System.in);
		System.out.println("Navn: ");
		String navn = s.nextLine();
		System.out.println("Hobbyer");
		
		String hobby = null;
		KjedetMengde <Hobby> mh = new KjedetMengde<Hobby>();
		do {
			 hobby = s.nextLine();
			Hobby h = new Hobby(hobby);
			 mh.leggTil(h);
		} while(hobby != "");
			
		Medlem m = new Medlem(navn, mh);
		return m;
		
	}
	
	public static void skrivMedlemsdata(Datakontakt dk){
		Medlem[] m = dk.getTab();
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
			System.out.println("Status: " + m[i].getStatusIndeks() + "\nNavn: " + m[i].getNavn() + "\nHobbyer: <" + m[i].getHobbyer().toString()
					+ ">" + "\n--------------------------------------------");
			} else {
				break;
			}
				
		}
	}
	
	public static void skrivHobbyListe(Medlem medlem) { 
		System.out.println("Alle hobbyene "); 
		System.out.println(medlem.getHobbyer().toString()); 
	}
	
	public static void skrivParListe (Datakontakt arkiv){
		Medlem[] m = arkiv.getTab(); 
		
		for(int i = 0; i < m.length; i++) {
			if((m[i].getStatusIndeks() > i)) {
				int status = m[i].getStatusIndeks();
				System.out.println("Par = " + m[status].getNavn() + " og " + m[i].getNavn());
			}
		}
		
	}
}