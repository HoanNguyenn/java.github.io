import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList <String> array = new LinkedList<String>();
        array.add("BMV");
        array.add("Ford");
         // Get the iterator
        Iterator <String> itr = array.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // TreeSet khong nhan cac gia tri trung
        TreeSet <String> array1 = new TreeSet<String>();
        array1.add("BMV");
        array1.add("Ford");
        array1.add("BMV");
        Iterator <String> itr1 = array.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

    }
}
