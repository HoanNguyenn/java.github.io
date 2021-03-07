import java.util.Scanner;

public abstract class Phone {
    private String name;
    private long phoneNumber;

    public Phone(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Phone(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten dien thoai: ");
        name = scanner.nextLine();
        System.out.println("Nhap so dien thoai: ");
        phoneNumber = scanner.nextLong();
    }

    public String toString(){
        return "Ten: " + name + " So dien thoai " + phoneNumber;
    }
}
