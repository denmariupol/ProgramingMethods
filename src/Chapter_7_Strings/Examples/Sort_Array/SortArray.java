package Chapter_7_Strings.Examples.Sort_Array;

/**
 * Created by Ingener_mobil on 07.11.2016.
 */
public class SortArray {
    public static void main(String[] args) {
        String names = " Alena Alice alina albina Anastasya ALLA ArinA ";
        names = names.trim();
        String a[] = names.split(" ");
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[j].compareToIgnoreCase(a[i])<0){
                    String temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        for (String s : a) {
            System.out.println(s+" ");
        }
    }
}
