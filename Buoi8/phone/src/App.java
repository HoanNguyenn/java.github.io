import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dien thoai can dien: ");
        int n = scanner.nextInt();

        PhoneBook [] phone = new PhoneBook[n];

        for (int i=0;i<n;i++){
            phone[i]=new PhoneBook();
            phone[i].input();
        }
        System.out.println("Thong tin da nhap: ");
        for (int i=0;i<n;i++){
            System.out.println(phone[i].toString());
        }
    }
}
