/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice;

/**
 *
 * @author m304user
 */
import java.util.Scanner;
public class TestCharacter {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);



        Character Player1 = new Character("Pnoy" ,6, 4, 3);
        Character Player2 = new Character("Digong", 4, 4, 3);
       
        int round = 1;
        int damage;
       
        
        System.out.println("");
        
        while (Player1.getCurrentLife() >= 0 && Player2.getCurrentLife() >= 0){
            for(round= 1; round<=3;round ++ )
                if(Player1.getCurrentLife() > 0 && Player2.getCurrentLife() > 0){
                    System.out.println("------Round " +round+ "-----");
            
            System.out.println(Player1.getName() + ":" + Player1.getCurrentLife());
            System.out.println(Player2.getName() + ":" + Player2.getCurrentLife());
            if(Player1.getCurrentLife() >0 && Player2.getCurrentLife() >0 ){
            damage= Player1.attack();
            System.out.println(Player1.getName() + " attacked " + Player2.getName() +" " + damage);
            Player2.wound(damage);
            }
            if(Player2.getCurrentLife()>0 && Player1.getCurrentLife() >0){
            damage= Player2.attack();
            System.out.println(Player2.getName() + " attacked " + Player1.getName() + " " + damage);
            Player1.wound(damage);
            
            }
            }
            break ;
        
            
        
        }
            
            System.out.println("Final Life");
            System.out.println(Player1.getName()+":" + Player1.getCurrentLife());
            System.out.println(Player2.getName()+":" + Player2.getCurrentLife());
            
            
        if(Player1.getCurrentLife() < Player2.getCurrentLife()){
            System.out.println(Player2.getName() + " WINS!");
        }else if(Player2.getCurrentLife() <= Player1.getCurrentLife()){
            System.out.println(Player1.getName() + " WINS!");
        }else if(Player1.getCurrentLife() <= 0 && Player2.getCurrentLife() <= 0){
            System.out.println("DRAW!");}
            
           return;
        }
           
         
    }