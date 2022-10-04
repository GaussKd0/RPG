package Rpg;
import java.util.Random;

public class Magias {
	public static String ReceberMagia;
	
	  public static String magias(){
	        
	        String[] Magias = { "Escuridão", "Eletricidade", "Fogo", "Terra", "Ar", "Luz" };
	        String MagiasRnd = Magias[new Random().nextInt(Magias.length)];
	        
	        System.out.println("Sua Magia É: " + MagiasRnd);
	        ReceberMagia = MagiasRnd;
	        return ReceberMagia;
	        
	    }
}
