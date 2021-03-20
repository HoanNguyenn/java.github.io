import java.util.Scanner;

public class Age {
    public void checkAge(int age){
        if (age < 0){
            throw new ArithmeticException("Nhap sai, tuoi phai lon hon khong");
        }
        else {
            System.out.println("Correct");
        }
    }
}
