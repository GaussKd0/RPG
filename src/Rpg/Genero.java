package Rpg;
import java.util.Scanner;
public class Genero {
	
	public static String ReceberGenero;
	
	public static String Genero() {
		int i = 2;		
		int sc;
		Scanner scan = new Scanner(System.in);
		String Genero;
		System.out.print("Qual Vai Ser O Genero Do Seu Personagem {1} Homen {2} Mulher");
		while(i == 2) {
			
			sc = scan.nextInt();
			
			if(sc == 1) {
				i = 5;
				System.out.println("Seu Genero É Homen");
				Genero = "Homen";
				ReceberGenero = Genero;
				
			}
			else if (sc == 2) {
				i = 5;
				System.out.println("Seu Genero É Mulher");
				Genero = "Mulher";
				i = 0;
				ReceberGenero = Genero;
			}
			else {
				System.out.println("Voce Não Escolheu Um Genero");
				
			}
			
			
		}
		return ReceberGenero;
		
	}

}
