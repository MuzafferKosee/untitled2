import java.util.Scanner;
public class odev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int usersChoice;
        int computersScore = 0;
        int usersScore = 0;
        while (computersScore < 5 && usersScore < 5) {
            int computersChoice = (int) (Math.random() * 3 + 1);
            System.out.println("Please choose a number.");
            System.out.println(" 1 : Rock ");
            System.out.println(" 2 : Paper");
            System.out.println(" 3 : Scissor");
            usersChoice = scan.nextInt();
            System.out.println("Computer's choice = " + computersChoice);
            System.out.println("Your choice = " + usersChoice);
            if(usersChoice < 4 && usersChoice > 0) {
                if (computersChoice == 3 && usersChoice == 2) {
                    System.out.println("You lost.");
                    computersScore++;
                    System.out.println("----------------------");
                } else if (computersChoice == 2 && usersChoice == 1) {
                    System.out.println("You lost.");
                    computersScore++;
                    System.out.println("----------------------");
                } else if (computersChoice == 1 && usersChoice == 3) {
                    System.out.println("You lost.");
                    computersScore++;
                    System.out.println("----------------------");
                } else if (computersChoice == usersChoice) {
                    System.out.println("Deuce.");
                    System.out.println("----------------------");
                } else {
                    System.out.println("You won.");
                    usersScore++;
                    System.out.println("----------------------");
                }
            }else{
                System.out.println("Invalid number.");
                System.out.println("----------------------");
            }
        }
        if (computersScore == 5) {
            System.out.println("You lost the game.");
        } else if (usersScore == 5) {
            System.out.println("You won the game.");
        }
    }
}






