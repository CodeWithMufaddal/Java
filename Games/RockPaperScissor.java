import java.util.*;

public class RockPaperScissor {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("\nEnter Your Guess: ");
      int UserInput = sc.nextInt();
      Random rand = new Random();
      int ComputerInput = rand.nextInt(3);
      System.out.println();
      if (UserInput == ComputerInput) {
         System.out.println("draw");
      } else if (UserInput == 0 && ComputerInput == 2 ||
            UserInput == 2 && ComputerInput == 1 ||
            UserInput == 1 && ComputerInput == 0) {
         System.out.println("You Win!");
      } else {
         System.out.println("Computer Win!");
      }

      System.out.println("\nComputer Choose: " + ComputerInput);

   }
}

// ================= GUI Way (Same Thing but some additional features
// )=======================

// public class RockPaperScissor {
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// System.out.println("\n ======= Let's play a Rock Paper Scissor =======\n");
// System.out.println(" ======= For Rock: 1 , Paper: 2 , Scissor: 3 =======\n");

// for (int i = 0; i >= 0; i++) {
// Random rand = new Random();
// int ComputerNumber = rand.nextInt(3);
// System.out.print("\nEnter Your guess: ");
// int userInput = sc.nextInt();

// if (userInput < 4 && userInput > 0) {

// if (userInput == ComputerNumber) {
// System.out.println("\n=============================");
// System.out.println("Draw");
// System.out.println("=============================\n");
// } else if (userInput == 0 && ComputerNumber == 2 ||
// userInput == 2 && ComputerNumber == 1 ||
// userInput == 1 && ComputerNumber == 0

// ) {

// System.out.println("\n=============================");
// System.out.println("Hurryyy You Win!");
// System.out.println("=============================\n");

// } else {
// System.out.println("\n=============================");
// System.out.println("Computer Win Don't upset just try again");
// System.out.println("=============================\n");
// }

// String game = "";

// switch (ComputerNumber) {
// case 0:
// game = "Rock";
// break;

// case 1:
// game = "Papper";
// break;

// case 2:
// game = "Scissor";
// break;
// default:
// break;
// }

// System.out.println("=============================");
// System.out.printf("Computer Choose: %d: %s ", ComputerNumber, game);
// System.out.println("\n=============================\n");

// System.out.print("Wanted To try again(y/n): ");
// char tryagain = sc.next().charAt(0);
// if (tryagain == 'n') {
// break;
// } else if (tryagain == 'N') {
// break;
// } else if (tryagain == 'y') {
// } else if (tryagain == 'Y') {
// } else {
// do {
// System.out.println(
// " \n *************** Please enter ***************\n *************** Y/y : For
// Yes *************** \n *************** N/n: For No *************** \n");

// System.out.print("Wanted To try again(y/n): ");
// tryagain = sc.next().charAt(0);

// if (tryagain == 'n') {
// break;
// } else if (tryagain == 'N') {
// break;
// } else if (tryagain == 'y') {
// } else if (tryagain == 'Y') {
// } else {
// System.out.println(
// " \n *************** Please enter ***************\n *************** Y/y : For
// Yes *************** \n *************** N/n: For No *************** \n");
// }
// } while (true);
// break;

// }

// } else {
// System.out.println(" \n *************** Wrong Input You Have To Choose 1 / 2
// / 3 *************** \n ");
// }

// }

// }
// }