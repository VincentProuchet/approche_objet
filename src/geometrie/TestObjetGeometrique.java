package geometrie;

/**
 * 
 * @author Vincent
 *
 */
public class TestObjetGeometrique {

	public static void main(String[] args) {
		ObjetGeometrique[] formes = new ObjetGeometrique[2];

		formes[0] = new geometrie.Rectangle(5, 4);
		formes[1] = new fr.diginamic.banque.entites.Cercle(4);

		for (int i = 0; i < formes.length; i++) {
			System.out.println(formes[i].perimetre());
			System.out.println(formes[i].surface());
		}

	}

}
