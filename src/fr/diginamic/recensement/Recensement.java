package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.List;

import fr.diginamic.entities.Ville;

public class Recensement {
	private List<Ville> villes;
	public static String fichierSource;

	public Recensement(String fichier) throws IOException {
		this.villes = new ArrayList<>();
		fichierSource = fichier;
		this.chargerDonnees();
		
	}
	
	public void chargerDonnees() throws IOException {
		List <String> liste = Recensement.getFile(Recensement.fichierSource);
		for(String s: liste) {
			try {
			villes.add(new Ville(s));
			}catch (Exception e) {
				// TODO: I will ignore that  
				//						--Freeza
			}
		}
	}

	/**
	 * Récupérée un fichier fileName dans le repertoire filePath et rend une
	 * List<String> des lignes du fichier
	 * 
	 * @param fileName
	 * @param filePath
	 * @return List<String>
	 * @throws IOException
	 */
	public static List<String> getFile(String fileName, String filePath) throws IOException {
		// forme un path
		Path path = Paths.get(filePath + "\\" + fileName);
		// s'assure que le fichier existe
		if (Files.exists(path)) {
			// recupére toutes les lignes du fichier
			List<String> lignes = Files.readAllLines(path, StandardCharsets.UTF_8);
			return lignes;

		} else {
			// dans le cas ou le fichier n'est pas trouvé
			System.out.println("Le fichier n'existe pas.");
			return null;
		}
	}
	/**
	 * Récupérée un fichier fileName dans le repertoire filePath et rend une
	 * List<String> des lignes du fichier
	 * 
	 * @param file
	 * @return List<String>
	 * @throws IOException
	 */
	public static List<String> getFile(String file) throws IOException {
		// forme un path
		Path path = Paths.get(file);
		// s'assure que le fichier existe
		if (Files.exists(path)) {
			// recupére toutes les lignes du fichier
			List<String> lignes = Files.readAllLines(path, StandardCharsets.UTF_8);
			return lignes;

		} else {
			// dans le cas ou le fichier n'est pas trouvé
			System.out.println("Le fichier n'existe pas.");
			return null;
		}
	}
	public List<Ville> getVilles(){
		return this.villes;
	}
	
	



}
