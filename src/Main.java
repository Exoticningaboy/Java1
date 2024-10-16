import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int number = 20;
        Scanner myscanner = new Scanner(System.in);
        System.out.println("guess the number");

        int hisNumber = myscanner.nextInt();
        myscanner.nextLine();

        while (hisNumber != number) {
            if (hisNumber == number) {
                System.out.println("you guessed the number" + number);
                break;
            }
            else{
                System.out.println("you guessed wrong try again");
                hisNumber = myscanner.nextInt();
                myscanner.nextLine()
            }
        }
    }

}