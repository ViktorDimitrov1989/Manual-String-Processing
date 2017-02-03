import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrE15MerlahShake {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();
        String pattern = reader.readLine();

        while (true) {
            int lastOccurIndex = text.lastIndexOf(pattern);
            int firstOccurIndex = text.indexOf(pattern);
            if (firstOccurIndex != -1 && lastOccurIndex != -1) {
                String s1 = "";
                String s2 = "";
                String s3 = "";
                s1 = text.substring(0, firstOccurIndex);
                s2 = text.substring(firstOccurIndex + pattern.length(), lastOccurIndex);
                s3 = text.substring(lastOccurIndex + pattern.length(), text.length());

                text = s1 + s2 + s3;
                pattern = removeIndex(pattern);
                System.out.println("Shaked it.");
            }
            else{
                System.out.println("No shake.");
                System.out.println(text);
                break;
            }
            if(pattern.isEmpty()){
                System.out.println("No shake.");
                System.out.println(text);
                break;
            }
        }
    }

    private static String removeIndex(String pattern) {
        int indexToRemove = pattern.length() / 2;
        StringBuilder sb = new StringBuilder(pattern);
        sb = sb.deleteCharAt(indexToRemove);
        return sb.toString();
    }
}
