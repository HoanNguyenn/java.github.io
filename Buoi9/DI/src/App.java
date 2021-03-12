public class App {
    public static void main(String[] args) throws Exception {
        // UserController userController = new UserController();
        // userController.processEmail("Have a good day", "Chancy");

        MessageService messageService = new EmailService();
        UserController userController = new UserController(messageService);
        userController.send();
    }


}
