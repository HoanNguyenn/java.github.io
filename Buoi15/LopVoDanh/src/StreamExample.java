import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
 public static void main(String[] args) {
     IntStream.range(1, 5).forEach(System.out::println);;
     DoubleStream.of(1,2,3,9).forEach(System.out::println);

    String [] str = {"C++","Java","Python"};
    Stream <String> strStream = Arrays.stream(str);
    strStream.forEach(x -> System.out.println(x) );
 }   
}
