package Chapter_4_Polimorphizm_and_Inheritance.Variant_A.Task_1;

/**
 * Created by Ingener_mobil on 04.11.2016.
 * Аргументировать принадлежность классу каждого
 * создаваемого метода и корректно переопределить
 * для каждого класса методы  equals(), hashCode(),
 * toString()
 * Создать объект класса Текст, используя классы
 * Предложение, Слово.
 Методы: дополнить текст, вывести на консоль текст,
 заголовок текста.
 */
public class Programm {
    public static void main(String[] args) {
        Word word = new Word("The");
        Word word1 = new Word("first");
        Word word2 = new Word("programm");
        Sentence sentence = new Sentence(word,word1,word2);
        Sentence sentence1 = new Sentence(word2,word,word1);
        Sentence sentence2 = new Sentence(word,word2,word1);
        Text text = new Text("Title Text",sentence,sentence1,sentence2);
        Text text1 = new Text("Title Text1",sentence,sentence,sentence2);
        if (text.equals(text1))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
