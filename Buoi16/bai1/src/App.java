import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>();
        String check = "y";
        while (!check.equals("q")&&!check.equals("Q")) {
            System.out.println("Enter a number or q, Q to quit");
            check = scanner.next();
            if (!check.equals("q")&&!check.equals("Q")) {
                int number = Integer.parseInt(check);
                num.add((number));
            }
        }
        
        TreeSet <Integer> list = new TreeSet<>();
            list.addAll(num);
            System.out.println(list);
}
}