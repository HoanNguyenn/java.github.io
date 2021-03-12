import java.util.Scanner;

public class Student extends Person{

    private int id;
    private float gpa;
    private String email;

    public Student(){   
    }

    public Student(String name, String gender, String address, String dateofbirth, int id, float gpa, String email) {
        super(name, gender, address, dateofbirth);
        this.id = id;
        this.gpa = gpa;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    Scanner scanner = new Scanner(System.in);

    public void input(){
        super.input();
        
        System.out.println("Nhap ma sinh vien: ");
        this.id = scanner.nextInt();
        System.out.println("Nhap diem trung binh: ");
        this.gpa = scanner.nextFloat(); 
        scanner.nextLine();
        System.out.println("Nhap email: ");
        this.email = scanner.nextLine();
    }
    public String toString(){
        super.toString();
        return "Ma sinh vien: " + this.id + "; Diem trung binh: " + this.gpa + "; Email: " + this.email;
    }
}
