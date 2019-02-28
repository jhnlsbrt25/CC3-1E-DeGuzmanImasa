/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m304user
 */

package CharDuel;

public abstract class Character {
        protected String name;
        protected int strength;
        protected int dexterity;
        protected int intelligence;
        protected int currentLife;
        protected int maxLife;
        protected int Weapon;;
        protected int Armor;

    static Dice dice = new Dice();
    
    public Character(String n, int s, int d, int i) {
     this.name=n;
     this.strength=s;
     this.dexterity=d;
     this.intelligence=i;
     this.maxLife=dice.roll()+50;
     this.currentLife=maxLife;

    }
    
    /**
     *
     */
    //abstract - attack method
        public abstract int attack();
      
    

    public void wound(int damage) {
        currentLife=currentLife-damage;

    }

    public void heal(int heal) {
         if(currentLife>maxLife)
             currentLife=currentLife+dice.roll() + intelligence;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getCurrentLife() {
        return currentLife;
    }

    public int getMaxLife() {
        return maxLife;
    }
    public int getWeapon() {
        Weapon = dice.roll() + strength;
        return Weapon;
    }
     public int getArmor() {
        Armor = dice.roll() + strength;
        return Armor;
    }
     
     
    public void setName(String name){
            this.name=name;
    }
    public void setStrength(int strength){
            this.strength=strength;
    }
    public void setDexterity(int dexterity){
            this.dexterity=dexterity;
    }
    public void setIntelligence(int intelligence){
            this.intelligence=intelligence;
    }
    public void setMaxLife(int maxLife){
            this.maxLife=maxLife;
    }
    public void setCurrentLife(int currentLife){
        this.currentLife=currentLife;
    }

    } 