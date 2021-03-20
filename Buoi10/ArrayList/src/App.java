import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Audi");
        cars.add("Madza");
        for(String car: cars){
            System.out.println(car);
        }
        System.out.println(cars.size());

        System.out.println(cars.get(1));

        cars.set(2, "mescerdes");
        System.out.println(cars);

        // cars.clear();
        // System.out.println(cars.size());

        cars.remove("Audi");
        System.out.println(cars);

        ArrayList<String> cars2 = new ArrayList<String>();
        cars2.add("Ford");
        cars2.add("BMV");

        cars.addAll(2, cars2);
        System.out.println(cars);

        cars.retainAll(cars2);
        System.out.println(cars);

        System.out.println(cars2.lastIndexOf("Ford")); 

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<=100;i++){
            arr.add(i);
        }
        System.out.println(arr); 

        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0;i<=100;i++){
            array.add(i);
            if (array.get(i)%2==0){
                array.get(i);
                System.out.print(array.get(i));
            }
        }
        // khong thanh 1 hang???
        
}
}
