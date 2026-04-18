package StructuralPattern.DecoratorPattern;

public class EncryptionDecorator implements MessageProcessor {
    private MessageProcessor messageProcessor;
    
    public EncryptionDecorator(MessageProcessor messageProcessor) {
        this.messageProcessor = messageProcessor;
    }
    
    @Override
    public String process(String msg) {
         // Simple Caesar cipher (shift by 3)
        StringBuilder encrypted = new StringBuilder();
        for (char c : msg.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                encrypted.append(
                    (char)((c - base + 3) % 26 + base));
            } else {
                encrypted.append(c);
            }
        }
        String result = encrypted.toString();
        System.out.println("[ENCRYPTED] " + result);
        return messageProcessor.process(result);

    }
    
    
}
