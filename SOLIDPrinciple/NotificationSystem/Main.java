public class Main {
    public static void main(String[] args){
        MessageSender m = new EmailSender();
        NotificationService n = new NotificationService(m);
        n.notify("This is the message");

        MessageSender m2 = new WhatsappSender();
        NotificationService n2 = new NotificationService(m2);
        n2.notify("This is second msg");
    }
}
