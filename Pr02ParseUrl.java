import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Pr02ParseUrl {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String str = "https://www.google.bg/search?q=google&oq=goo&aqs=chrome.0.0j69i60l2://j0j69i57j69i65.2112j0j7&sourceid=chrome&ie=UTF-8";
        String[] input = reader.readLine().split("://");
        String protocol = input[0];
        if (input.length != 2) {
            System.out.println("Invalid URL");
        }
        else{
            int serverEndIndex = input[1].indexOf("/") - 1;
            String server = input[1].substring(0, serverEndIndex + 1);
            String resources = input[1].substring(serverEndIndex + 2);
            System.out.printf("Protocol = %s%nServer = %s%nResources = %s%n", protocol, server, resources);
        }
    }
}
