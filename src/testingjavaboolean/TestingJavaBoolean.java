/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingjavaboolean;

import java.util.Scanner;

/**
 *
 * @author varun
 */
public class TestingJavaBoolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);

        
        System.out.println("How old are you");
        int age=Integer.parseInt(reader.nextLine());
        
        boolean majority=false;
        
        if(age>=18){
        majority=true;
        }
        else if(age<18)
        {majority=false;}
        
        if(majority=true)
        {
            System.out.println("You have reached the age of majority!");
        }
        else if(majority=false)
        {
            System.out.println("You have not reached the age of majority yet!");
        }
    }
    
}
