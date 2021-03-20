import java.util.Scanner;

public class Teacher{
    private String name;
    private int age;
    private String address;
    private String subject;

    public Teacher() {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        age = scanner.nextInt();
        System.out.println("Nhap dia chi: ");
        address = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhap mon giang day: ");
        subject = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Ten:" + name + " Tuoi: " + age + " Dia chi: " + address + "Mon giang day: " + subject;
    }
}