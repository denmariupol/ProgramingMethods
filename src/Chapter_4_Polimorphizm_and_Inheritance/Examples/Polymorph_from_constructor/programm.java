package Chapter_4_Polimorphizm_and_Inheritance.Examples.Polymorph_from_constructor;

/**
 * Created by Ingener_mobil on 04.11.2016.
 * Метод getId() содержится как в классе Dumb, так и в классе Dumber и является переопределенным. Перед вызовом конструктора Dumber() вызывается
 конструктор класса Dumb. Но так как в обоих случаях создается объект класса
 Dumber, то вызывается метод getId(), объявленный в классе Dumber, который
 в свою очередь оперирует полем id, еще не проинициализированным для класса Dumber. В результате id получит значение по умолчанию, т. е. нуль.
 Воспользовавшись преобразованием типов вида ((Dumber) objA).id, легко
 можно получить доступ к полю id из подкласса
 */
public class programm {
    public static void main(String[] args) {
        Dumb d = new Dumber();
    }
}
