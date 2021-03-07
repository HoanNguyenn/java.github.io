public class Pets extends Animal {

    public Pets() {
    }

    public Pets(String name, String gender, double age, double weight, String color) {
        super(name, gender, age, weight, color);
    }
    
    @Override
    public void eat(String food) {
        // TODO Auto-generated method stub
        System.out.println(name + " eat " + food);
    }

@Override
public float run(float speed) {
    // TODO Auto-generated method stub
    return speed;
}

@Override
public float sleep(float hours) {
    // TODO Auto-generated method stub
    return hours;
}

@Override
public void input() {
    // TODO Auto-generated method stub
    super.input();
}

@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
}

}
