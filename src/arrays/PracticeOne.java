package arrays;

public class PracticeOne {

    public static void main(String[] args) {

        /*
        Write a program that prints 1 to 100 by default
        and prints i to j where i and j are integers
         */
        PracticeOne practiceOne = new PracticeOne();
        practiceOne.printNumbers(3, 110);

    }

    private void printDefaultNumber(){
        for(int i=1; i<=100; i++){
            System.out.println(i);
        }
    }

    public void printNumbers(int i, int j) {
        if (i!= 1 && j!= 100) {
            for (int k = i; k <= j; k++) {
                System.out.println(k);
            }
        } else {
            printDefaultNumber();
        }
    }
}
