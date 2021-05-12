
package friendsproject;
  import java.util.Scanner;
/**
 *
 * @author Jalyssa
 */
public class MightWeBeFriends {

    public static void main(String[] args){
    
   int compatScore = 0;
   final int TOTAL_COMPAT = 100;
   int userResponse = 0;
   Scanner inputScanner;
   boolean totalScore = false;
   final int YES_POINTS = 60;
   final int NO_POINTS = -20;

    inputScanner = new Scanner(System.in);


    System.out.println("Might we be friends? Lets find out!");
    System.out.println("Q1: Do you prefer Marvel and DC movies?");
    System.out.println("Enter 1 for yes and anything else for no");
    
userResponse = inputScanner.nextInt();
if(userResponse == 1){
    compatScore = compatScore + YES_POINTS;
    System.out.println("Great! Me too!");
    System.out.println("You earned " + YES_POINTS + "points");
    
    System.out.println("Choose a Marvel character. Type the corresponding number and hit enter:");
    System.out.println("1. Black Widow");
    System.out.println("2. Captain America");
    System.out.println("3. Thor");
    System.out.println("4. Scarlet Witch");
    System.out.println("5. Iron Man");
    System.out.println("6.Spider-Man");
    System.out.println("7. Captain Marvel");
    System.out.println("8. Other");
 
    userResponse = inputScanner.nextInt();

 if(userResponse == 1){
        compatScore = compatScore + 70;
}
else if (userResponse == 2){
    compatScore = compatScore + 60;
}
else if (userResponse == 3){
compatScore = compatScore + 40;
}
else if (userResponse == 4 ){
    compatScore = compatScore + 80;
}
else if (userResponse == 5){
compatScore = compatScore + 30;
}

else if (userResponse == 6){
compatScore = compatScore + 90;
}
else if (userResponse == 7){
compatScore = compatScore + 50;
}
else if (userResponse == 8){
compatScore = compatScore + 20;
}  
System.out.println("Choose a DC character. Type the corresponding number and hit enter:");
    System.out.println("1. Batman ");
    System.out.println("2. Superman");
    System.out.println("3. Wonder Woman");
    System.out.println("4. Aquaman");
    System.out.println("5. The Joker");
    System.out.println("6  Harley Quinn");
    System.out.println("7. The Flash");
    System.out.println("8. Other");
    
    userResponse = inputScanner.nextInt();
 

 if(userResponse == 1){
        compatScore = compatScore + 70;
}
else if (userResponse == 2){
    compatScore = compatScore + 60;
}
else if (userResponse == 3){
compatScore = compatScore + 40;
}
else if (userResponse == 4 ){
    compatScore = compatScore + 80;
}
else if (userResponse == 5){
compatScore = compatScore + 30;
}

else if (userResponse == 6){
compatScore = compatScore + 90;
}
else if (userResponse == 7){
compatScore = compatScore + 50;
}
else if (userResponse == 8){
compatScore = compatScore + 20;
}  
}
else{
    

compatScore = compatScore + NO_POINTS;

System.out.println("That's too bad. maybe we have somthing else in common.");

}


System.out.println("Q2: Whats Yor favorite movie snack?");

    System.out.println("1. Popcorn ");
    System.out.println("2. Raisinets ");
    System.out.println("3. M&M");
    System.out.println("4. Gummy Bears");
    System.out.println("5. Soft Pretzels");
    System.out.println("6   Junior Mints");
    System.out.println("7. Twizlers");
    System.out.println("8. Other");

userResponse = inputScanner.nextInt();

 if(userResponse == 1){
        compatScore = compatScore + 70;
}
else if (userResponse == 2){
    compatScore = compatScore + 5;
}
else if (userResponse == 3){
compatScore = compatScore + 80;
}
else if (userResponse == 4 ){
    compatScore = compatScore + 40;
}
else if (userResponse == 5){
compatScore = compatScore + 30;
}

else if (userResponse == 6){
compatScore = compatScore + 10;
}
else if (userResponse == 7){
compatScore = compatScore + 50;
}
else if (userResponse == 8){
compatScore = compatScore + 20;
}  




System.out.println("You accumulated " + compatScore + " points.");

if(compatScore >= TOTAL_COMPAT){

System.out.println("We will make Great Friends!!!");
}
else{

System.out.println("Your score is low we might not be friends.");

}

}
}
