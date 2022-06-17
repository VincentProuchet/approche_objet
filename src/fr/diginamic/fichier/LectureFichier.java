package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
		LectureFichier.consoleOut(lignes);
		newLignes.add(" nom de la commune ; code département; Région; poulation totale;");
		for(Ville v: villes) {
			if(v.populationTotale>25000) {
				newLignes.add(v.toCSV());
			}
			
		}
		CreerFichier.Sauvegarder(newLignes, "Les plus de 25 000 habitants.csv", dataFile);
		
		
		
	}
	/**
	 * Recupére un fichier fileName dans le repertoire filePath
	 * et rend une List<String> des lignes du fichier
	 * 
	 * @param fileName
	 * @param filePath
	 * @return List<String>
	 * @throws IOException
	 */
	public static List<String> getFile(String fileName, String filePath) throws IOException{
		
		
		Path path = Paths.get(filePath+"\\"+fileName);
		
		if(Files.exists(path)){
			List<String> lignes = Files.readAllLines(path,StandardCharsets.UTF_8);
			return lignes;
			
			
			
			
		}else {
			System.out.println("Le fichier n'existe pas.");
			return null;
		}
	}
	/**Recupére un fichier dans le repertoire du projet
	 * et rend une List des lignes du fichier
	 * 
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public static List<String> getFile(String fileName) throws IOException{
		
		
		String dataFile = "F:\\dev\\approche_objet\\data";
		
		Path path = Paths.get(dataFile+"\\"+fileName);
		
		if(Files.exists(path)){
			List<String> lignes = Files.readAllLines(path,StandardCharsets.UTF_8);
			return lignes;
			
			
			
			
		}else {
			System.out.println("Le fichier n'existe pas.");
			return null;
		}
	}
	public static <T> void consoleOut(List <T> lines) {
		Iterator<T> iter = lines.iterator();
		iter.next();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
	}
}


