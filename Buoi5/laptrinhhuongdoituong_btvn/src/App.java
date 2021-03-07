public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student();
        student1.studentID = 19500000;
        student1.name = "Diep";
        student1.theoreticalPoint = (float) 3.5;
        student1.practicePoint = (float) 3.6;

        student1.display();
        student1.mediumScore();

        Student student2 = new Student();
        student2.studentID = 19500010;
        student2.name = "Bich";
        student2.theoreticalPoint = (float) 3;
        student2.practicePoint = (float) 3.2;

        student2.display();
        student2.mediumScore();

        Student student3 = new Student();
        student3.studentID = 19500020;
        student3.name = "Anh";
        student3.theoreticalPoint = (float) 4;
        student3.practicePoint = (float) 3.7;

        student3.display();
        student3.mediumScore();

        Student student4 = new Student(19500030,"Minh",(float)3.5,(float)2.9);

        student4.display();
        student4.mediumScore();



    }
}
