package StructuralPattern.DecoratorPattern;

public class PlainSender implements MessageProcessor {
    @Override
    public String process(String msg) {
        System.out.println("[SENT]" + msg);
        return msg;
    }
    
}
