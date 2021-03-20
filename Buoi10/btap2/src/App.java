import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Nhap so giao vien: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Teacher> listTeacher = new ArrayList<>();
        // <Teacher>???
        for (int i=0;i<n;i++){
            Teacher teacher = new Teacher();
            teacher.input();
            listTeacher.add(teacher);
        }

        for (Teacher teachers: listTeacher){
            // vong lap x 
            System.out.println(teachers);
        }

        for (int i =0; i<listTeacher.size();i++){
            if (listTeacher.get(i).getName().equals("hoan")){
                listTeacher.remove(i);
            }
        }

        for (Teacher teachers: listTeacher){
            System.out.println(teachers);
        }

    }
}
