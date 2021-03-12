import java.util.Scanner;

public class Person {
    public String name;
    public String gender;
    public String address;
    public String dateOfBirth;

    public Person(){
        
    }

    public Person(String name, String gender, String address, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public void input(){
              
    Scanner scanner = new Scanner(System.in);  
    System.out.println("\nNhap ten: ");
    name = scanner.nextLine();
    System.out.println("Nhap gioi tinh: ");
    gender = scanner.nextLine();
    System.out.println("Nhap dia chi: ");
    address = scanner.nextLine();
    System.out.println("Nhap ngay sinh: ");
    dateOfBirth = scanner.nextLine();

    }

    public String toString(){
        return "Ho va ten: " + name + "; Gioi tinh: " + gender + "; Dia chi: " + address + "; Ngay sinh: " + dateOfBirth;
    }

}
