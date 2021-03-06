public class Person {

    // khai bao thuoc tinh
    private String name;
    private int age;
	private String address;

    // tao contructor (contructor la dang phuong thuc dac biet)
    public Person(){
    }

    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // khai bao phuong thuc
    public void move(){
       System.out.println("Phuong thuc move");
       System.out.println(name + " study English");
    }
    // khai bao phuong thuc co them tham so
    public void study(String subject){
       System.out.println("Phuong thuc study");
       System.out.println(name+" study "+subject);
    }
    public void hobby(String hobbies){
        System.out.println("Phuong thuc hobby");
        System.out.println(name + " like to " + hobbies);
    }
    public void display(){
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Dia chi: " + address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
}
