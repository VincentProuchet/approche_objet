package entities;

public class TestPersonnes {

	public static void main(String[] args) {
		
		Personnes humain1 = new Personnes("Ericson","Mike"
				,1," de la boustiffaille",34500, "Béziers");
		Personnes humain2 = new Personnes("Shlassosvensky", "Piotr"
				, 6, " de la bataille en braise", 34420,"Portiragnes");
		
		humain1.AfficherIdentite();
		
		humain1.SetPrenom("Robert");
		System.out.println(humain1 + " " +    humain1.GetAdresse());
		//humain1.AfficherIdentite();
		//humain1.GetAdresse().AfficheAdresse();
		
		humain2.AfficherIdentite();
		humain2.GetAdresse().AfficheAdresse();
		
		
		
		
		
		
	}

}
