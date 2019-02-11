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

import java.util.Random;

public class Dice {
    
    private final Random r;
    public Dice () {
     this.r = new Random();  
    }
    public int roll (){
        int roll = r.nextInt(6)+1;
        return roll;
    }
    
}
