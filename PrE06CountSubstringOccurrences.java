import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrE06CountSubstringOccurrences {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();
        String specialWord = reader.readLine();

        int counter = 0;

        for (int i = 0; i < text.length() - specialWord.length(); i++) {
            int start = i;
            int end = start + specialWord.length();

            String currentWord = text.substring(start,end);
            if(currentWord.compareToIgnoreCase(specialWord) == 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
