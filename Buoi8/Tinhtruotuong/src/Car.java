// Tinh truu tuong
public abstract class Car {
        public String brand;
        public String color;
        public int price;
    
        public Car(){
            System.out.println("Goi toi constructor");}
    
        public abstract void speed(int tocDo);
        
        public void display(){
            System.out.println("Brand: " + brand);
            System.out.println("Color: " + color );
            System.out.println("Price: "+ price + " USD");
        }

        public Car(String brand, String color, int price) {
            this.brand = brand;
            this.color = color;
            this.price = price;
        }
}
