import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {
        // LAY NGAY HIEN TAI
        Date date = new Date();
        SimpleDateFormat fDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        // xuat hien voi dinh dang nao dd/mm/yy...
        String currentDate = fDateFormat.format(date);
        System.out.println(currentDate);
        // cach viet rut gon: String currentDate = new SimpleDateFormat ("dd/MM/yy").format(new Date);
        // refec - extract 
    }
}
