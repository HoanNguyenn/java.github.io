public class Student extends Person {

    public float cpa;

    public Student(String name, int age, String address, float cpa) {
        super(name, age, address);
        // super de lay thuoc tinh tu class cha
        this.cpa = cpa;
    }
    public void display1(){
        System.out.println("Diem: "+ cpa);
    }
    
}
