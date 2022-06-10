package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte compte1 = new Compte(154_681_308, 150);
		Compte compte2 = new Compte(248_468_794, 200);
		
		compte1.Solde();
		compte2.Solde();
		
	}

}
