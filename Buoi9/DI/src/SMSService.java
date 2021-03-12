public class SMSService implements MessageService {

    @Override
    public void sendMessage(String msg, String rec) {
        // TODO Auto-generated method stub
        System.out.println("SMS send to "+ rec +" with message "+msg);
    }


    
}
