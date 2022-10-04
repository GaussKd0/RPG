package Rpg;
import java.util.Scanner;
public class Historia {
	  public static void Historia()
	    {
		    Batalha batalha = new Batalha();
	        Scanner scan = new Scanner(System.in);
	        NomesNpcs NomeNpc = new NomesNpcs();
	        System.out.println("Um Estranho Aparece E Te Empurra");
	        System.out.println("Voce Quer Agredir (1) Ou Ignorar(2)" );
	        int i = 1;
	        while(i == 1) {
	        	 switch(scan.nextInt())
	 	        {     
	 	            case 1:
	 	                batalha.batalha();
	 	                i = 2;
	 	                NomeNpc.NomesNpcs();
	 	                System.out.println("O Amigo Do Estranho Aparece E Quer Te Agredir Também");
	 	                batalha.batalha();
	 	                break;
	 	            case 2:
	 	                System.out.println("Voce Ignora o Sujeito E Segue Em Frente");
	 	                i = 2;
	 	               System.out.println("Final Da Historia kkkkk");
	 	                break;
	 	            default:
	 	                System.out.println("Voce É Um Corno");
	 	                break;
	 	            
	 	        }
	        }
	       
	    }
	  
}
