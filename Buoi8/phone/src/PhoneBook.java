import java.util.Scanner;

public class PhoneBook extends Phone {

    private long id;

    public PhoneBook(String name, long phoneNumber, long id) {
        super(name, phoneNumber);
        this.id = id;
    }

    public PhoneBook() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap id: ");
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextLong();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Id " + id;
    }
    
}
