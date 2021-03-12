public class EmailService implements MessageService {
    // public void sendEmail(String message, String reciever){
    //     System.out.println("Email send to reciever"+ reciever +"with message"+message);
    // }
    // public void processEmail(String mgs, String rec) {
    // }

    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("Email send to "+ rec +" with message "+msg);
    }

    
}