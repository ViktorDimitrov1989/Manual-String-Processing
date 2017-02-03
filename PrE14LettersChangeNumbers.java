import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrE14LettersChangeNumbers {
    public static Long num;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String bigAlphabet = " ABCDEFGHIGKLMNOPQRSTUVWXYZ";

        String smallAlphabet = " abcdefghigklmnopqrstuvwxyz";

        String[] inputArr = reader.readLine().split("\\s+");
        int index;
        double current = 0;
        for (int i = 0; i < inputArr.length; i++) {
            String input = inputArr[i];
            num = Long.parseLong(input.substring(1, input.length() - 1));
            String firstLetter = input.substring(0, 1);
            String lastLetter = input.substring(input.length() - 1);

            if (firstLetter.equals(firstLetter.toUpperCase())) {
                index = bigAlphabet.indexOf(firstLetter);
                num /= index;
            }
            if (firstLetter.equals(firstLetter.toLowerCase())) {
                index = smallAlphabet.indexOf(firstLetter);
                num *= index;
            }
            if (lastLetter.equals(lastLetter.toUpperCase())) {
                index = bigAlphabet.indexOf(lastLetter);
                num -= index;
            }
            if (lastLetter.equals(lastLetter.toLowerCase())) {
                index = smallAlphabet.indexOf(lastLetter);
                num += index;
            }
            current += num;
        }
        System.out.printf("%.2f", current);
    }
}
