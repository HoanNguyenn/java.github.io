import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Teacher> list = new ArrayList<>();
        list.add(new Teacher(1, "Chan", 23 , "Ha Noi"));
        list.add(new Teacher(2, "Li", 25 , "Hai Phong"));
        list.add(new Teacher(3, "Cel", 29 , "Ho Chi Minh"));
        list.add(new Teacher(4, "Liu", 30 , "Hue"));

        System.out.println("Danh sach sau khi sap xep: ");
        Collections.sort(list, new Comparator<Teacher>(){
           public int compare(Teacher o1, Teacher o2){
               return o1.getName().compareTo(o2.getName());
           } 
        });

        for(Teacher teacher: list){
        System.out.println(teacher);}

        System.out.println("Danh sach sau khi sap xep: ");
        Collections.sort(list, new Comparator<Teacher>(){
           public int compare(Teacher o1, Teacher o2){
               return o1.getAddress().compareTo(o2.getAddress());
           } 
        });

        for(Teacher teacher: list){
            System.out.println(teacher);}
    
            System.out.println("Danh sach sau khi sap xep: ");
            Collections.sort(list, new Comparator<Teacher>(){
               public int compare(Teacher o1, Teacher o2){
                   return o1.getAge() >o2.getAge() ? 1 : -1;
               } 
            });
            // toan tu 3 ngoi 
            // tra ve 1 thi doi cho, -1 thi khong 
    
            for(Teacher teacher: list){
                System.out.println(teacher);}
        
    }

}
