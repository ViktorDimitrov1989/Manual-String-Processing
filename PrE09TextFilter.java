import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class PrE09TextFilter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> forbiddenWords = new ArrayList<>(Arrays.asList(reader.readLine().split(", ")));
        String text = reader.readLine();


        for (String forbiddenWord : forbiddenWords) {
            text = text.replaceAll(forbiddenWord, new String(new  char[forbiddenWord.length()]).replace("\0", "*"));
        }
        System.out.println(text);
    }
}
