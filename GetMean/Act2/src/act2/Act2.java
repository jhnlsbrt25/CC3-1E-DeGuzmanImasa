/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication177;
import java.util.Scanner;

/**
 *
 * @author Acerr
 */
public class Act2{

        public static float mean(float[] x){

            double average = 0;

        for (int i=0;i<x.length;i++){

            average+= x[i];

        }

        System.out.println("Sum = " + average);

        return (float) (average/x.length);

    }


    
    public static void main(String[] args) {
      
    
    Scanner sc = new Scanner(System.in);
    // START TO RUN THE LOOP AGAIN USING DO WHILE
    String answer;
    do {
    System.out.print("How many numbers do you want to enter? ");
       
   
    while(true){
        
       
        try{
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        break;
        float list[] = new float[a];
        int i,num = 0;
        String input = " ";
        


    
    for(i=0; i<a; i++){
        
        System.out.print("Enter a number[" + i +"] = ");

        list[i] = sc.nextFloat();
        break;
        
    }

    

        System.out.println("Mean is: " + mean(list));
        break;
        
    }

     catch(Exception e){
        
        System.out.println("Invalid Error");
        System.out.println("Do you want to try again? \nYes or No?");
        answer = sc.next();
   
        }
        
    }
    
    System.out.println("Do you want to try again? \nYes or No?");
    answer = sc.next(); // USER'S INPUT
    
    
    
}
    while(answer.equalsIgnoreCase("Yes"));
    
    
    
}
    
}