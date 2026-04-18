package StructuralPattern.DecoratorPattern;

public class TimestampDecorator implements MessageProcessor {
    private MessageProcessor processor;

    public TimestampDecorator(MessageProcessor processor) {
        this.processor = processor;
    }

    @Override
    public String process(String msg) {
        String result = "[" +
            java.time.LocalTime.now().withNano(0) +
            "] " + msg;
        System.out.println("[TIMESTAMPED] " + result);
        return processor.process(result);

    }
    
}
