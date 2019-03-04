/**
* The Wizard class extends Character, adding two new instance
* variables: maxmagic, and currentmagic, as well as the
* castLightningBolt() and castHeal() methods, which represent
* casting magic spells.
*/
/**
 *
 * @author m304user terminal number 30
 */
package CharDuel;
// subclass Wizard extends Character class that implements the interfaces Weapon and Armor 
public class Wizard extends Character implements Weapon, Armor { 
    /** instance variables */
           int maxmagic;
           int currentmagic;
           
/**
* The Wizard(String,int,int,int) constructor overrides the
* constructor with the same signature in Character. It first
* calls that constructor using the super keyword, then
* initializes maxmagic to a value, and sets currentmagic to
* the same value.
*/           
public Wizard (String n, int s, int i, int d) {
        super(n, s, i, d);
        maxmagic = dice.roll()+10;
        currentmagic = maxmagic;
    }
/**
* castLightningBolt() represents casting a magic spell. The
* method first checks that currentmagic is greater than/equal
* to 5. If it is, currentmagic is reduced by 5 and a random
* number is returned using the dice inherited from Character,
* modified by the character's intelligence.
* Otherwise, returns 0.
*/    
public int castLightningBolt() {
        int lightningBolt = dice.roll() + super.intelligence;
        if(currentmagic >= 5){
            currentmagic -= 5;
 
        
    }
        return lightningBolt;
}


    
           @Override // overrides the attack method 
 public int attack() {
         int attack=dice.roll()+strength;
         return attack;
    }
/**
* castHeal() represents casting a magic spell. The method first
* checks that currentmagic is greater than/equal to 8. If it
* is, currentmagic is reduced by 8 and the character's heal()
* method is called with a random number, modified by the
* character's intelligence score. The amount healed is also
* returned by the method.
*/ 
public int castHeal() {
    int heal = dice.roll() + super.intelligence;
    if(currentmagic >= 8){
        currentmagic -=8;
    }
    currentLife = currentLife + heal;
    return heal;
}
/** 
 * 
 * @return maxmagic
 */
public int getMaxMagic() {
    return maxmagic;
}
/**
 * 
 * @return currentmagic 
 */
public int getCurrentMagic() {
    return currentmagic;
}

/* @throws UnsupportedOperationException 

*/
    @Override
    public int useWeapon() {
        throw new UnsupportedOperationException("Not supported yet."); //
    }

    @Override
    public int useArmor() {
        throw new UnsupportedOperationException("Not supported yet."); //
    }
    
    
    
} // emd of block 