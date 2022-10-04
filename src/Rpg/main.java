package Rpg;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        historiaInicial his = new historiaInicial();
        Nome Nome = new Nome();
        Genero genero = new Genero();
        Racas racas = new Racas();
        Magias magia = new Magias();
        Objetos obj = new Objetos();
        NomesNpcs NomeNpc = new NomesNpcs();
        Historia historia = new Historia();
        
        Nome.Nome();
        scan.nextLine();
        genero.Genero();
        scan.nextLine();
        his.inhistoria();
        scan.nextLine();
        racas.racas();
        scan.nextLine();
        magia.magias();
        scan.nextLine();
        obj.objetos();
        NomeNpc.NomesNpcs();
        historia.Historia();
	}

}
