package Rpg;
import java.util.Random;

public class NomesNpcs {
         
	     public static String ReceberNomeNpc;
	     
         public static void NomesNpcs() {
        	 String[] Nomes = { "Armstrong", "Maximilian", "Adônis", "Ícarus", "Hélio", "Zeus", "Gustavo" };
             String NomesRnd = Nomes[new Random().nextInt(Nomes.length)];
             ReceberNomeNpc = NomesRnd;
         }
         
}
