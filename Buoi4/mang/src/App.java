import java.util.Scanner;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int soDu, tong =0;
        System.out.println("Nhap vao so nguyen duong n: ");
        int n = scanner.nextInt();
        while (n>0){
        soDu = n%10;
        n = n/10;
        tong += soDu;
        }
        System.out.println("Tong cua cac so nguyen vua nhap: "+tong);

        System.out.println("Nhap mot chuoi bat ki: ");
        String str= scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str,"_");
        System.out.println("So phan tu trong chuoi: " +
        stringTokenizer.countTokens());

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        
        
    }
}
