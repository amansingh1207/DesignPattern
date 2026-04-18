package StructuralPattern.DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        String msg = "Hello World";

        // 1. Only Plain
        MessageProcessor plain = new PlainSender();
        plain.process(msg);

        // 2. Encrypted + Sent
        MessageProcessor encrypted =
                new EncryptionDecorator(new PlainSender());
        encrypted.process(msg);

        // 3. Compressed + Encrypted + Sent
        MessageProcessor combo1 =
                new CompressionDecoractor(
                    new EncryptionDecorator(
                        new PlainSender()));
        combo1.process(msg);

        // 4. Timestamp + Encrypted + Compressed + Sent
        MessageProcessor combo2 =
                new TimestampDecorator(
                    new EncryptionDecorator(
                        new CompressionDecoractor(
                            new PlainSender())));
        combo2.process(msg);
    }
}