import java.util.Scanner;

public class Employee{
    private long id;
    private String name;
    private String position;
    private String address;
    private long salary;
    
    public Employee(long id, String name, String position, String address, long salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.address = address;
        this.salary = salary;
    }

    public Employee() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhap ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap ma nhan vien: ");
        id = scanner.nextLong(); 
        System.out.println("Nhap dia chi: ");
        address = scanner.nextLine();
        address = scanner.nextLine();
        System.out.println("Nhap chuc vu: ");
        position = scanner.nextLine();
        System.out.println("Nhap luong: ");
        salary = scanner.nextLong();
    }

    @Override
    public String toString() {
        return "Ma nhan vien: " + id + " Ten: " + name + " Dia chi: " + address + " Chuc vu: " + position + " Luong: " + salary;
    }


}