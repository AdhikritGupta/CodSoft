package hello;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;
import org.apache.commons.io.IOUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class HelloWorld {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String url_str = "https://v6.exchangerate-api.com/v6/b539e7dbe4d9d74db3d913d9/latest/USD";
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        String result = IOUtils.toString((InputStream) request.getContent(), StandardCharsets.UTF_8);
        
        JsonElement root = JsonParser.parseString(result);
        JsonObject jsonobj = root.getAsJsonObject();
        JsonObject jsonObject = jsonobj.get("conversion_rates").getAsJsonObject();
        
        System.out.println("****Welcome to Currency Convertor****\n");
        System.out.println("Latest Update: "+ jsonobj.get("time_last_update_utc").getAsString());
        System.out.println("Next Update: "+ jsonobj.get("time_next_update_utc").getAsString());
        System.out.println("\nAvailable Currencies are: ");
        
        Set<Map.Entry<String, JsonElement>> entries = jsonObject.entrySet();//will return members of your object
        for (Map.Entry<String, JsonElement> entry: entries) {
            System.out.print(entry.getKey()+" ");
        }
        System.out.println("\n");
        while (true) {
            System.out.print("\nEnter amount in USD(Enter 0 to exit): $ ");
            double amount = Double.parseDouble(sc.nextLine());
            if(amount==0.0){
                break;
            }
            System.out.println("Enter currency to convert to: ");
            String currency = sc.nextLine();
            double rate = Double.parseDouble(jsonObject.get(currency).getAsString());
            System.out.println("Current conversion rate USD - "+currency+": "+rate);
            System.out.println("Value after conversion: "+currency+": "+amount*rate);

        }
        System.out.println("Thank You!");
        sc.close();
    }
}
