package Chapter_7_Strings.Examples.Resource_Manager;

import java.util.Locale;

/**
 * Created by Ingener_mobil on 07.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        ResourceManager resourceManager = ResourceManager.INSTANCE;
        System.out.println(resourceManager.getString("er"));
        resourceManager.changeResource(new Locale("be","BY"));
        System.out.println(resourceManager.getString("er"));
    }
}
