public class Person {
    
    // khai bao thuoc tinh
    private String name;
    private int age;
	private String address;

    // mac dinh cac bien deu co yeu to nay
    public static String college = "Techmaster";
    public static void change(){
        college = "CNTT";
    }
    // trong phuong thuc static chi dung duoc bien static

    public Person(){
    }

    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // nap chong phuong thuc
    public void sum(int a, int b){
        System.out.println(a+b);
    }
    public void sum (int a, int b, int c){
        System.out.println(a+b+c);
    }

    public void display(){
        System.out.println("Ten: "+ name);
        System.out.println("Tuoi: "+ age);
        System.out.println("Dia chi: "+ address);
    }

    // setter_getter
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
