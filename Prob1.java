import java.util.Scanner;

public class Prob1 {
  public static void main(String[] args){
  Scanner scan = new Scanner (System.in);

  System.out.println("Enter an integer: ");
  int test = scan.nextInt();

  if (test < 76)
  {

    if (test > 5)
      {
        System.out.println("True");
      }
  }

  else
  {
    System.out.println("False");
  }

  }
}