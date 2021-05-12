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
public class Envelope {
   public double cashContents;
   public int idNumber;
   public String textOnFront;
   
   public void removeCashFromEnvelope(double cashRemoved){
   
   cashContents = cashContents - cashRemoved;
   if(cashContents < 0){
   
   cashContents = 0;
   
   }
   
   
   
   
   
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
