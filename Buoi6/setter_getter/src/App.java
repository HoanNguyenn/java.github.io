public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        // person.name = "Ngoc" ;
        // person.age = 25;
        // person.address = "HN";
        person.setName("Lisa");
        person.setAge(23);
        person.setAddress("Bangkok");

        // System.out.println(" My idol names " + person.name);
        // person.move();
        person.display();

        Person person2 = new Person("Jisoo",25,"Seoul");
        // person2.name = "Chan";
        // person2.study("Chinese");
        // person2.hobby("watch movie");


    }
}
