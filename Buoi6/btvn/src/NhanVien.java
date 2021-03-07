import java.util.Scanner;

public class NhanVien {
    private int id;
    private String name;
    private int age;
    private long telephoneNumber;
    private String email;
    private long basicSalary;

    public NhanVien() {
    }

    public NhanVien(int id, String name, int age, long telephoneNumber, String email, long basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    Scanner scanner = new Scanner(System.in);

    public void nhap() {
        System.out.print("Nhap ho va ten nhan vien: ");
        name = scanner.nextLine();
        System.out.print("Nhap ma nhan vien: ");
        id = scanner.nextInt();
        System.out.print("Nhap so dien thoai: ");
        telephoneNumber = scanner.nextInt();
        System.out.print("Nhap tuoi: ");
        age = scanner.nextInt();
        System.out.print("Nhap email: ");
        email = scanner.nextLine();
        email = scanner.nextLine();
        System.out.print("Nhap luong co ban: ");
        basicSalary = scanner.nextInt();
    }

    public void display() {
        System.out.println("Ma nhan vien: " + id + "; Ho va ten nhan vien: " + name + "; So dien thoai: " + telephoneNumber + "; Email: " + email + "; Tuoi: " + age + "; Luong co ban: " + basicSalary + "VND");
    }

}
