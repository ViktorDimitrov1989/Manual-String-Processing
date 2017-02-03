import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class PrE07SumBigNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num1 = reader.readLine();
        String num2 = reader.readLine();
        ArrayDeque<Long> result = new ArrayDeque<>();
        int zeroesLength = Math.max(num1.length(), num2.length()) - Math.min(num1.length(), num2.length());
        String zeroes = new String(new  char[zeroesLength]).replace("\0", "0");
        if(num1.length() < num2.length()){
            num1 = zeroes + num1;
        }
        if(num2.length() < num1.length()){
            num2 = zeroes + num2;
        }

        Long rem = 0l;
        while (num1.length() != 0){
            Long a = Long.parseLong(String.valueOf(num1.charAt(num1.length() - 1)));
            Long b = Long.parseLong(String.valueOf(num2.charAt(num2.length() - 1)));
            num1 = num1.substring(0,num1.length() - 1);
            num2 = num2.substring(0,num2.length() - 1);
            Long sum = a + b;
            sum += rem;
            if(sum >= 10){
                rem = sum / 10;
                sum %= 10;
            }
            else{
                rem = 0l;
            }
            result.addFirst(sum);
            if(num1.length() == 0 && rem != 0){
                result.addFirst(rem);
            }
        }
        while (!result.isEmpty()){
            System.out.print(result.removeFirst());
        }
    }
}
