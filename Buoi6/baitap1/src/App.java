public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal();
        animal.name = "Belgan";
        animal.gender = "Male";
        animal.age = 8f;
        animal.weight = 1.2f;
        animal.color = "white";

        animal.display();
        animal.eat("Fish");
        animal.sleep(12f);
        animal.run(10f);




    }
}
