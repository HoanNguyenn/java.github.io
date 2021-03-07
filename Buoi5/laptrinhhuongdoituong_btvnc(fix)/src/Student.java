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
    

        public float generalPointAverage(){
            return (theoreticalPoint+practicePoint)/2;
        };
    
        public void display(){
            System.out.printf("%3d\t %-15s %8.2f %18.2f %19.2f \n", studentID, name, theoreticalPoint,practicePoint,generalPointAverage());
        }   
    }
    
    
