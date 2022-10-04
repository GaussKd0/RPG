package Rpg;
import java.util.Scanner;

public class Nome {
	
    public static String ReceberNome;
		
	 
    public static String Nome()
    {
        String Nome;
        int i = 0;
        Scanner scan = new Scanner(System.in);
        while(i ==0) {
        	System.out.println("Digite O Nome Do Personagem");
            Nome = scan.nextLine();
            if(Nome.length() == 0) {
            	System.out.println("Voce Não Digitou O Nome Do Personagem");
            }
            else {
            	i = 1;
            	ReceberNome = Nome;
                
            }
        }
        return ReceberNome;
        
        
        
    }
    
   
}
