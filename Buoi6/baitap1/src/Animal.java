public class Animal {
    public String name;
    public String gender;
    public float age;
    public float weight;
    public String color;


    public Animal(){};

    public Animal(String name, String gender, float age, float weight, String color) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.color = color;
	};
    // tao constructor nhanh: souce action -> constructor 

    
    public void display() {
        System.out.printf("%3s %5s %4.1f %5.1f %5s \n", name, gender, age, weight, color);
    }

    public void eat(String food){
        System.out.println(name + " eat " + food);
    };
    public void run(Float speed){
        System.out.println("Speed" + speed);
    };
    public void sleep(Float hours){
        System.out.println(name + " sleep " + hours + "per hour");
    };

}