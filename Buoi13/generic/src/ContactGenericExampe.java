public class ContactGenericExampe {
    public static void main(String[] args){
        Contact contact = new Contact("Ngoc", 1234);
        String name = contact.getKey();
        int phoneNumber = contact.getValue();

        System.out.println("Name: " + name + " Phone number " + phoneNumber);
    }
}
