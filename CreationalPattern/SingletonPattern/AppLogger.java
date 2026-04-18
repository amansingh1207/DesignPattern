package CreationalPattern.SingletonPattern;

import java.util.ArrayList;
import java.util.List;

public class AppLogger {
    private static volatile AppLogger instance;
    private String logFile;
    private List<String> buffer;
    private int logCount;

    private AppLogger(String logFile) {   // Public!
        this.logFile = logFile;
        this.buffer = new ArrayList<>();
        this.logCount = 0;
        System.out.println("[LOGGER] Opened: " + logFile);
    }

    public static AppLogger getInstance(String LogFile) {
        if(instance == null){
            synchronized(AppLogger.class){
                if(instance == null){
                    instance = new AppLogger(LogFile);
                }
            }
        }
        return instance;
    }

    public void log(String level, String message) {
        logCount++;
        String entry = String.format("[%s #%d] %s",
            level, logCount, message);
        buffer.add(entry);
        System.out.println(entry);
    }

    public void info(String msg)  { log("INFO", msg); }
    public void warn(String msg)  { log("WARN", msg); }
    public void error(String msg) { log("ERROR", msg); }
    public int getLogCount() { return logCount; }
    public List<String> getBuffer() {
        return new ArrayList<>(buffer);
    }
}
