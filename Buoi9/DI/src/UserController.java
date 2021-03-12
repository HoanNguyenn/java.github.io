public class UserController {
    // private EmailService emailService = new EmailService();

    // gthich?

    // public void processEmail(String mgs, String rec){
    //     this.emailService.sendEmail(mgs, rec);
    // }

    private MessageService messageService;
    // gth? messageService o đay chi cai gi

    public UserController(MessageService messageService) {
        this.messageService = messageService;
    }
    public void send(){
        messageService.sendMessage("Do homework", "Chancy");
    }
    // gth? 

}
