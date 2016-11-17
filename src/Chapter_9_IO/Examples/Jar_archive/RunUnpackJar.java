package Chapter_9_IO.Examples.Jar_archive;

/**
 * Created by Ingener_mobil on 17.11.2016.
 */
public class RunUnpackJar {
    public static void main(String[] args) {
        // расположение и имя архива
        String nameJar = "E:\\Lessons\\ProgramingMethods\\example.jar";
        // куда файлы будут распакованы
        String destinationPath = "c:\\";
        new UnPackJar().unpack(destinationPath, nameJar);
    }
}
