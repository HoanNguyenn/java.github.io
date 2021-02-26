public class App {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat();
        cat.species = "meo nha";
        cat.color = "den";
        cat.gender = "cai";

        cat.display();
        cat.sound("meo meo");

        Cat cat2 = new Cat();
        cat2.species = "meo Tau";
        cat2.color = "den";
        cat2.gender = "cai";

        cat2.display();
        cat2.sound("mi mi");

        Cat cat3 = new Cat();
        cat3.species = "meo Nga";
        cat3.color = "den";
        cat3.gender = "cai";

        cat3.display();
        cat3.sound("swis swis");






    }
}
