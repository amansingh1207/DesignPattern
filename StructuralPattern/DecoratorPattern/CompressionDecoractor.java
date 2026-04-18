package StructuralPattern.DecoratorPattern;

public class CompressionDecoractor implements MessageProcessor {
    private MessageProcessor processor;

    public CompressionDecoractor(MessageProcessor processor) {
        this.processor = processor;
    }

    @Override
    public String process(String msg) {
        // Simple run-length encoding
        StringBuilder compressed = new StringBuilder();
        int i = 0;
        while (i < msg.length()) {
            char c = msg.charAt(i);
            int count = 1;
            while (i + count < msg.length()
                    && msg.charAt(i + count) == c) {
                count++;
            }
            compressed.append(c);
            if (count > 1) compressed.append(count);
            i += count;
        }
        String result = compressed.toString();
        System.out.println("[COMPRESSED] " + result);
        return processor.process(result);

    }

    
}
