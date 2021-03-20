public class App {
    public static void main(String[] args) throws Exception {
        try {
            int a =0;
            int b=9;
            int c=b/a;
        } catch (Exception e) {
            // System.out.println("Khong the thuc hien khoi lenh tren");
            e.getMessage();
        }
        finally {
            System.out.println("Khoi lenh nay luon duoc thuc hien");
        }

        

    }
}
