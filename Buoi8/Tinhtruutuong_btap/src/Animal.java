import java.util.Scanner;

public abstract class Animal {
    public String name;
    public String gender;
    public double age;
    public double weight;
    public String color;

    public Animal(){
    }

    public Animal(String name, String gender, double age, double weight, String color) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public abstract void eat(String food);

    public abstract float run(float speed);

    public abstract float sleep(float hours);

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap giong: ");
        gender = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        age = scanner.nextDouble();
        System.out.println("Nhap can nang: ");
        weight = scanner.nextDouble();
        System.out.println("Nhap mau long: ");
        color = scanner.nextLine();
        scanner.nextLine();
    }

    public String toString(){
        return "Ten: " + name + " Giong: " + gender + " Tuoi: " + age + " Can nang: " + weight + " Mau " + color;
    }
}
