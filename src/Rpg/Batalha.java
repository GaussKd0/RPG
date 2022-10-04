package Rpg;
import java.util.Random;
import java.util.Scanner;

public class Batalha {

    private static int Xp;
    
    private static int Ataque;
    
    private static int Vida;
    
    private static int Velocidade;
    
    private static int Magia;
    
    public static int SeuAtaque()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha Ó Ataque:");
        System.out.println("(1) - Ataque Basico");
        System.out.println("(2) - Ataque Com Magia");
        System.out.println("(3) - Ataque Com Arma");
        System.out.println("(4) - Especial");
        System.out.println("(5) - Ver Atributos");
        return scan.nextInt();
    }
    static int ataqueBot()
    {
        Random rnd = new Random();
        return rnd.nextInt(4)+1;
    }
    
    static void printVida(int hp, int hpBot, int quantidade){
    	Nome Nome = new Nome();
    	NomesNpcs NpcNomes = new NomesNpcs();
        System.out.println("======================");
        System.out.println("- HP " + Nome.ReceberNome + ":" + hp);
        System.out.println("======================");
        System.out.println("- HP " + NpcNomes.ReceberNomeNpc + ":" + hpBot);
        System.out.println("======================");
        System.out.println("- Quantidade Do Especial: " + quantidade);
        
    }
    
    static void batalha(){
         Magias Magias = new Magias();
         Racas Racas = new Racas();
         Objetos Objetos = new Objetos();
         
         switch(Racas.ReceberRaca){
            case "Humano":
                batalha2(5, 4, 5, 5,Magias.ReceberMagia, Objetos.ReceberObjeto);
                
            break;
            
            case "Gigante":
                
                batalha2(20, 10,0,2,Magias.ReceberMagia, Objetos.ReceberObjeto);
            break;
            
            case "Elfo":
                batalha2(5, 3,8,10,Magias.ReceberMagia, Objetos.ReceberObjeto);
            break;
            
            case "Anão":
                batalha2(6, 7,4,2,Magias.ReceberMagia, Objetos.ReceberObjeto);
            break;
                        
            case "Elfo Negro":
                batalha2(7, 5,8,8,Magias.ReceberMagia, Objetos.ReceberObjeto);
            break;
            
            case "Metamorfo":
                batalha2(5, 5,5,5,Magias.ReceberMagia, Objetos.ReceberObjeto);
            break;
        }
                
       
    }
    public static void batalha2 (int hp, int atk, int magia, int velocidade, String tipomagia, String Obj)
    {
      
    	atk += Ataque;
    	hp += Vida;
    	magia += Magia;
    	velocidade += Velocidade;
    	
    	Nome Nome = new Nome();
    	NomesNpcs NpcNomes = new NomesNpcs(); 
        int hpBot = 2;
        int quantidadeEspecial = 5;
        int escolherAtk;
        int quantidadeArma;
        int i = 0;
         while(i ==0){
        	 while(hp > 0  && hpBot > 0)
             {
                 printVida(hp, hpBot, quantidadeEspecial);
                 escolherAtk = SeuAtaque();
                 
                 switch(escolherAtk){
                     case 1 -> {
                         System.out.println("Personagem Atacou Com Um Soco " + "Seu Dano: " + atk);
                         hpBot -= atk;
                         i = 1;
                         break;
                     }
                     
                     case 2 -> {
                     	Magias Magias = new Magias();
                         System.out.println("Personagem Atacou Com Magia " + tipomagia);
                         String EspecialidadeMagia;
                         i = 1;
                         int escuridao = 6, eletricidade = 8, terra = 4, ar = 5, fogo = 10, luz =7;
                         switch (Magias.ReceberMagia)
                         {
                                                    
                             case "Escuridão":
                                 hpBot -= magia + escuridao;
                                 
                                 break;
                             case "Eletricidade":
                                   hpBot -= magia + eletricidade;
                                  
                                 break;
                             case "Fogo":
                                   hpBot -= magia + fogo;
                                   
                             case "Terra":
                                   hpBot -= magia + terra;
                                  
                                 break;
                             case "Ar":
                                   hpBot -= magia + ar;
                                  
                                 break;
                             case "Luz":
                                   hpBot -= magia + luz;
                                  
                                 break;      
                         }
                         
                     }
                       case 3 -> {
                         if(Obj == "Nada")
                         {
                             System.out.print(Nome.ReceberNome + " Não Possui Arma, Então Tera Que Usar Um Ataque Basico " + "Seu Dano: " + atk);
                             i = 1;
                             hpBot -= atk;
                         }
                         else
                         {
                             System.out.println(Nome.ReceberNome + " Atacou Com Arma " + Obj) ;
                             i = 1;
                             switch(Obj)
                             {
                                
                                 case "Espada E Escudo":
                                     hpBot -= atk + 5;
                                     hp += 3;
                                     
                                     
                                     break;
                                 case "Escudo Grande":
                                     hpBot -= atk + 2;
                                     
                                     hp += 10;
                                     break;    
                                case "Picareta":
                                     hpBot -= atk + 3;
                                    
                                     break; 
                                 case "Martelo":
                                     hpBot -= atk + 4;
                                   
                                     break;
                                 case "Faca Afiada":
                                     hpBot -= atk + 3;
                                    
                                 case "Espada Grande":
                                     hpBot -= atk + 7;
                                     
                                     break;
                                 
                                 } 
                             
                             }    
                        
                        
                         break;
                        
                        	 
                     }
                       case 4 ->{
                       	   if(quantidadeEspecial > 0) {
                       		   i = 1;
                    		   hpBot -= atk + magia;
                           	   System.out.println(Nome.ReceberNome + " Atacou Com Especial: " + quantidadeEspecial + "\nSeu Dano: " + atk + magia);
                        	   quantidadeEspecial =-1;
                    	   }
                       	   else {
                       		   System.out.println("Acabou O Seu Especial, Use Outro Ataque");
                       	   }
                    	   
                       }
                       case 5 ->{
                           System.out.println("Seu Hp: " + hp + "\nSeu Ataque: " + atk +  "\nSua Magia: " + magia + "\nSua Velocidade: " + velocidade + "\nSeu Objeto: " + Obj + "\nTipo De Magia: " + tipomagia);
                           
                           
                       }
                     default -> System.out.println("Opção Invalida");
                 }
         }
        
            
            if(hpBot > 0){
                escolherAtk = ataqueBot();
                switch(escolherAtk){
                    case 1 -> {
                    	hp -= 3;
                        System.out.println(NomesNpcs.ReceberNomeNpc +" Atacou Com Um Soco"+ "\nSeu Hp: " + hp);
                        
                    }
                    case 2 -> {
                    	hp -= 5;
                        System.out.println(NomesNpcs.ReceberNomeNpc +" Atacou Com Uma Arma"+ "\nSeu Hp: " + hp);
                        
                    }
                    case 3 -> {
                    	 hp -= 10;
                        System.out.println(NomesNpcs.ReceberNomeNpc +" Atacou Com O Especial"+ "\nSeu Hp: " + hp);
                       
                    }
                    case 4 -> System.out.println(NomesNpcs.ReceberNomeNpc +" Errou");
                }
            }
            else if(hp == 0)
            {
            	
                System.out.println(Nome.ReceberNome + " Foi Derrotado");
            }
            else
            {
                System.out.println(NomesNpcs.ReceberNomeNpc +" Derrotado");
                Xp += 100;
                XP();
            }
            
        }
        
    }
    
   private static void XP() {
	     atributos evolucao = new atributos();
       	 switch(Xp) {
       	    case 100 ->{
       	    	System.out.println("Voce Passou Para O Lvl 1");
       	    	upar();
       	    }
       	    case 200 ->{
       	    	System.out.println("Voce Passou Para O Lvl 2");
       	    	upar();
       	    }	  
       	    
       	    default -> System.out.println("Seu Xp Atual: " + Xp);
    	 }
    }
   
   private static void upar() {
	    int Receber;
		Scanner scan = new Scanner(System.in);
	    System.out.println("Deseja Atribuir Qual Atributo Aumentar {1} Forca, {2} Vida, {3}Magia, {4}Velocidade");
		Receber =  scan.nextInt();
		int i = 0;
		while(i == 0) {
		   switch(Receber) {
		     case 1 -> {
		    	 i =1;
		    	 Ataque +=1;
		     }
		     case 2 ->{
		    	 i =1;
		    	 Vida += 1;
		     }
		     case 3 ->{
		    	  i =1;
		    	  Magia+= 1;
		     }
		     case 4 ->{
		    	  i = 1;
		    	  Velocidade+=1;
		     }
		    default -> System.out.println("Nenhuma Opção Valida");
		    }
		 }
	   }
 }
