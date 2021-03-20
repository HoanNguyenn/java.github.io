import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // age.checkAge(13);

        try {
            int n = nhapAge();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // try {
        //     File file = new File("D:\\BT Java\\Buoi11\\file.txt");
        //     Scanner myReader = new Scanner(file);
        //     while (myReader.hasNextLine()) {
        //         System.out.println(myReader.nextLine());
        //     }
        //     myReader.close();
        // } catch (FileNotFoundException e) {
        //     System.out.println("Duong dan sai");
        //     e.printStackTrace();
        // }

        try {
            FileWriter fileWriter = new FileWriter("D:\\BT Java\\Buoi11\\age\\file.txt");
            fileWriter.write("Go");
            fileWriter.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Duong dan sai");
            e.printStackTrace();
        }

    }

    public static int nhapAge() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0)
            throw new Exception("Tuoi phai lon hon 0");
        return n;
    }

}
