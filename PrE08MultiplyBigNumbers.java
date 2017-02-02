import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class PrE08MultiplyBigNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        String div = reader.readLine();
        String result = multiplySmall(num,div);
        System.out.println(result);
    }

    /*----Method to multiply a single digit to large digits----- */
    public static String multiplySmall(String large, String small) {
        int smallInt = Integer.parseInt(small);
        //String to int conversion
        String[] s = large.split("");
        String[] largeStringArray = new String[s.length - 1];
        //Initiate a String array
        //as discussed earlier split function makes
        //an array which has first element “” empty
        //so in order to remove that element
        //we have to make another array,here it is
        //largeStringArray
        for (int i = 0; i < largeStringArray.length; i++) {
            largeStringArray[i] = s[i + 1];
        }

        int[] largeInt = new int[largeStringArray.length];
        //make a integer array for num1 which is considered large
        for (int i = 0; i < largeStringArray.length; i++) {
            largeInt[i] = Integer.parseInt(largeStringArray[i]);
            //String to int conversion of every element
        }
        //Logic for carry
        int carry = 0;
        String[] resultCarry = new String[2];
        //carry number represented by 2 element String array
        String result = "";// result to be stored in string form
        int resultInt = 0;//carry in form of integer
        //int count = 0;
        for (int i = largeStringArray.length - 1; i >= 0; i--) {
            resultInt = largeInt[i] * smallInt + carry;
            //multiplying every element of the largeInt
            //  with single digit integer
            carry = 0;//after every multiplication carry to be made zero
            if (i == 0) { // if no carry
                resultInt = resultInt;   // no change
            } else { // If carry then
                if (resultInt / 10 > 0) {
                    //if output on multiplying is of 2 digits
                    String s2 = Integer.toString(resultInt);
                    //convert int to String
                    String[] s3 = s2.split("");
                    // Split the Result on basis of every digit
                    carry = Integer.parseInt(s3[1]);
                    //make the first digit stored on index 1, carry
                    resultInt = resultInt % 10;
                    //keep the unit place digit of the carry
                    //result which is concated later
                }
            }
            result = Integer.toString(resultInt).concat(result);
            //convert unit place of result to String and concat
            //   it with previous results
        }
        return result;
        //return result, which is multiplication of single
        // digit number of num2 to the whole num1
    }
}
