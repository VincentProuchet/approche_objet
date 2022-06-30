package fr.diginamic.essais;

import geometrie.ObjetGeometrique;

/** TP 9 
 * interfaces faciles
 * 
 * ou comment assurer le développeur
 * que ses classes pourront être utilisée par certaines fonctionnalités de l'application
 * en le forçant à faire une implementation des méthodes qui seraient appelles 
 * @author Vincent
 *
 */
public class TestObjetGeometrique {

	public static void main(String[] args) {
		ObjetGeometrique[] formes = new ObjetGeometrique[2];

		formes[0] = new geometrie.Rectangle(5, 4);
		formes[1] = new geometrie.Cercle(4);

		for (int i = 0; i < formes.length; i++) {
			System.out.println(formes[i].perimetre());
			System.out.println(formes[i].surface());
		}

	}

}
