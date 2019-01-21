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
public class Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("------WELCOME TO UC ZOO------");
        System.out.println();
        // TODO code application logic here
        AnimalBP turtle = new AnimalBP();
        AnimalBP dog = new AnimalBP();
        AnimalBP dino = new AnimalBP();
        
        // turtle
        System.out.println("\t ANIMAL 1: Turtle");
        System.out.println();
        turtle.setType("Type: Reptile");
        String turtleType = turtle.getType();
        System.out.println(turtleType);
        
        turtle.setnumberofFeet(4);
        int feetType = turtle.getnumberofFeet();
        System.out.println("Number of feet: "+ feetType);
        
        turtle.color("Magenta");
        String colorType = turtle.getcolor();
        System.out.println("Color: " + colorType);
        
        turtle.egg(true);
        boolean turtleEgg = turtle.getegg();
        System.out.println("Can lay egg: " + turtleEgg);
        
        // doggy
        System.out.println();
        System.out.println("\t ANIMAL 2: Dog");
        System.out.println();
        dog.setType("Type: Mammal");
        String dogType = dog.getType();
        System.out.println(dogType);
        
        dog.setnumberofFeet(4);
        int feetTypeD = dog.getnumberofFeet();
        System.out.println("Number of feet: "+ feetTypeD);
        
        dog.color("Rainbow");
        String colorTypeD = dog.getcolor();
        System.out.println("Color: " + colorTypeD);
        
        dog.egg(false);
        boolean dogEgg = dog.getegg();
        System.out.println("Can lay egg: " + dogEgg);
        
        // dino
        System.out.println();
        System.out.println("\t ANIMAL 3: Dino");
        System.out.println();
        dino.setType("Type: Reptile");
        String dinoType = dino.getType();
        System.out.println(dinoType);
        
        dino.setnumberofFeet(2);
        int feetTypeDi = dino.getnumberofFeet();
        System.out.println("Number of feet: "+ feetTypeD);
        
        dino.color("mostly brown");
        String colorTypeDi = dino.getcolor();
        System.out.println("Color: " + colorTypeDi);
        
        dino.egg(true);
        boolean dinoEgg = dino.getegg();
        System.out.println("Can lay egg: " + dinoEgg);
        
        
        
        
                
                
    }
    
}
