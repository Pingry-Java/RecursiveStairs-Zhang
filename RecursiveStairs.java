import java.util.Scanner;

public class RecursiveStairs
{

 /**
  * This program has three main methods, the main method and the two staircase methods.
  * The main method sets up necessary variables from the user, and the two methods
  * recursively print stairs.
  * @author William Zhang
  * @version 0.1
  */

  public static void main(String[] args)
  {

    
    Scanner keyboard = new Scanner(System.in); 

    System.out.println("How many stairs do you want in your staircase?  ");
    int levels = keyboard.nextInt();

   
    System.out.print("\nAscending Stairs:");

    ascendingStairs(levels);

    System.out.println("\nDescending Stairs:");

    descendingStairs(levels);
  }

      /**
       * This method says that while the counter is greater than 0, continue to recurse.
       * The algorithm will print nothing until it hits the "bottom" of the chain, 
       * at which point it will begin to print stars, at first one because levels is small, 
       * but as it goes back up the chain will get bigger.
       * @param the number of levels the user gave
       */

  public static void ascendingStairs(int levels)
  {  
      if (levels > 0)
      {
        ascendingStairs(levels-1);
      }


        
      for(int n = 0; n < levels; n++) 
      { 
        System.out.print("*"); 
      }
  
        System.out.println(""); 
   } 

 
      /**
       * Functions the opposite of the first method, and instead prints the largest number of stars first,
       * then goes up the chain and prints one less each time because of the minus one increment
       * made to the levels variable.
       * @param levels, the number of levels of stairs the user wants from input
       */
  public static void descendingStairs(int levels) 

  {
    

    for (int n = 0; n < levels; n++) 
    {
      System.out.print("*");
    }

     System.out.println("");



    if (levels > 0)
    {
      descendingStairs(levels-1);
    }


  }

}
