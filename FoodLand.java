/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author Jalyssa
 */
public class FoodLand {
    public static int totalCarbs;
    public static double cholesterol;
    
    public static void main (String[] args){
     
       bbqChips();
       
       chocolateChipMuffins();
       
       granola();
      }
       
      
       public static void bbqChips(){
           
           FoodItem bbqChips = new FoodItem();  
           bbqChips.Name = "Wise BBQ Chips";
           bbqChips.calPerServing = 150;
           bbqChips.servingSize = 28;
           bbqChips.servingsPerContainer = 6;
           bbqChips.servingSizeUnit = "Grams";
           totalCarbs = 9;
           cholesterol = 0;
           
     System.out.println(bbqChips.Name);
     System.out.println("Nutrition Facts: ");
     System.out.println("Serving Calories: " + bbqChips.calPerServing);
     System.out.println("Serving Per Container: " + bbqChips.servingsPerContainer);
     System.out.println("");
 }
       public static void chocolateChipMuffins(){
       }
       public static void granola(){
       }
    
}
