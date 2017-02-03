import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrE05ConvertFromBaseNto10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        System.out.println(BigInteger.valueOf(Long.valueOf(input[1], Integer.parseInt(input[0]))));

    }
}
