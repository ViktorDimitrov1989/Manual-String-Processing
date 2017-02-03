import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrE04ConvertFromBase10toBaseN {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        System.out.println(Long.toString(Long.parseLong(input[1]), Integer.parseInt(input[0])));
    }

    public static BigInteger convert(Long number, Long base)
    {
        Long quotient = number / base;
        Long remainder = number % base;

        if (quotient.equals(0)) // base case
        {
            return BigInteger.valueOf(remainder);
        }
        else
        {
            return convert(quotient, base).add(BigInteger.valueOf(remainder));
        }
    }
}
