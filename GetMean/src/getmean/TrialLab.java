/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getmean;

/**
 *
 * @author m304user
 */
public class TrialLab 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nameAndAddress();
        System.out.println("First Java application");
    }
    public static void nameAndAddress(){
            System.out.println("Event Handlers Incoporated");
            System.out.println("8900 U.S. Hwy 14");
            System.out.println("Crystal Lake, IL 60014");
        // TODO code application logic here
    }
    public static void predictRaise(double moneyAmount)
    {
      double newAmount;
      final double RAISE = 9.99;
      newAmount = moneyAmount = RAISE;
      System.out.println("with raise, salary is " + newAmount);
    }
   
}
