import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.*;

public class PrE11Palindromes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> palindromes = new ArrayList<>();

        String[] text = reader.readLine().split("[ .,!?]");
        for (String word : text) {
            if(isPalindrome(word) && !word.equals("")){
                palindromes.add(word);
            }
        }
        Collator collator = Collator.getInstance();

        palindromes.sort(collator);
        System.out.println(palindromes);
    }



    private static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if(word.charAt(i) != word.charAt(word.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
