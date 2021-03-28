import java.util.ArrayList;
import java.util.Arrays;

interface Converter<F, T>{
    T convert(F from);
}

public class LambdaExample {
    public static void main(String[] args) throws Exception {
    ArrayList<Integer> number = new ArrayList<>();
    number.add(1);
    number.add(2);
    number.add(3);
    number.add(4);
    number.add(5);
    
    number.forEach((n)->{System.out.println(n);});
    
    number.forEach(System.out::println);

    ArrayList<Person> listPerson = new ArrayList<>();
    listPerson.add(new Person("Ha", 20));
    listPerson.add(new Person("Thien",19));
    listPerson.add(new Person("Nguyet", 21));

    listPerson.forEach(Person -> System.out.println(Person.getAge()+ Person.getName()));

    // Vi du ep kieu
    int num = 1; 
    Converter <Integer,String> stringConvert = (from) -> String.valueOf(from+num);
    System.out.println(stringConvert.convert(2));
    
    String [] str = {"Java","C++","Python","Ruby","cat"};
    Arrays.sort(str, String::compareToIgnoreCase);
    for (String word: str){
        System.out.println(word);
    }
}
}
