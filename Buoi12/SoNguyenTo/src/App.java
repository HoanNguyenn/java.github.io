import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //int n;
        System.out.println("Nhap so n: ");
        String str = scanner.nextLine();
        if(str.equals("X")||str.equals("Q")){
            System.exit(0);
        }

        File file = new File("D:\\BT Java\\Buoi12\\SoNguyenTo.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter("D:\\BT Java\\Buoi12\\SoNguyenTo.txt");

        try {
            int n = Integer.parseInt(str);
            if(kiemTraSoNguyenTo(n)){
                System.out.println( n+ "la so nguyen to");
            }
            else {
                System.out.println(n + " khong phai la so nguyen to");
                fileWriter.write(n + " khong phai la so nguyen to");
            }
        } catch (Exception e) {
            System.out.println( str + " khong phai so");
            fileWriter.write( str + " khong phai so");
        }
        fileWriter.close();        
        
    }

    public static boolean kiemTraSoNguyenTo(int n){
        if (n<2)
        return false;
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i ==0)
            return false;
        }
        return true;

    }

}
