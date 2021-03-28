public class ThreadExample {
    public static void main(String[] args) {
        new Thread(){
            public void run(){
            for (int i = 10;i>0;i--){
                System.out.println(i);
            }
            try {
                
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        System.out.println("het gio");
        }
    }.start();

}}
