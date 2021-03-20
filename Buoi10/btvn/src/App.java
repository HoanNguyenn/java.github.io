import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("So nhan vien can nhap thong tin: ");
        int n = scanner.nextInt();

        ArrayList<Employee> listEmployee = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Employee employee2 = new Employee();
            System.out.printf("Nhap thong tin nhan vien thu %d", i + 1);
            employee2.input();
            listEmployee.add(employee2);
        }
        System.out.println("Mang vua nhap la: ");
        for (Employee employee : listEmployee) {
            System.out.print(employee + "\n");
        }
        ;

        File file = new File("D:\\BT Java\\Buoi10\\btvn\\btvn.txt");
        file.createNewFile();
        FileWriter myWriter = new FileWriter("D:\\BT Java\\Buoi10\\btvn\\btvn.txt");
        for (Employee employee : listEmployee) {
            myWriter.write(employee + "\n");
        }
        myWriter.close();

        System.out.println("--------------***--------------");
        System.out.print("Vi tri can chen thong tin nhan vien vao: ");
        int positon = scanner.nextInt();
        Employee employee3 = new Employee();
        employee3.input();
        listEmployee.add(positon, employee3);
        System.out.println("Mang sau khi chen them la: ");
        for (Employee employee : listEmployee) {
            System.out.print(employee + "\n");
        }
        ;

        System.out.println("--------------***--------------");
        deleteById(listEmployee);
        deleteByName(listEmployee);
        System.out.println("Mang sau khi chinh sua: ");
        for (Employee employee : listEmployee) {
            System.out.print(employee + "\n");
        }
        ;

        System.out.println("--------------***--------------");
        changeById(listEmployee);
        System.out.println("Mang sau khi chinh sua: ");
        for (Employee employee : listEmployee) {
            System.out.print(employee + "\n");
        }
        ;
        scanner.close();
    }

    public static void deleteByName(ArrayList<Employee> listEmployee) {
        System.out.println("Nhap ten nhan vien can xoa: ");
        Scanner scanner = new Scanner(System.in);
        String nameDelete = scanner.nextLine();
        for (int i = 0; i < listEmployee.size(); i++) {
            if (listEmployee.get(i).getName().equals(nameDelete)) {
                listEmployee.remove(i);
            }
        }
    }

    public static void deleteById(ArrayList<Employee> listEmployee) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien can xoa: ");
        long idDelete = scanner.nextLong();
        for (int i = 0; i < listEmployee.size(); i++) {
            if (listEmployee.get(i).getId() == idDelete) {
                listEmployee.remove(i);
            }
        }
    }

    public static void changeById(ArrayList<Employee> listEmployee) {
        System.out.println("Nhap ma nhan vien can sua: ");
        Scanner scanner = new Scanner(System.in);
        Long idChange = scanner.nextLong();
        System.out.println("Nhap ten nhan vien can sua: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhap ten sau khi sua: ");
        String nameChanged = scanner.nextLine();
        for (int i = 0; i < listEmployee.size(); i++) {
            if (listEmployee.get(i).getId() == idChange ) {
                listEmployee.get(i).setName(nameChanged);
            }
        }
    }

}
