package Chapter_7_Strings.Examples.Resource_Manager;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Ingener_mobil on 07.11.2016.
 */
public enum  ResourceManager {
    INSTANCE;
    private ResourceBundle resourceBundle;
    private final String resourceName = "Chapter_7_Strings.Examples.Resource_Manager.property.text";
    private ResourceManager(){
        resourceBundle = ResourceBundle.getBundle(resourceName, Locale.getDefault());
    }
    public void changeResource(Locale locale){
        resourceBundle = ResourceBundle.getBundle(resourceName,locale);
    }
    public String getString(String key){
        return resourceBundle.getString(key);
    }
}
