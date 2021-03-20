import java.util.Scanner;

import java.util.Scanner;

public class Student{
    private String name;
    private int age;

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten:");
        name = scanner.nextLine();
        System.out.println("Nhap tuoi ");
        age = scanner.nextInt();
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ten: " + name + " Tuoi: " + age ;
    }

    
}