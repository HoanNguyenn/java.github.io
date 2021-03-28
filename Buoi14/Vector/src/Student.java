public class Student implements Comparable<Student> {
    // de co the su dung phuong thuc sort
     
    private String name;
    private int id;
    private String address;

    public Student(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        return "id: "+ id + " name: " + name + " dia chi: " + address;
    }

    // so sanh ten trong list
    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName()) ;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getAddress() {
        return address;
    }



    public void setAddress(String address) {
        this.address = address;
    }}
