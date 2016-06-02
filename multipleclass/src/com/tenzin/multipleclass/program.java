/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.multipleclass;
import java.util.Scanner;
/**
 *
 * @author Home
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        ball ballObject = new ball();
        
        System.out.println("Enter your name here: ");
        String name = input.nextLine();
        
        ballObject.football(name);
        
        
  
       
       while(true){
        System.out.println("Enter First Number");
        float x = input.nextFloat();
        System.out.println("Enter Second Number");
        float y = input.nextFloat();
        
        float add, sub, mult, div, remainder;
        
        System.out.println("What do you want to do?");
        
        
        System.out.print(" 1.add");
        System.out.print(" 2.sub");
        System.out.print(" 3.mult");
        System.out.print(" 4.div");
        System.out.println(" 5.remainder");
        System.out.println(" 6.Exit");
        
        String choice = input.next();
        if(choice.equalsIgnoreCase("1"))
        {
            add = x + y;
            System.out.println("the sum of x and y is = "+ add);
        }
        else if(choice.equalsIgnoreCase("2"))
       {
           sub = x - y;
           System.out.println("the difference of x and y is = "+ sub);}
           else 
           if(choice.equalsIgnoreCase("3"))
           {    
               mult = x * y;
               System.out.println("the multiplication is = "+ mult);
           }
           else if(choice.equalsIgnoreCase("4"))
           {
               div = x / y;
               System.out.println("the division of x and y is = "+ div);
       }else if(choice.equalsIgnoreCase("5"))
       {
           remainder = x % y;
           System.out.println("remainder = "+ remainder);
       }
       else 
           System.exit(0);
        
           System.out.println("do you want to continue?[Y/N]");
           String select=input.next();
           if(select.equalsIgnoreCase("n"))
               System.exit(0);
         }
             
    }
    }     

