import java.net.http.WebSocket.Listener;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("Cat");
        list.add("Dog");
        list.add("Butterfly");
        list.add("Puppy");
        System.out.println("Phan tu dau tien: " + list.getFirst());
        System.out.println("Phan tu cuoi cung: " + list.getLast());

        list.addFirst("Panda");
        list.addLast("Bird");
        System.out.println("Phan tu dau tien: " + list.getFirst());
        System.out.println("Phan tu cuoi cung: " + list.getLast());

        System.out.println(list.size());

        System.out.println("Phan tu co Dog co vi tri" + list.indexOf(" Dog"));
        // khong co se tra ve -1

        list.set(2, "Chicken");
        System.out.println("Danh sach sau khi them: ");
        System.out.println(list);

        list.subList(0, 2).clear();        
        System.out.println("Danh sach sau khi xoa: ");
        System.out.println(list);

    }
}
