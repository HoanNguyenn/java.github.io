import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Lisa", 327, "Korea"));
        list.add(new Student("Jisoo", 301, "Korea"));
        list.add(new Student("Rose", 311, "Korea"));
        list.add(new Student("Jennie", 209, "Korea"));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.rotate(list, 2);
        System.out.println(list);

        System.out.println("Phan tu co gia tri lon nhat: " + Collections.max(list));
        System.out.println("Phan tu co gia tri be nhat: " + Collections.min(list));
    
    }

}
