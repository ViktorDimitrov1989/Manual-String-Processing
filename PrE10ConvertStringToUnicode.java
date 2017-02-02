import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrE10ConvertStringToUnicode {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string = reader.readLine();
        for (int i = 0; i < string.length(); i++) {
            System.out.print("\\u00" + Integer.toHexString(string.charAt(i)));
        }
    }
}
