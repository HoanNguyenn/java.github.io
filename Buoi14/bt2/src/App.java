import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Nguyen ", "Ha"));
        list.add(new Employee("Hoang ", "Linh"));
        list.add(new Employee("Chu ", "Minh"));
        list.add(new Employee("Luu ", "Truong"));

        System.out.println("Danh sach sap xep the ho: ");
        Collections.sort(list, new Comparator<Employee>(){
           public int compare(Employee o1, Employee o2){
               return o1.getHo().compareTo(o2.getHo());
           } 
        });

        for(Employee ep: list){
        System.out.println(ep);}

        System.out.println("Danh sach sap xep theo ten: ");
        Collections.sort(list, new Comparator<Employee>(){
            public int compare(Employee o1, Employee o2){
                return o1.getTen().compareTo(o2.getTen());
            }
            
        });

        for(Employee ep: list){
            System.out.println(ep);}

            Deque<Employee> list1 = new ArrayDeque()<>();
            list1.add(new Employee("Nguyen ", "Ha"));
            list1.add(new Employee("Hoang ", "Linh"));
            list1.add(new Employee("Chu ", "Minh"));
            list1.add(new Employee("Luu ", "Truong"));
            System.out.println(list1);

            list1.offer(new Employee("Tran", "Due"));
            list1.push(new Employee());
    
    }
}
