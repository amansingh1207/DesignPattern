public class WhatsappSender implements MessageSender{
    public void send(String msg){
        System.out.println("Whatsapp sent: " + msg);
    }
}
