/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m304user
 */
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
public abstract class Wizard extends Character implements Weapon, Armor {
           int maxmagic;
           int currentmagic;
           
           
public Wizard (String n, int s, int i, int d) {
        super(n, s, i, d);
        maxmagic = dice.roll()+10;
        currentmagic = maxmagic;
    }
    
public int castLightningBolt() {
        int lightningBolt = dice.roll() + super.intelligence;
        if(currentmagic >= 5){
            currentmagic -= 5;
 
        
    }
        return lightningBolt;
}


    
           @Override
 public int attack() {
         int attack=dice.roll()+strength;
         return attack;
    }
 
public int castHeal() {
    int heal = dice.roll() + super.intelligence;
    if(currentmagic >= 8){
        currentmagic -=8;
    }
    currentLife = currentLife + heal;
    return heal;
}
public int getMaxMagic() {
    return maxmagic;
}

public int getCurrentMagic() {
    return currentmagic;
}
 
    @Override
    public int useWeapon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int useArmor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}