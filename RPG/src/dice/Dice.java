
package dice;

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
