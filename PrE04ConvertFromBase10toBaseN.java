import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrE04ConvertFromBase10toBaseN {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        String num = convert(Long.parseLong(input[1]), Integer.parseInt(input[0]));
        System.out.println(num);
    }

    public static String convert(Long number, int base)
    {
        Long quotient = number / base;
        Long remainder = number % base;

        if (quotient == 0) // base case
        {
            return Long.toString(remainder);
        }
        else
        {
            return convert(quotient, base) + Long.toString(remainder);
        }
    }
}
