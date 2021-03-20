public class App {
    public static void main(String[] args) throws Exception {
        // upcasting
        Animal animal = new Cat();
        animal.sound();
        // khong the su dung phuong thuc class cha khong co

        // downcasting
        Animal animal2 = new Dog();
        Dog dog = (Dog)animal2;
        dog.eat();
        dog.sound();
    }
}
