
import java.util.Collections;
import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {
        Vector <String> vector = new Vector<String>();
        vector.add("B");
        vector.add("L");
        vector.add("A");
        vector.add("C");
        vector.add("K");

        System.out.println(vector);
        Collections.sort(vector);
        System.out.println(vector);

        int index = Collections.binarySearch(vector, "B");
        // tim vi tri cua phan B trong list vector
        System.out.println(index);
        
        Collections.swap(vector, 1, 2);
        System.out.println(vector);

    }
}