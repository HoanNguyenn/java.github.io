public class Car {
    public String brand;
    public String color;
    public int price;

    public Car(){
        System.out.println("Goi toi constructor");}

    public void speed(int tocDo){
        System.out.println("Phuong thuc speed");
        System.out.println(brand + " co toc do " + tocDo + " km/h ");
    }

    public void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color );
        System.out.println("Price: "+ price + " USD");
    }
}
