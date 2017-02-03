import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrE03FormattingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        int a = Integer.parseInt(input[0]);
        double b = Double.parseDouble(input[1]);
        double c = Double.parseDouble(input[2]);


        String aToHex = Integer.toHexString(a).toUpperCase();
        //String aToBinary = Integer.toBinaryString(a);
        String line = String.format("|%1$-10s|%2$010d|%3$10.2f|%4$-10.3f|",
                aToHex,
                Integer.parseInt(Integer.toBinaryString(a)),
                b,
                c);
        System.out.println(line);
    }
}
