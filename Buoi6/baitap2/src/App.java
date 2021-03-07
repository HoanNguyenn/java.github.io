import java.util.Scanner;

public class App {
    // khoi static chay truoc main
    static {
        System.out.println("Goi khoi static");
    }
    public static void main(String[] args) throws Exception {
        // dung scanner de nhap du lieu trong lap trinh huong doi tuong
        // int age;
        // String name;
        // String address;

        Student student = new Student("Lisa", 23, "Seoul", 4);
        student.display();
        student.display1();

        // // nap chong phuong thuc 
        // Person person = new Person();
        // person.sum(5,5);
        // person.sum(4, 5, 6);

        // person.change();

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Nhap ten: ");
        // name = scanner.next();
        // System.out.println("Nhap tuoi:");
        // age = scanner.nextInt();
        // System.out.println("Nhap dia chi: ");
        // address = scanner.next();
        
        // person.setName(name);
        // person.setAge(age);
        // person.setAddress(address);

        // System.out.println("Ten: "+ person.getName());
        // System.out.println("Tuoi: "+ person.getAge());
        // System.out.println("Dia chi: "+person.getAddress());
        // System.out.println("Truong hoc:"+ person.college);


    }
}
