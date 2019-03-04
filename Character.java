/**
* The Character class models a character for a roleplaying game.
* A character has a name and 3 stats: strength, dexterity, and
intelligence, as
* well as maximum allowed life points and the current value.
*/

/**
 *
 * @author m304user terminal number 30
 */

package CharDuel;

public abstract class Character {
    /** instance variables */
        protected String name;
        protected int strength;
        protected int dexterity;
        protected int intelligence;
        protected int currentLife;
        protected int maxLife;
        protected int Weapon;;
        protected int Armor;
/** static variable */
    static Dice dice = new Dice();
    
/**
* Constructor takes 4 parameters: n,s,d,i and assigns them to
* instance variables name, strength, dexterity, intelligence.
* Also uses the dice instance to assign a random
* number to maxlife. CurrentLife is initialized to maxlife
*/   

/** @param n, s, d, i integer variable */
    public Character(String n, int s, int d, int i) {
     this.name=n;
     this.strength=s;
     this.dexterity=d;
     this.intelligence=i;
     this.maxLife=dice.roll()+50;
     this.currentLife=maxLife;
    }
    
/**
* Returns a random die roll using the roll method in the
* Dice.java, *modified by the character's strength
*/
    
    public abstract int attack(); //attack method abstract 
    
/**
* @param damage 
* Decreases currentLife by the damage parameter
*/  
    public void wound(int damage) {  
        currentLife=currentLife-damage;

    }
    
/**
* Increases currentLife by the heal parameter.
* currentLife cannot be greater than maxLife
* @param heal
*/

    public void heal(int heal) {
         if(currentLife>maxLife)
             currentLife=currentLife+dice.roll() + intelligence;
    }
    
/**
* @return name
*/ 
    public String getName() {
        return name;
    }
/**
* @return strength
*/ 
    public int getStrength() {
        return strength;
    }
/**
* @return dexterity
*/ 
    public int getDexterity() {
        return dexterity;
    }
/**
* @return intelligence
*/ 
    public int getIntelligence() {
        return intelligence;
    }
/**
* @return intelligence
*/ 
    public int getCurrentLife() {
        return currentLife;
    }
/**
* @return maxLife
*/ 
    public int getMaxLife() {
        return maxLife;
    }
/**
* @return Weapon
*/    
    public int getWeapon() {
        Weapon = dice.roll() + strength;
        return Weapon;
    }
/**
* @return Armor 
*/ 
     public int getArmor() {
        Armor = dice.roll() + strength;
        return Armor;
    }
     
     
   
    } // end of block