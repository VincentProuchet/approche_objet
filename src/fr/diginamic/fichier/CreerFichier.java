package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		String dataFile = "F:\\dev\\approche_objet\\data";
		String fileName = "recensement.csv";
		String newFileName = "Les 100 premier.csv";
		List<String> lignes = LectureFichier.getFile(fileName,dataFile);
		List<String> nouvellesLignes = new ArrayList<>();
		
		if(lignes!=null) {
			
			
			Iterator<String> iter = lignes.iterator();
			
			for(int i=0;i<100;i++) {
				if(iter.hasNext()) {
					nouvellesLignes.add(iter.next());
				}
			}
			Path pathCible = Paths.get(dataFile+"\\"+newFileName);
			Files.write(pathCible, nouvellesLignes);
			System.out.println("Opération terminée");
			
		}
		
		
		
	}
	
	/**
	 * écrit toutes les lignes de la liste
	 *  dans le fichier filename à l'emplacement filepath
	 *  Écrasera toutes données précédemment existantes
	 * @param lignes
	 * @param fileName
	 * @param filePath
	 * @throws IOException
	 */
	public static  void Sauvegarder(List<String> lignes, String fileName, String filePath) throws IOException {
			if(lignes!=null && fileName!=null&&filePath!=null) {
			Path pathCible = Paths.get(filePath+"\\"+fileName);
			Files.write(pathCible, lignes);
			System.out.println("Opération terminée");
			
		}
			else {
				System.out.println(" Pas de données ");
			}
	}

}
