import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map <String, Integer> number = new HashMap<>();
        
        number.put("one",1);
        number.put("second", 2);

        System.out.println(number);

        System.out.println(number.keySet());
        System.out.println(number.values());

        System.out.println("Entry: " + number.entrySet());

        Map<String, Integer> otherNumber = new HashMap<>(number);
        otherNumber.put("Three", 3);

        System.out.println(otherNumber);

        Map<String, Integer> number2 = new HashMap<>();
        number2.putAll(otherNumber);
        System.out.println(number2);

        System.out.println(number2.get("Three"));

        number2.replace("one", 1, 3);

        number2.replace("Three", 9);
        System.out.println(number2);

        // lambda
        number2.replaceAll((key,oldValue) -> oldValue+1);
        System.out.println(number2);
    }
}
