
package dice;
public class Character {
        protected String name;
        protected int strength;
        protected int dexterity;
        protected int intelligence;
        protected int currentLife;
        protected int maxLife;


    static Dice dice = new Dice();

    public Character(String n, int s, int d, int i) {
     this.name=n;
     this.strength=s;
     this.dexterity=d;
     this.intelligence=i;
     this.maxLife=dice.roll()+50;
     this.currentLife=maxLife;

    }

    public int attack() {
         int attack=dice.roll()+strength;
         return attack;
    }

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