package CreationalPattern.SingletonPattern;

public class Main {
    public static void main(String[] args) {

        // Module A
        AppLogger loggerA = AppLogger.getInstance("app.log");
        AppConfig configA = AppConfig.INSTANCE;

        loggerA.info("Module A started");
        loggerA.info("DB: " + configA.get("db.host"));
        configA.set("app.debug", "true");

        // Module B (same instances!)
        AppLogger loggerB = AppLogger.getInstance("app.log");
        AppConfig configB = AppConfig.INSTANCE;

        loggerB.info("Module B started");
        loggerB.info("Debug: " + configB.get("app.debug"));

        //Now consistent
        System.out.println("\nTotal count: "
                + loggerA.getLogCount());  // 4

        System.out.println("Debug: "
                + configB.get("app.debug")); // true

        System.out.println(configA == configB);        
    }
}