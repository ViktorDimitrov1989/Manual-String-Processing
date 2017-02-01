import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Pr05SpecialWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] specialWords = reader.readLine().split(" ");
        String[] text = reader.readLine().split(" ");


        HashMap<String, Integer> res = new HashMap<>();
        for (String specWord : specialWords) {
            for (String s : text) {
                if(specWord.compareToIgnoreCase(s) == 0){
                    if(res.containsKey(specWord)){
                        res.put(specWord,res.get(specWord) + 1);
                    }
                    else{
                        res.put(specWord,1);
                    }
                }
            }
        }
        for (Map.Entry<String,Integer> entry : res.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
