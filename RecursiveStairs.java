import java.util.Scanner;

public class RecursiveStairs
{

 /**
  *
  *
  */

  public static void main(String[] args)
  {

    
    Scanner keyboard = new Scanner(System.in); 

    System.out.println("How many stairs do you want in your staircase?  ");
    int levels = keyboard.nextInt();

   
    System.out.print("Ascending Stairs:");

    ascendingStairs(levels);

    System.out.println("Descending Stairs:");

    descendingStairs(levels);
  }

      /**
       *
       *
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
       *
       */
  public static void descendingStairs(int levels) //have to use tail recursion 

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
