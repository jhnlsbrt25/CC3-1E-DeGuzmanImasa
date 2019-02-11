
package dice;
public class Character {
    static Dice dice = new Dice();
    
    private final String name;
    private final int strength;
    private final int dexterity;
    private final int intelligence;
    private final int maxlife;
    private int currentlife;
    
    Character (String a, int b, int c, int d){
        this.name = a;
        this.strength = b;
        this.dexterity = c;
        this.intelligence = d;
        this.maxlife = 20;
        this.currentlife = maxlife;
    }
    public int attack(){
        int damage = dice.roll() + strength;
        return damage;
    }
    public int wound(int damage){
        currentlife -= damage;
        return 0;
    }
    public int heal(int heal){
        currentlife += heal;
        if(currentlife > maxlife){
           currentlife = maxlife;
        }
        return 0;
    }
    public String getName(){
        return name;
    }
    public int getStrength(){
        return strength;
    }
    public int getDexterity(){
        return dexterity;
    } 
    public int getIntelligence(){
        return intelligence;
    }
    public int getMaxLife(){
        return maxlife;
    }
    public int getCurrentLife(){
        return currentlife;
    }
    
}

