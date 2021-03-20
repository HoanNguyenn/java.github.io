import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetExample {
    enum days{
        SUNDAY, MONDAY,TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    }
    public static void main(String[] args) throws Exception{
        Set<days> set = EnumSet.of(days.MONDAY, days.TUESDAY);
        Iterator <days> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()); 
        }
    }
}
