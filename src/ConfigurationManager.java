
import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> configs;

    private ConfigurationManager() {
        configs = new HashMap<>();
        configs.put("maxPlayers", "99");
        configs.put("Language", "rus");
        configs.put("Difficulty", "easy");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        return configs.get(key);
    }
    public void printAllConfigs() {
        for (Map.Entry<String, String> entry : configs.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
