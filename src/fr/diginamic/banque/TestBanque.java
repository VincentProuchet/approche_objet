package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Compte[] comptesClients =new Compte[2];
		
		comptesClients[0] = new Compte("154 681 308", 150);
		comptesClients[1] = new CompteTaux("248 468 794", 200, 5);
		for(int i=0;i< comptesClients.length;i++) {
			System.out.println(comptesClients[i]);
	}

}
}
