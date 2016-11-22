package Chapter_10_Collections.Examples.Properties;

/**
 * Created by Ingener_mobil on 22.11.2016.
 * Класс Properties предназначен для хранения карты свойств, где и ключ,
 и значения являются экземплярами класса String.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
public class PropertiesDemoWriter {
    public static void main(String[ ] args) {
        Properties props = new Properties();
        File file = new File("E:\\Lessons\\ProgramingMethods\\TestDir\\database.properties");

        try {
            file.createNewFile();
            // установка значений экземпляру
            props.setProperty("db.driver", "com.mysql.jdbc.Driver");
            // props.setProperty("db.url", "jdbc:mysql://127.0.0.1:3306/testphones");
            props.setProperty("db.user", "root");
            props.setProperty("db.password", "pass");
            props.setProperty("db.poolsize", "5");
            // запись properties-файла в папку prop проекта
            props.store(new FileWriter("E:\\Lessons\\ProgramingMethods\\TestDir\\database.properties"),null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
