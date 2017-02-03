import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PrE13ExchangeableWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        String firstWord = input[0];
        String secWord = input[1];
        System.out.println(isExchangeable(firstWord,secWord));

    }

    private static boolean isExchangeable(String firstWord, String secWord) {
        char[] firstCharArr = firstWord.toCharArray();
        char[] secCharArr = secWord.toCharArray();

        HashMap<Character,Character> map = new HashMap<>();


        int minLength = Math.min(firstCharArr.length, secCharArr.length);
        int maxLength = Math.max(firstCharArr.length, secCharArr.length);
        for (int i = 0; i < minLength; i++) {
            char first = firstCharArr[i];
            char second = secCharArr[i];

            if(!map.containsKey(first)){
                map.put(first,second);
            }
            else{
                if(map.get(first) != second){
                    return false;
                }
            }
        }


        char[] biggerArray = lengthCheck(firstCharArr,secCharArr);
        for (int i = minLength; i < maxLength; i++) {
            char el = biggerArray[i];
            if(!map.containsKey(el)) {
                return false;
            }
        }
        return true;
    }

    private static char[] lengthCheck(char[] firstWord, char[] secWord) {
        if(firstWord.length > secWord.length){
            return firstWord;
        }
        return secWord;
    }
}
