import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       System.out.println("nhap n: ");
       int n = scanner.nextInt();
       
       try{
           if(n < 0) throw new Exception("Loi!!!");
       } 
       catch (Exception e) {
           System.out.println("nhap lai: ");
           n = scanner.nextInt();

       }

       Person [] student = new Person[n];

       for (int i=0;i<n;i++){
           student[i]= new Student();
           System.out.printf("Nhap tong tin sinh vien thu %d ", i+1);
           student[i].input();
       }

       for (int i=0;i<n;i++){
           System.out.printf("Thong tin cua sinh vien thu %d ", i);
           System.out.println(student[i].toString());
       }

       scanner.close();

    }

}
