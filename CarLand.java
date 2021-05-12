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
public class CarLand {
    
    public static void main (Srring[] args){
    Car deLorean = new Car();
    
    deLorean.year = 1983;
    deLorean.makeModel = "DeLorean DMC-12";
    displayCarStats(Delorean);
    deLorean.startEngine();
    deLorean.accelerate(88);
    deLorean.decelerate(12);
    
    displayCarStats(deLorean);
    deLorean.stopEngine();
    displayCarStats(deLorean);
}
public static void displayCarStats(Car anyCarObject){

System.out.println("***** STATS *****");
System.out.println(anyCarObject + "" + anyCarObject.makeModel);
System.out.println("Engine running?" + anyCarObject.checkEngineStatus());
System.out.println("CurrentSpeed " + anyCarObject.getCurrentSpeed());
System.out.println("***************");





}    
    
    
    
    
    
    
    
    
}
