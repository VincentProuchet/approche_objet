package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {
	public static void main(String args[]) {
		List<Integer> nombreEntiers = new ArrayList<>();
		for(int i = 0; i<=100; i++) {
			nombreEntiers.add(i);
			
		}
		
		for(Integer nb : nombreEntiers){
			System.out.println(nb);
		}
		
	}
	
	
	
}
