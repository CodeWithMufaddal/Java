import java.util.*;

public class GuessTheNumber {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      Random random = new Random();
      int ComputerGuess = random.nextInt(100);
      int i = 1;
      do {
         System.out.print(" \nGuess a Number: ");
         int UserInput = sc.nextInt();
         if (UserInput > ComputerGuess) {
            System.out.println(" \n The Number is Lowerrr than Your Guess!");

         } else if (UserInput < ComputerGuess) {
            System.out.println(" \nThe Number is Higherrr than Your Guess!");
         } else {
            break;
         }
         i++;
      } while (true);
      System.out.println(" \nHurryy You Finally Guess The Correct Number in: " + i + " Attempt\n");

   }
}
