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
    name = scanner.nextLine();
    gender = scanner.nextLine();
    address = scanner.nextLine();
    dateOfBirth = scanner.nextLine();

    scanner.close();
    }

    public String toString(){
        return "Ho va ten: " + name + "; Gioi tinh: " + gender + "; Dia chi: " + address + "; Ngay sinh: " + dateOfBirth;
    }

}
