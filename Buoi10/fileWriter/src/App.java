import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File studentInfor = new File("D:\\BT Java\\file.txt");
        studentInfor.createNewFile();

        FileWriter fileWriter = new FileWriter("D:\\BT Java\\file.txt");
        fileWriter.write("Machen");
        fileWriter.write("Hausaufgaben");
        fileWriter.close();

        Scanner myReader = new Scanner(studentInfor);
        while(myReader.hasNextLine()){
            System.out.println(myReader.nextLine());
        }
    }
}
