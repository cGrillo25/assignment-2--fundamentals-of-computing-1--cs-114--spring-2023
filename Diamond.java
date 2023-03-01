//****************************************************************************************************************
//  Diamond.Java        Author:  Courtney Grillo
//
//  Uses user input in nested for loops
//****************************************************************************************************************


public class Diamond {

  //--------------------------------------------------------------------------------------------------------------
  //  Prints a diamond based on user input
  //--------------------------------------------------------------------------------------------------------------
  public static void main(String[] args) {

    int userInput;


    java.util.Scanner scan = new java.util.Scanner(System.in) ;


    System.out.print("Please enter an integer:  ");
    userInput = scan.nextInt();


    if (userInput % 2 == 1)
    {
      for(int oddRows = 0; oddRows < userInput / 2; oddRows ++)
      {
        for(int oddWhiteSpace = 0; oddWhiteSpace < (userInput - 1) - oddRows; oddWhiteSpace ++)
        {
          System.out.print(" ");
        }
        for(int oddStar = 0; oddStar < oddRows; oddStar++)
        {
          System.out.print("*");
        }
        for(int oddAlsoStar = 0; oddAlsoStar < oddRows + 1; oddAlsoStar ++)
        {
          System.out.print("*");
        }
        System.out.println();
      }


      for(int bottomOddRows = userInput / 2; bottomOddRows >= 0; bottomOddRows--)
      {
        for(int bottomOddWhiteSpace = 0; bottomOddWhiteSpace < (userInput - 1) - bottomOddRows; bottomOddWhiteSpace ++)
        {
          System.out.print(" ");
        }
        for(int bottomOddStar = 0; bottomOddStar < bottomOddRows; bottomOddStar ++)
        {
          System.out.print("*");
        }
        for(int oddStarToo = 0; oddStarToo < bottomOddRows + 1; oddStarToo ++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
    }


    else if (userInput % 2 == 0)
    {
      for(int evenRows = 0; evenRows < userInput / 2; evenRows++)
      {
        for (int evenWhiteSpace = 0; evenWhiteSpace < (userInput - 1) - evenRows; evenWhiteSpace ++)
        {
          System.out.print("   ");
        }
        for(int evenStar = 0; evenStar < evenRows; evenStar++)
        {
          System.out.print(" * ");
        }
        for(int evenAlsoStar = 0; evenAlsoStar < evenRows - 1; evenAlsoStar ++)
        {
          System.out.print(" * ");
        }
        System.out.println();
      }


      for(int bottomEvenRows = userInput / 2; bottomEvenRows >= 0; bottomEvenRows--)
      {
        for(int bottomOddWhiteSpace = 0; bottomOddWhiteSpace < (userInput - 1) - bottomEvenRows; bottomOddWhiteSpace ++)
        {
          System.out.print("   ");
        }
        for(int bottomOddStar = 0; bottomOddStar < bottomEvenRows; bottomOddStar ++)
        {
          System.out.print(" * ");
        }
        for(int oddStarToo = 0; oddStarToo < bottomEvenRows - 1; oddStarToo ++)
        {
          System.out.print(" * ");
        }
        System.out.println();
      }
    }
  }
}
