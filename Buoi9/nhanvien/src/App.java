public class App {
    public static void main(String[] args) throws Exception {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Hoan", 100000);
        System.out.println("Name: " + fullTimeEmployee.getName());
        System.out.println("Luong: " + fullTimeEmployee.calculatorSalary());

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Hoan", 150000, 8);
        System.out.println("Name: " + partTimeEmployee.getName());
        System.out.println("Luong: " + partTimeEmployee.calculatorSalary());
    }

}
