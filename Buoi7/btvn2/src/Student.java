import java.util.Scanner;

public class Student extends Person{

    public long id;
    public float gpa;
    public String email;

    public Student(){
        
    }

    public Student(String name, String gender, String address, String dateofbirth, long id, float gpa, String email) {
        super(name, gender, address, dateofbirth);
        this.id = id;
        this.gpa = gpa;
        this.email = email;
    }

    public void input(){
        super.input();
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextLong();
        gpa = scanner.nextFloat();
        email = scanner.nextLine();
    }

    public String toString(){
        super.toString();
        return "Ma sinh vien: " + id + "; Diem trung binh: " + gpa + "; Email: " + email;
    }


    
}
