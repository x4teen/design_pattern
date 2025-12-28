package dp.singleton;

import java.util.HashMap;
import java.util.Map;

public class AppConfig {
    private final Map<String, String> settings = new HashMap<>();

    private AppConfig() {}

    private static class Holder {
        private static final AppConfig INSTANCE = new AppConfig();
    }

    public static AppConfig getInstance() {
        return Holder.INSTANCE;
    }

    public String getSettings(String key) {
        return settings.get(key);
    }

    public void addSettings(String key, String value) {
        settings.put(key, value);
    }

    public static void main(String[] args) {
        AppConfig a = AppConfig.getInstance();
        AppConfig b = AppConfig.getInstance();
        System.out.println(a==b);

        a.addSettings("key1", "value1");
        System.out.println(b.getSettings("key1"));
    }
}
