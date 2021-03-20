import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> listStudent = new ArrayList<Student>();

        for (int i=0; i<3;i++){
            Student student = new Student();
            student.input();
            listStudent.add(student);
        }
        for(Student student: listStudent){
            System.out.println(student);
        }

        File studentFile = new File("D:\\BT Java\\filename.txt");
        studentFile.createNewFile();

        FileWriter fileWriter = new FileWriter(studentFile);
        fileWriter.write(listStudent.toString());
        fileWriter.close();


    }
}
