import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Pets pet = new Pets();
        pet.input();
        pet.eat("bamboo");
   

        System.out.println("Thong tin vua nhap: ");
        System.out.println( pet.toString());
        System.out.println(pet.sleep(12)); 
        System.out.println(pet.run(100)); 

        scanner.close();

    }

}
