package Chapter_7_Strings.Variant_B.Task_1;

import Chapter_3_Class_and_Objects.Variant_A.Task_2.Arr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ingener_mobil on 11.11.2016.
 * Создать программу обработки текста учебника по программированию
 * с использованием классов: Символ, Слово, Предложение, Абзац, Лексема, Листинг,
 * Знак препинания и др. Во всех задачах с формированием текста заменять табуляции и
 * последовательности пробелов одним пробелом.Предварительно текст следует разобрать на
 * составные части, выполнить одно из перечисленных ниже заданий и вывести полученный результат.
 * 1. Найти наибольшее количество предложений текста, в которых есть одинаковые слова.
 */
public class Programm {

    public static void main(String[] args) {
        Run run = new Run();
        run.Init();
    }
}

