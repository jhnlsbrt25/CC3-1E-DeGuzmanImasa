/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author m304user
 */
public class AnimalBP {
    String type;
    int numberofFeet;
    String color;
    boolean egg;
    
    // setting the type 
    public void setType(String type)
    {
        this.type = type;
    }
    public String getType()
    {
        return type;
        
    }
    // setting for number of feet
    public void setnumberofFeet(int numberofFeet) 
    {
        this.numberofFeet = numberofFeet;
    }
    
    public int getnumberofFeet()
    {
        return numberofFeet;
    }
    
    // setter for color
    public void color(String color)
    {
        this.color = color;
    }
    public String getcolor()
    {
        return color;
    }
    
    // egg
    public void egg(boolean egg)
    {
        this.egg= egg;
    }
    public boolean getegg()
    {
        return egg;
    }
            
   
}
