import java.util.Arrays;
import java.util.Scanner;
public class arrayIntegerspt2 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);


        System.out.println("Please enter 5 integers.");
        int[] numsArray = new int[5];
        for(int j = 0; j < numsArray.length; j++){
            int input = scnr.nextInt();
            numsArray[j] = input;
            System.out.println("You entered " + input );


        }


        for(int j = 1; j< numsArray.length; j++ ){
            int key = numsArray[j];
            int i = j-1;

            while(i>=0 && numsArray[i] > key) {
                numsArray[i + 1] = numsArray[i];
                i = i - 1;
            }
            numsArray[i+1] = key;
        }
        System.out.println("The new sorted array is " + Arrays.toString(numsArray));
    }

}

