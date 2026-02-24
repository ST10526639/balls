/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatoday;

import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class Javatoday {

    
    public static void main(String[] args) {
        
    Scanner inputobj = new Scanner(System.in);
    
   String fname;
   String lname;
   String phone;
   String ID;
   String Nat;
   
   System.out.println("Name");
   fname = inputobj.next();
     System.out.println("last Name");
     lname = inputobj.next();
       System.out.println("ID no: " );
       ID= inputobj.next();
       System.out.println("phone: ");
       phone= inputobj.next();
       System.out.println("nationality:");
   Nat = inputobj.next();
   
   System.out.println("Name:"+fname+" "+lname);
   System.out.println("ID: "+ID);
   System.out.println("no: "+phone);
   System.out.println("Nat: "+Nat);
   
    }
    
}
