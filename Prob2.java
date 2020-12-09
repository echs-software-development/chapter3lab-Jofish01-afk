import java.util.Scanner;

public class Prob2 {
  public static void main(String[] args){
  Scanner scan = new Scanner (System.in);

  System.out.println("Enter integer one:");
        int numone = scan.nextInt();

        System.out.println("Enter integer two:");
        int numtwo = scan.nextInt();

        if (numone >= 0)
        {
            if (numtwo >= 0)
            {
                System.out.println("Both are positive or zero.");
            }
            else
        {
            System.out.println("One or more are negative.");
        }
        }

        else
        {
            System.out.println("One or more are negative.");
        }

  }
  
}