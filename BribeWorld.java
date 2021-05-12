/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;


/**
 *
 * @author jayli
 */
public class BribeWorld {
    
    public static void main(String[] args){
    
    Envelope physicsBribe = new Envelope();
    
    physicsBribe.cashContents = 50.0;
    physicsBribe.idNumber = 1;
    physicsBribe.textOnFront = "B on Midterm";
    
    
    Envelope linearAlgebraBribe = new Envelope();
    linearAlgebraBribe.cashContents = 20.0;
    linearAlgebraBribe.idNumber = 2;
    linearAlgebraBribe.textOnFront = "D in Linear Algebra";
    
    
    System.out.println("Inside main, before print");
    displayEnvelopeValues(physicsBribe);
    
    
    prefixEnvelopeText(physicsBribe, "Please give me a ");
    System.out.println("Inside main, before print");
    
    displayEnvelopeValues(physicsBribe);
    
  }
    public static void displayEnvelopeValues(Envelope env){
       
        System.out.println("Envelope Values: ");
        System.out.println("Cash: " + env.cashContents);
        System.out.println("ID: " + env.idNumber);
        System.out.println("Text on Front: " + env.textOnFront);
        
     }
    
    
    public static void prefixEnvelopeText(Envelope env, String prefix){
    
    System.out.println("Prefixing \"" + prefix + "\" to Envelope ID " + env.idNumber);
    
    env.textOnFront = prefix + " " + env.textOnFront;
    
    
    
    }
    
    
}
