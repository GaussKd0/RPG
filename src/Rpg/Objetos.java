package Rpg;
import java.util.Random;
public class Objetos {
	public static String ReceberObjeto;
	
	public static String objetos(){
        String[] Objetos = { "Espada E Escudo", "Escudo Grande", "Picareta", "Martelo", "Faca Afiada", "Nada", "Espada Grande" };
        String ObjetosRnd = Objetos[new Random().nextInt(Objetos.length)];
        
        System.out.println("Voce Iniciarar Com: " + ObjetosRnd);
        
        ReceberObjeto = ObjetosRnd;
        
        return ReceberObjeto; 
    }
}
