import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrE12CharacterMultiplier {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        String firstWord = input[0];
        String secWord = input[1];

        int sum = 0;
        int index = 0;

        int minLength = Math.min(firstWord.length(),secWord.length());
        int maxLength = Math.max(firstWord.length(),secWord.length());

        for (int i = 0; i < minLength; i++) {
            int num1 = firstWord.charAt(i);
            int num2 = secWord.charAt(i);
            sum += num1 * num2;
        }

        String longerWord = lengthCheck(firstWord,secWord);
        for (int i = minLength; i < maxLength; i++) {
            sum += longerWord.charAt(i);
        }
        System.out.println(sum);
    }

    private static String lengthCheck(String firstWord, String secWord) {
        if(firstWord.length() > secWord.length()){
            return firstWord;
        }
        return secWord;
    }
}
