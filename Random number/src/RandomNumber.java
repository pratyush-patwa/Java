import java.util.Scanner;

public class RandomNumber {

    public static void main(String args[]){
        int randomNumber = (int)(Math.random()*100)+1;

        System.out.println( "You have total ten chances to guess the random number between 1 to 100");
        System.out.println("Enter your guess");

        Scanner scanner = new Scanner(System.in);
        for(int i=10; i>=0; i--) {
            System.out.println("You have " + i + " chances left");
            int guess = scanner.nextInt();

            if (randomNumber > guess) {
                System.out.println("The number is greater than your guess");
            }
            if (randomNumber < guess) {
                System.out.println("The number is smaller than your guess");
            }
            if (randomNumber == guess) {
                System.out.println("You Won!");
                break;
            }
            if (i == 0) {
                System.out.println("You Lost!");
            }
        }

    }
}
