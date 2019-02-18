
package dice;

import java.util.Scanner;

public class CharacterDuel {
    
    public static void main(String[] args){
      


        Scanner sc = new Scanner(System.in);
        Character Player1 = new Character("Pikachu",10, 10, 10);
        Wizard Enemy = new Wizard("Arceus", 10, 10, 10);
       
        int round = 1;
        int damage;
        int lightningBolt;
        
        // int rage = 15;
        String skills;
      
        
        
       
        
   
       System.out.println("\tWELCOME TO THE BATTLE ARENA");
       System.out.println();
       
       System.out.println("\tAsh summoned " + Player1.getName() + " lvl.50");
       System.out.println("\tMisty summoned " + Enemy.getName() + " lvl.50");
       System.out.println();
        while (Player1.getCurrentLife() >= 0 && Enemy.getCurrentLife() >= 0){
            
            
                if(Player1.getCurrentLife() > 0 && Enemy.getCurrentLife() > 0){
                    System.out.println();
            System.out.println("\t---------------Round " +round+ "-------------");
            System.out.println();
            System.out.println(Player1.getName() + ":" + Player1.getCurrentLife());
            System.out.println(Enemy.getName() + ":" + Enemy.getCurrentLife());
                    System.out.println();
                 
            //p1 attacks
            if(Player1.getCurrentLife() >0 && Enemy.getCurrentLife() >0 )
            {
            damage= Player1.attack();
            System.out.println(Player1.getName() + " uses lightning bolt to " + Enemy.getName() + " " + "["+damage+"]");
             
            Enemy.wound(damage);
            
           
            }
            // enemy attacks
            if(Enemy.getCurrentLife()>0 && Player1.getCurrentLife() >0)
            {
            lightningBolt= Enemy.castLightningBolt();
            System.out.println(Enemy.getName() + " uses draco meteor to " + Player1.getName() + " " + "["+lightningBolt+"]");
            Player1.wound(lightningBolt);
             }
                    
                  
         do{
             System.out.println();
             System.out.println("^^Super Skill Activated!^^");
             System.out.println("^^^What Skill do you want to use?^^^");
             System.out.println();
             System.out.println("[a] Healing Galing - Arceus\n[b] Growth - Pikachu\n[c] Pass");
             skills = sc.nextLine();
           
             
            if ("a".equals(skills)) {
           
            // p2 heals
            if(Enemy.getCurrentLife()>0 && Player1.getCurrentLife()> 0)
            {
            System.out.println(Enemy.getName() + " has "+ Enemy.getCurrentLife() + " HP");
                
            
            System.out.println(">> " +Enemy.getName() + " uses his super skill: Healing Galing" + " <<");
            
            System.out.println(Enemy.getName() + " uses heal " + "["+Enemy.castHeal()+"]");
          
            
           
            System.out.println(Enemy.getName() + " now has " + Enemy.getCurrentLife() + "-HP");
            break;
            
            }
               
            }
             // pikachu gets mad
            if("b".equals(skills)){
               
                System.out.println(">> " + Player1.getName() + " uses GROWTH! His attack now will be doubled<<");
                System.out.println(Enemy.getName() + " frightened");
                damage = Player1.attack() * 2;
                System.out.println(Player1.getName() + " uses lightning bolt to " + Enemy.getName() + " "+ "["+damage+"]" );
                Enemy.wound(damage);
                System.out.println();
                break;
            }
            
            if("c".equals(skills)){
                System.out.println("");
                break;
                // continue to the first loop
                
                
            }
            else if(skills != "a" && skills !="b" && skills !="c"){
                System.out.println("Invalid input, please try again");
                break;
                // dowhile
            }
         }while(skills != "a" && skills !="b" && skills !="c");
           
           
                   
            round++;
            
            
            }
            }
        
          
            
                
                
                
            System.out.println();
            System.out.println("\t--GAME OVER--\n\t  Final HP: ");
            System.out.println(Player1.getName()+":" + Player1.getCurrentLife());
            System.out.println(Enemy.getName()+":" + Enemy.getCurrentLife());
            
            
        if(Player1.getCurrentLife() < Enemy.getCurrentLife()){
            System.out.println("\t" +Enemy.getName() + " WINS!");
            System.out.print(Player1.getName() + " fainted! ");
            System.out.println(Player1.getName() + " goes back to the pokeball");
            
            System.out.println("--Ash" + " left the arena--");
            System.out.println("--Misty gets the badge--");
        }else if(Enemy.getCurrentLife() < Player1.getCurrentLife()){
            System.out.println(Player1.getName() + " WINS!");
            System.out.print(Enemy.getName() + " fainted! ");
            System.out.println(Enemy.getName() + " goes back to the pokeball");
            System.out.println("--Misty" + " left the arena--");
            System.out.println("--Ash gets the badge--");
        }else if(Player1.getCurrentLife() <= 0 && Enemy.getCurrentLife() <= 0){
            System.out.println("DRAW!");}
            
           
        }
       }

   