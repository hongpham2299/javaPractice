package arrays;

public class PracticeOne {

    public void printNumbers(int i, int j) {
        if(i<=j){
            for (int k=i; k<=j; k++){
                System.out.println(k);
            }
        } else if (i>j) {
            for(int k=i; k>=j; k--){
                System.out.println(k);
            }
        }
    }
}
