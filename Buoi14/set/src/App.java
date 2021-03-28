import java.util.HashSet;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        HashSet <Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(2);

        System.out.println("Danh sach: ");
        System.out.println(hashSet);

        TreeSet <Integer> treeSet = new TreeSet<>();
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(8);
        treeSet.add(2);

        System.out.println("Danh sach: ");
        // da sap xep theo thu tu tang dan
        System.out.println(treeSet);

        hashSet.remove(2);
        System.out.println(hashSet.size());

    }
}
