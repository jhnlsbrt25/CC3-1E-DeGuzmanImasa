package dice;

public class Wizard extends Character {
           int maxmagic;
           int currentmagic;
           
           
public Wizard (String n, int s, int i, int d) {
        super(n, s, i, d);
        maxmagic = dice.roll();
        currentmagic = maxmagic;
    }
    
public int castLightningBolt() {
        int lightningBolt = dice.roll() + super.intelligence;
        if(currentmagic >= 5){
            currentmagic -= 5;
 
        
    }
        return lightningBolt;
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
    
}
