import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void drawShape(List<? extends Shape> lists){
        for(Shape s:lists){
            s.draw();
        }
    }

    public static void main(String[] args){

        List<Circle> list1 = new ArrayList<Circle>();
        list1.add(new Circle());
        drawShape(list1);

        List<Square> list2 = new ArrayList<Square>();
        list2.add(new Square());

    }
    
}
