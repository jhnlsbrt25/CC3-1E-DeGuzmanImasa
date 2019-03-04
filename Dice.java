/**
 * Java class Dice
 * The Dice class models rolling a regular six-sided die
 * @author m304user terminal number 30
 */

package CharDuel;

import java.util.Random;

public class Dice {
/** instance variables */
    private final Random r;
/** instantiate the object r 
* 
*/
    
/*  class Dice generates Random number
    by importing Random utility
 */     
public Dice(){
  r=new Random();
}
/** 
 * 
 * @return random number (integer) between 1 and 6
 */
public int roll(){
   return r.nextInt(20)+1;
}
}