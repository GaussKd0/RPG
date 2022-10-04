package Rpg;
import java.util.Random;

public class historiaInicial {
	
	public String ReceberHistoria;
	
	 private String ReceberHistoria(String ReceberHistoria)
	    {
	        this.ReceberHistoria = ReceberHistoria;
	        return this.ReceberHistoria;
	        
	    }
	 
	public void inhistoria(){
		    atributos atributos = new atributos();
		    String[] historias = { "Historia Feliz", "Historia Miserável"};
	        Nome Nome = new Nome();
	        String historiasrnd = historias[new Random().nextInt(historias.length)];
	        
	        if(historiasrnd == "Historia Feliz"){
	            System.out.println(Nome.ReceberNome + " Voce Era Um Nobre, Que Sempre Teve Tudo Do Bom E Do Melhor, Mais Cansou De Sempre Ganhar Tudo Na Mão E Partiu Em Uma Aventura");
	            System.out.println("\nVoce Inicia Com Uma Armadura Melhor");
	            ReceberHistoria("Historia Feliz");
	            atributos.carisma += 2;
	        }
	        else if (historiasrnd == "Historia Miserável"){
	            System.out.println(Nome.ReceberNome + " Voce Era Um Miserável, Seus Pais O Abandonaram Quando Era Criança E Voce Vivia De Migalhas E Restos, \n Todos Os Odiavam, Então Voce Entrou Para O Crime, Um Certo Dia Os Seus Companheiros Enganaram \nVoce E O Deixaram Para Morte, Mais Voce Teve Sorte Pela Primeira Vez \nNa Sua Vida E Conseguiu Sobreviver, Logo Em Seguida \nLargou A Vida Do Crime E Foi Em Busca De Alguma Forma De Ganhar Dinheiro ");
	            System.out.println("\nVoce Inicia Sem Nada, Apenas Com Sua Sorte Negativa");
	            ReceberHistoria("Historia Miserável");
	            atributos.carisma -= 2;
	        }
	        
	}
       
	
}	


