import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Pr01StudentsResults {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, double[]> map = new TreeMap<>();
        try {
            int n = Integer.parseInt(reader.readLine());
            for (int i = 0; i < n; i++) {
                String input = reader.readLine();
                String name = input.split(" - ")[0];
                String[] stats = input.split(" - ")[1].split(", ");
                double jAdv = Double.parseDouble(stats[0]);
                double jOOP = Double.parseDouble(stats[1]);
                double advOOP = Double.parseDouble(stats[2]);
                double average = (jAdv + jOOP + advOOP) / 3;
                map.put(name, new double[4]);
                map.get(name)[0] = jAdv;
                map.get(name)[1] = jOOP;
                map.get(name)[2] = advOOP;
                map.get(name)[3] = average;
            }
            if(n != 0){
                String topRow = "Name      |   JAdv|JavaOOP| AdvOOP|Average|";
                System.out.println(topRow);
                for (Map.Entry<String, double[]> entry: map.entrySet()){
                    String name = entry.getKey();
                    double jAdv = entry.getValue()[0];
                    double jOOP = entry.getValue()[1];
                    double advOOP = entry.getValue()[2];
                    double average = entry.getValue()[3];
                    String result = String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|",name,jAdv,jOOP,advOOP,average).replace('.',',');
                    System.out.println(result);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
