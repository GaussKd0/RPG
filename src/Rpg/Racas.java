package Rpg;
import java.util.Scanner;
public class Racas {

	
	public static String ReceberRaca;
	
	 private String ReceberNome(String ReceberNome)
	 {
	    this.ReceberRaca = ReceberNome;
	    return this.ReceberRaca;
	        
	 }
	
	public static void racas()
    {
        Scanner scan = new Scanner(System.in);
        int racas;
       
               
        String[] Racas = { "Humano", "Gigante", "Elfo", "Anão", "Elfo Negro", "Metamorfo" };
        
        atributos atributos = new atributos();
        
        int i = 0;
        
        while(i == 0) {
        	System.out.println("Qual Raça Voce Deseja {1} Para Humano {2} Para Gigante {3} Para Elfo {4} Para Anão {5} Para Elfo Negro {6} Para Metamorfo");
            
            racas = scan.nextInt();
            switch (racas)
            {
                
                case 1:
                    //humano
                    atributos.Atributos(Racas[0],5,5,4,5);
                    ReceberRaca = Racas[0];
                    i = 1;
                   break;
                
                case 2:
                    //gigante
                    atributos.Atributos(Racas[1],20,0,10,2);
                    ReceberRaca = Racas[1];
                    i = 1;
                    break;
                    
                case 3:
                    //elfo
                    atributos.Atributos(Racas[2],5,8,3,10);
                    ReceberRaca = Racas[2];
                    i = 1;
                    break;
                    
                case 4:
                    //anao
                    atributos.Atributos(Racas[3],6,4,7,2);
                    ReceberRaca = Racas[3];
                    i = 1;
                    break;
                    
                case 5:
                    //elfo negro
                    atributos.Atributos(Racas[4],7,8,5,8); 
                    ReceberRaca = Racas[4];
                    i = 1;
                    break;
                    
                case 6:
                    //metamorfo
                    atributos.Atributos(Racas[5],5,5,5,5);  
                    ReceberRaca = Racas[5];
                    i = 1;
                    break;
                    
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
            
        }
    }       
        
}
