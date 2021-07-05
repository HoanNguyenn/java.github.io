public class App {
    public static void main(String[] args) throws Exception {
        Integer x = 100;
        Integer y = 0;

        Calculation calculation = new Calculation();
        Integer result = calculation.numberDivide(x, y);
        System.out.println("Result: " + result);

    }
}
