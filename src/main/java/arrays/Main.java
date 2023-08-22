package arrays;

public class Main {

    public static void main(String[] args) {

        /*
        Write a program that prints 1 to 100 by default
        and prints i to j where i and j are integers
         */

        PracticeOne practiceOne = new PracticeOne();

        if (args.length == 2) {
            try {
                int i = Integer.parseInt(args[0]);
                int j = Integer.parseInt(args[1]);
                practiceOne.printNumbers(i, j);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide two integer numbers");
            }
        } else {
            practiceOne.printNumbers(1, 100);
        }
    }
}
