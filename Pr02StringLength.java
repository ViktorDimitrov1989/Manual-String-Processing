import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr02StringLength {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        StringBuilder sb = new StringBuilder();
        if(input.length() <= 20){
            int n = 20 - input.length();
            String stars = new String(new char[n]).replace("\0", "*");
            sb.append(input);
            sb.append(stars);
            System.out.println(sb);
        }
        else{
            System.out.println(input.substring(0,21));
        }
    }
}
