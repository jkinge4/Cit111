/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author jayli
 */
public class ObjectProjectFinal {
    
    public static void main(String[] args){
    
    book1();
    book2();
    book3();
    book4();
    book5();
    book6();
    book7();
    }
     public static void book1(){
     
     BookShelf book1 = new BookShelf();
     book1.Name = "One of Us is Lying";
     book1.Author = "Karen M. McManus";
     book1.pageNumber = 360;
     book1.Summary = "This book is about five students at Bayview High School that get detention. "
             + "While there one of the students dies.Was it an accident or was he murdered by one or "
             + "all of them to protect there secrets.";
     
     
     System.out.println("Book Facts: ");
     System.out.println(book1.Name);
     System.out.println("Author: " + book1.Author);
     System.out.println("Page Nimber: " + book1.pageNumber);
     System.out.println("Summary: " + book1.Summary);
     
     
      System.out.println("--------------------------------------------------------------------------------------------");
      System.out.println("--------------------------------------------------------------------------------------------");
      System.out.println("--------------------------------------------------------------------------------------------");
     
     }
     
     
     public static void book2(){
     BookShelf book2 = new BookShelf();
     book2.Name = "Eveything, Everything";
     book2.Author = "Nicola Yoon";
     book2.pageNumber = 310;
     book2.Summary ="This book a 18 year old  Madeline 'Maddy' Whittier who is being treated for Severe Combined"
             + "Immunodeficiency 'SCID' and has to stay in her house. Unti she meets someone "
             + "who makes her want to everything and go outside";
     
     
     System.out.println("Book Facts: ");
     System.out.println(book2.Name);
     System.out.println("Author: " + book2.Author);
     System.out.println("Page Nimber: " + book2.pageNumber);
     System.out.print("Summary: " + book2.Summary);
     
     
     System.out.println("--------------------------------------------------------------------------------------------");
     System.out.println("--------------------------------------------------------------------------------------------");
     System.out.println("--------------------------------------------------------------------------------------------");
        }
     
     public static void book3(){
     BookShelf book3 = new BookShelf();
     book3.Name = "To Kill a Mockingbird";
     book3.Author = "Harper Lee";
     book3.pageNumber = 281;
     book3.Summary ="This book tells the story of young narrator Scout's passage from innocence to "
             + "experience when her father Atticus Finch confronts the racist justice system of the rural, "
             + "Depression-era South.";
     
     System.out.println("Book Facts: ");
     System.out.println(book3.Name);
     System.out.println("Author: " + book3.Author);
     System.out.println("Page Nimber: " + book3.pageNumber);
     System.out.println("Summary: " + book3.Summary);
     
     
      System.out.println("--------------------------------------------------------------------------------------------");
      System.out.println("--------------------------------------------------------------------------------------------");
      System.out.println("--------------------------------------------------------------------------------------------");   
     }
     
     public static void book4(){
     BookShelf book4 = new BookShelf();
     book4.Name = "The Pelican Brief";
     book4.Author = "John Grisham";
     book4.pageNumber = 387;
     book4.Summary = "This book is about a young law student whose legal brief about the assassination "
             + "of two Supreme Court Justices causes her to be targeted by killers. She realizes just how "
             + "accurate her accusations have been when her lover and mentor is murdered. Forced to "
             + "go on the run in New Orleans, she is aided by a jounalist who helps her unravel a conspiracy "
             + "involving senior government figures.";
     
     System.out.println("Book Facts: ");
     System.out.println(book4.Name);
     System.out.println("Author: " + book4.Author);
     System.out.println("Page Nimber: " + book4.pageNumber);
     System.out.println("Summary: " + book4.Summary);
     
     
      System.out.println("--------------------------------------------------------------------------------------------");
      System.out.println("--------------------------------------------------------------------------------------------");
      System.out.println("--------------------------------------------------------------------------------------------");
        }
     
     public static void book5(){
     BookShelf book5 = new BookShelf();
     book5.Name ="The Rest of the Story";
     book5.Author ="Sarah Dessen";
     book5.pageNumber =440;
     book5.Summary ="This book is about a girl named Emma Saylor Payne and her summer with her mothers "
             + "family,after her summer summer plans are canceled and her father scrambles to find a solution"
             + "before he leaves the country.";
     
     System.out.println("Book Facts: ");
     System.out.println(book5.Name);
     System.out.println("Author: " + book5.Author);
     System.out.println("Page Nimber: " + book5.pageNumber);
     System.out.println("Summary: " + book5.Summary);
   
     
      System.out.println("--------------------------------------------------------------------------------------------");
      System.out.println("--------------------------------------------------------------------------------------------");
      System.out.println("--------------------------------------------------------------------------------------------");
     }
     
     public static void book6(){
     BookShelf book6 = new BookShelf();
     book6.Name ="Chemical Hearts";
     book6.Author ="Krystal Sutherland";
     book6.pageNumber = 320;
     book6.Summary ="This book is a kind of love story and not your average story of boy meets girl."
             + "The story starts off with Henry Page telling the readers about how he expected to first"
             + "fall in love, and then introducing us to his unexpected first love Grace."; 
     
     System.out.println("Book Facts: ");
     System.out.println(book6.Name);
     System.out.println("Author: " + book6.Author);
     System.out.println("Page Nimber: " + book6.pageNumber);
     System.out.println("Summary: " + book6.Summary);
     
      System.out.println("--------------------------------------------------------------------------------------------");
      System.out.println("--------------------------------------------------------------------------------------------");
      System.out.println("--------------------------------------------------------------------------------------------");
     }
     public static void book7(){
     BookShelf book7 = new BookShelf();
     book7.Name ="";
     book7.Author ="";
     book7.pageNumber = 288;
     book7.Summary = "This book is about two teens with Cystic Fibrosis dealing with first love and uncertanty "
             + "of their futures. Stella's an organized achiever who has her life in order and manages her medications "
             + "and treatments efficienty. Will's the total opposite.";
    
     
     System.out.println("Book Facts: ");
     System.out.println(book7.Name);
     System.out.println("Author: " + book7.Author);
     System.out.println("Page Nimber: " + book7.pageNumber);
     System.out.println("Summary: " + book7.Summary);
        }
    
}
