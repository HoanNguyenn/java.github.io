import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File myFile = new File("D:\\BT Java\\filename.txt");
        myFile.createNewFile();

        // FileWriter fileWrite = new FileWriter("D:\\BT Java\\filename.txt");
        // fileWrite.write("Go");
        // fileWrite.write("to");
        // // ghi them vao file
        // fileWrite.append("China");
        // fileWrite.close();

        Scanner myReader = new Scanner(myFile);
        // in ra ca thong tin nhap thang vao file (bo phan fileWrite)
        while(myReader.hasNextLine()){
        System.out.println(myReader.nextLine());
        }
    }
}
