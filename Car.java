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
public class Car {
   public int year;
   public String makeModel;
   private boolean isEngineRunning;
   private double speed;
   
   
   public void startEngine(){
   isEngineRunning = true;
   System.out.println("...Crank...Crank...Vroom!");
   }
   
   public void stopEngine(){
    isEngineRunning = false;
    System.out.println("...grblllll....shldunk");
     }
   
   public boolean checkEngineStatus(){
   return isEngineRunning;
  }
   
   public double getCurrentSpeed (){
   return speed;
  }
           
  public double accelerate(int mphIncrease){
  speed = speed + mphIncrease;
  return speed;
  } 
  
  public double decelerate(int mphDecelerate){
  speed = speed - mphDecelerate;
  return speed;
  }
   
   
   
   
   
}
