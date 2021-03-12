public class PartTimeEmployee extends Employee{

    public int workingHours;

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculatorSalary() {
        // TODO Auto-generated method stub
        return workingHours*super.calculatorSalary();
    }

}
