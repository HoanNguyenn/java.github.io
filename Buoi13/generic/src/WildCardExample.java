import java.util.ArrayList;
import java.util.List;

public class WildCardExample {
    public static void main(String[] args){
        List<String> name = new ArrayList<String>();
        name.add("Jisoo");
        name.add("Lisa");
        name.add("Jennie");

        System.out.println("In ten: ");
        printElement(name);

        List<Integer> number = new ArrayList<Integer>();
        number.add(3);
        number.add(2);
        System.out.println("In so: ");
        printElement(number);
        
    }

    public static void printElement(List<?> list){
        for (Object e: list){
            System.out.println(e);
        }
    }
}
