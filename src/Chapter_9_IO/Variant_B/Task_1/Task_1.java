package Chapter_9_IO.Variant_B.Task_1;

import Chapter_9_IO.Examples.Serilization_Deserialization.*;

import java.io.InvalidObjectException;

/**
 * Created by Ingener_mobil on 18.11.2016.
 * Аргументировать принадлежность классу каждого
 * создаваемого метода и корректно переопределить
 * для каждого класса методы  equals(), hashCode(),
 * toString()
 * Создать объект класса Текст, используя классы
 * Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст,
 * заголовок текста.
 * сохраняя объекты приложения в одном или нескольких файлах
 * с применением механизма сериализации. Объекты
 * могут содержать поля, помеченные как static, а также transient. Для изменения
 * информации и извлечения информации в файле создать специальный класс коннектор
 * с необходимыми для выполнения этих задач методами
 */
public class Task_1 {
    public static void main(String[] args) {
        Unit word = new Word("The");
        Unit word1 = new Word("first");
        Unit word2 = new Word("programm");
        Unit s = new Sentence(word, word1);
        Sentence sentence = new Sentence(word, word1, word2);
        Sentence sentence1 = new Sentence(word2, word, word1);
        Sentence sentence2 = new Sentence(word, word2, word1);
        Text text = new Text("Title Text", sentence, sentence1, sentence2);
        Text text1 = new Text("Title Text1", sentence, sentence, sentence2);

        System.out.println("Object to serialize: \n"+text);
        String file = "E:\\Lessons\\ProgramingMethods\\TestDir\\datanew.txt";
        Serializator sz = new Serializator();

        boolean b = sz.serialization(text, file);

        //reading and output
        Unit res = null;

        try {
            res = sz.deserialization(file);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        System.out.println("Deserialized object: \n"+res);
    }

}

