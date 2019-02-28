/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CharDuel;

/**
 *
 * @author m304user
 */
import java.util.Scanner;

public class CharacterDuel {
    
    public static void main(String[] args){
      


        Scanner sc = new Scanner(System.in);
        Character Player1 = new Wizard("Pikachu",10, 10, 10) {};
        Wizard Enemy = new Wizard("Arceus", 10, 10, 10) {}; 
       
        int round = 1;
        int damage;
        int lightningBolt;
        int dmg1;
        String skills; // skills option
        
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
            System.out.println(Player1.getName() + " uses thunderbolt to " + Enemy.getName() + " " + "["+damage+"]");
            
            Enemy.wound(damage);
            }
            // enemy attacks
            if(Enemy.getCurrentLife()>0 && Player1.getCurrentLife() >0)
            {
            lightningBolt= Enemy.castLightningBolt();
            System.out.println(Enemy.getName() + " uses draco meteor to " + Player1.getName() + " " + "["+lightningBolt+"]");
            Player1.wound(lightningBolt);
            }
            
           // sample 2.0 // why not running?! 
            if(Enemy.getCurrentMagic() <= 50){
                dmg1 = Enemy.castLightningBolt();
                Player1.wound(dmg1);
                
                System.out.println(Enemy.getName() + " casts a lightning bolt to " + Player1.getName() 
                        + " for " +  "["+dmg1+"]");
                
            }else if(Enemy.getCurrentMagic() <= 20){
                dmg1 = Enemy.useWeapon();
                Player1.wound(dmg1);
                System.out.println(Enemy.getName() + " uses sword attack " + Player1.getName() 
                        + " for " + "["+dmg1+"]");
                
            } 
                    
                  
         do{ // player options
             
             System.out.println("******Super Skill Activated!******");
             System.out.println("******What Skill do you want to use?******");
             System.out.println();
             System.out.println("[a] Healing Galing for Arceus\n[b] Growth for Pikachu\n[c] Pass");
             skills = sc.nextLine();
           
             
            if ("a".equals(skills)) {
           
            // p2 heals
            if(Enemy.getCurrentLife()>0 && Player1.getCurrentLife()> 0)
            {
            System.out.println(Enemy.getName() + " has "+ Enemy.getCurrentLife() + " HP");
            System.out.println(">> " +Enemy.getName() + " uses his super skill: Healing Galing" + " <<");
            System.out.println(Enemy.getName() + " uses heal " + "["+Enemy.castHeal()+"]");
            System.out.println(Enemy.getName() + " now has " + Enemy.getCurrentLife() + " HP");
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
                System.out.println("***Invalid input, please try again!***");
                System.out.println();
               
                // dowhile
            }
            }while(skills != "a" && skills !="b" && skills !="c");
             round++;
            }
            }
        // exit 
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