package Rpg;
import java.util.Random;

public class Familias {
	   public static String ReceberFamilia;
	   
	   public static int ReceberDinheiro;
	   
	   
        public static void Familias() {
        	String[] Familias = { "Família Simmons", "Família Grindelwald", "Família Asknes", "Família Black", "Família Hale", "Família Ctulhu", "Família Borgers" };
            String FamiliasRnd = Familias[new Random().nextInt(Familias.length)];
            int din[] = {10, 20 ,30, 50, 60, 100, 200, 300, 500};
            int dinheiro = din[new Random().nextInt(din.length)];
                   
            System.out.println("Sua Familia É: " + FamiliasRnd + "\n" + "Dinheiro: " + dinheiro);
            ReceberFamilia = FamiliasRnd;
            ReceberDinheiro = dinheiro;
            
        }
}
