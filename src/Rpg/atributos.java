package Rpg;
import java.util.Random;
import java.util.Scanner;

public class atributos {
	public static int carisma;
	
	 public static int Atributos(String raca, int vida, int magia, int forca, int velocidade)
	 {
	        int Carisma[] = {0, 1, 2, 3 ,4 ,5 ,6, 7,8,9,10};
	        int CarismaRnd = Carisma[new Random().nextInt(Carisma.length)];
	        System.out.println(raca + "\n" + "Magia: " + magia + "\n" + "Vida: " + vida  + "\n" + "Força: " + forca +  "\n" + "Velocidade: " + velocidade + "\n"  +  "Carisma: "  + CarismaRnd);
	        carisma = CarismaRnd;
	        return carisma;
	            
	        
	 }	 
	
}
                        