public class Car1 extends Car {

    public Car1() {
    }

    public Car1(String brand, String color, int price) {
        super(brand, color, price);
    }
    
    @Override
    public void speed(int tocDo) {
        // TODO Auto-generated method stub
        System.out.println( brand + "co toc do" + tocDo);
    }
}
