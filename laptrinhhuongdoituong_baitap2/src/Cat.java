public class Cat {
    public String species;
    public String color;
    public String gender;

    public Cat(){
        System.out.println("Goi toi constructor");
    }

    public void sound(String amThanh){
        System.out.println("Meo keu " + amThanh);
    }

    public void display(){
        System.out.println("Giong meo: " + species);
        System.out.println("Mau long: " + color);
        System.out.println("Gioi tinh: " + gender);
    }
}
