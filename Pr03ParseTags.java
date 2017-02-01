import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr03ParseTags {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();
        String startTag = "<upcase>";
        String endTag = "</upcase>";
        int start = text.indexOf(startTag);
        int end = text.indexOf(endTag);
        while (start != -1){
            String toReplace = text.substring(start + startTag.length(), end);
            text = text.replace(toReplace, toReplace.toUpperCase());

            text = text.replaceFirst(startTag, "");
            text = text.replaceFirst(endTag, "");

            start = text.indexOf(startTag);
            end = text.indexOf(endTag);
        }
        System.out.println(text);
    }
}
