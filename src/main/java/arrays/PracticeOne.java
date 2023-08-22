package arrays;

public class PracticeOne {

    public void printNumbers(int i, int j) {
        if (i!= 1 && j!= 100) {
            for (int k = i; k <= j; k++) {
                System.out.println(k);
            }
        } else {
            printDefaultNumber();
        }
    }

    private void printDefaultNumber(){
        for(int i=1; i<=100; i++){
            System.out.println(i);
        }
    }
}
