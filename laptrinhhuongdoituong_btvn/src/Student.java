public class Student {
    public int studentID;
    public String name;
    public float theoreticalPoint;
    public float practicePoint;

    public Student(){};

    public Student(int studentID, String name, float theoreticalPoint, float practicePoint){
        this.studentID = studentID;
        this.name = name;
        this.theoreticalPoint = theoreticalPoint;
        this.practicePoint = practicePoint;
    }

    public void mediumScore(){
        float diemTrungbinh = (theoreticalPoint + practicePoint) / 2;
        System.out.println("Diem trung binh: " + diemTrungbinh);
    }

    public void display(){
        System.out.println("Ma sinh vien: "+ studentID);
        System.out.println("Ten: " + name);
        System.out.println("Diem li thuyet: "+ theoreticalPoint);
        System.out.println("Diem thuc hanh: " + practicePoint);
    }

}

