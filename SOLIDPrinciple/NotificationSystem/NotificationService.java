public class NotificationService {
    private MessageSender sender;
    NotificationService(MessageSender s){
        this.sender = s;
    }

    public void notify(String msg){
        sender.send(msg);
    }
}
