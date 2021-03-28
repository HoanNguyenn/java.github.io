public class Player {
    private String name;
    private Position position;
    private int num;

    public Player(String name, int num, Position position) {
        this.name = name;
        this.num = num;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        System.out.println(num + "-" + name + "-"+ position+"");
        return super.toString();
    }

}

