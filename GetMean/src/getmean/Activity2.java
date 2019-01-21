/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getmean;
import java.util.Scanner;

/**
 *
 * @author m304user
 */
public class Activity2 {
    public static float getMean(float[] x){
        float average = 0;
    for (int i=0; i <x.length;i++){
        average+= x[i];
    }
    System.out.println("Sum = " + average);
    return (float) (average/x.length);
    
    }
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("How many numbers do you want to enter?");
       
        while(true) {
        try{
            sc = new Scanner(System.in);
            int a = sc.nextInt();
            float list[] = new float[a];
            int i,num = 0;
            String input = " ";
           
        
        for (i=0; i<a; i++) {
            System.out.println("Enter a number[" + i + "] = ");
            list [i] = sc.nextFloat();
            
        }
        System.out.println("Mean is: " + getMean(list));
        break;
        
        }
        catch(Exception e) {
            System.out.println("Invalid Size");
        }
        
    }
    

    }
}
