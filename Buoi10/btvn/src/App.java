import java.awt.List;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.AuthenticationException;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("So nhan vien can nhap thong tin: ");
        
        try {
            int n = scanner.nextInt();
        } catch (Exception e) {
            
        }
    
        ArrayList<Employee> listEmployee = new ArrayList<>();

        for (int i = 0; i < listEmployee.size(); i++) {
            Employee employee2 = new Employee();
            System.out.printf("Nhap thong tin nhan vien thu %d", i + 1);
            employee2.input();
            listEmployee.add(employee2);
        }

        for (int i = 0; i < listEmployee.size(); i++) {
            System.out.println(listEmployee);
        }

        File file = new File("D:\\BT Java\\Buoi10\\btvn\\btvn.txt");
        file.createNewFile();
        FileWriter myWriter = new FileWriter("D:\\BT Java\\Buoi10\\btvn\\btvn.txt");
        for (Employee employee: listEmployee){
            myWriter.write(employee+"\n");
        }
        myWriter.close();

        System.out.println("Vi tri can chen thong tin nhan vien vao: ");
        int positon = scanner.nextInt();
        Employee employee3 = new Employee();
        employee3.input();
        listEmployee.add(positon, employee3);
        System.out.println(listEmployee);

        System.out.println("Nhap ten nhan vien can xoa: ");
        String nameDelete = scanner.nextLine();
        System.out.println("Nhap id nhan vien can xoa: ");
        long idDelete = scanner.nextLong();
        for (int i = 0; i < listEmployee.size(); i++) {
            if (listEmployee.get(i).getName().equals(nameDelete)) {
                listEmployee.remove(i);
            } else if (listEmployee.get(i).getId() == idDelete) {
                listEmployee.remove(i);
            }
        }
        System.out.println("Mang sau khi chinh sua: ");
        System.out.println(listEmployee);

        System.out.println("Nhap ten nhan vien can sua: ");
        String nameChange = scanner.nextLine();
        System.out.println("Nhap id cua nhan vien can sua: ");
        long idChange = scanner.nextInt();
        System.out.println("Nhap ten can sau: ");
        String nameChanged  = scanner.nextLine();
        for (int i = 0; i < listEmployee.size(); i++) {
        if (listEmployee.get(i).getName().equals(nameChange) && listEmployee.get(i).getId() == idChange){
            listEmployee.get(i).setName(nameChanged);
        }

        System.out.println("Mang sau khi chinh sua: ");
        System.out.println(listEmployee);
    }
    }

    public static int employeeNumber() throws Exception {

        System.out.println("So nhan vien can nhap thong tin: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0)
            throw new Exception("So luong nhan vien phai lon hon 0");
        return n;
    }
}
