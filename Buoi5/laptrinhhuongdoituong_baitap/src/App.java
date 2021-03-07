public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        car.brand = "Audi R8 Coupe V10";
        car.color = "Black";
        car.price = 140000;

        car.speed(330);
        car.display();

        Car car2 = new Car();
        car2.brand = "Audi A8L 55 TFSI";
        car2.color = "Black";
        car2.price = 90000;

        car2.speed(300);
        car2.display();

        Car car3 = new Car();
        car3.brand = "Mercedes-Benz S-Class ";
        car3.color = "Black";
        car3.price = 200000;

        car3.speed(350);
        car3.display();


    }
}
