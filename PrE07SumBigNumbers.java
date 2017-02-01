import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class PrE07SumBigNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num1 = reader.readLine();
        String num2 = reader.readLine();
        ArrayDeque<Integer> result = new ArrayDeque<>();
        int rem = 0;
        while (true){
            int a = Integer.parseInt(String.valueOf(num1.charAt(num1.length() - 1)));
            int b = Integer.parseInt(String.valueOf(num2.charAt(num1.length() - 1)));
            if(num1.length() == 0){

            }
            num1 = num1.substring(0,num1.length() - 1);
            num2 = num2.substring(0,num2.length() - 1);

            int sum = a + b;
            sum += rem;
            if(sum >= 10){
                rem = 1;
                sum -= 10;
            }
            result.offer(sum);
        }

    }
}
