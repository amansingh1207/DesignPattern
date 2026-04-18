package CreationalPattern.SingletonPattern;

import java.util.HashMap;
import java.util.Map;

public enum AppConfig {
    INSTANCE;
    private Map<String, String> settings;

    private AppConfig() {                 // Public!
        this.settings = new HashMap<>();
        settings.put("db.host", "localhost");
        settings.put("db.port", "5432");
        settings.put("app.name", "GradePortal");
        settings.put("app.debug", "false");
        System.out.println("[CONFIG] Loaded "
            + settings.size() + " settings");
    }

    public String get(String key) {
        return settings.getOrDefault(key, "");
    }
    public void set(String key, String value) {
        settings.put(key, value);
    }
    public int size() { return settings.size(); }
}
