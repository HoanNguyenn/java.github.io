public abstract class Employee{
    private String name;
    private long id;
    private int age;
    private double basicSalary;
    
    public Employee(String name, long id, int age, double basicSalary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public abstract class calculatorSalary();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    
}