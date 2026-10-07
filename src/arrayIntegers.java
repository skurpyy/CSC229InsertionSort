import java.util.Arrays;
public class arrayIntegers {

    public static void main(String[] args) {

        int[] numsArray = {129,54,10,29,100,20,5};

        System.out.println("The original array is " + Arrays.toString(numsArray));

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

