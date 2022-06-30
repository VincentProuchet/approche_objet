package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import fr.diginamic.entities.Ville;
import fr.diginamic.tri.ComparatorHabitant;
import fr.diginamic.tri.ComparatorNom;

/** 
 * TP 15
 * TP 13
 * LES TRIS
 * 
 * @author Vincent
 *
 */
public class LectureFichier {

	public static void main(String[] args) throws IOException {
		String dataFile = "F:\\dev\\approche_objet\\data";
		String fileName = "recensement.csv";
		List<String> lignes = LectureFichier.getFile(fileName, dataFile);
		List<Ville>  villes= new ArrayList<>();
		List<String> newLignes = new ArrayList<>();		
		
		for(String s: lignes) {
			try {
			villes.add(new Ville(s));
			}catch (Exception e) {
				// TODO: I will ignore that
			}
		}
		// appelle du compareTo intégré de la classe Ville 
		// celle-ci va trier par ordre alphabétique
		Collections.sort(villes);
		
		// un jolie ligne d'entête pour mon tableau excel
		newLignes.add(" nom de la commune ; code département; Région; poulation totale;");		
		// mise en forme du nouveau document
		for(Ville v: villes) {
			if(v.getPopulationTotale()>25000) {
				newLignes.add(v.toCSV());
			}
			
		}
		
		Collections.sort(villes,new ComparatorHabitant());
		
		LectureFichier.consoleOut(villes);
		
		Collections.sort(villes,new ComparatorNom());
		
		LectureFichier.consoleOut(villes);
		
		//sauvegarde du fichier
		CreerFichier.Sauvegarder(newLignes, "Les plus de 25 000 habitants.csv", dataFile);
		
		
		
	}
	/**
	 * Récupérée un fichier fileName dans le repertoire filePath
	 * et rend une List<String> des lignes du fichier
	 * 
	 * @param fileName
	 * @param filePath
	 * @return List<String>
	 * @throws IOException
	 */
	public static List<String> getFile(String fileName, String filePath) throws IOException{
		// forme un path		
		Path path = Paths.get(filePath+"\\"+fileName);
		// s'assure que le fichier existe
		if(Files.exists(path)){
			// recupére toutes les lignes du fichier
			List<String> lignes = Files.readAllLines(path,StandardCharsets.UTF_8);
			return lignes;
			
			
			
			
		}else {
			// dans le cas ou le fichier n'est pas trouvé
			System.out.println("Le fichier n'existe pas.");
			return null;
		}
	}
	/**Affiche le contenu de lines dans la console
	 * 
	 * @param <T>
	 * @param lines
	 */
	public static <T> void consoleOut(List <T> lines) {
		// j'aurais put faire un for 
		// j'ai juste voulu experimenter le while 
		// et l'iterator
		Iterator<T> iter = lines.iterator();
		iter.next();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
	}
}


