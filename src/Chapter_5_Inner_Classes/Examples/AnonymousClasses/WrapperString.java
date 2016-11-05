package Chapter_5_Inner_Classes.Examples.AnonymousClasses;

/**
 * Created by Ingener_mobil on 05.11.2016.
 */
public class WrapperString {
    private String str;
    public WrapperString(String str){
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public String replace(char oldChar,char newChar){
        char[]array = new char[str.length()];
        str.getChars(0,str.length(),array,0);
        for (int i = 0;i < str.length();i++){
            if(array[i] == oldChar){
                array[i] = newChar;
                break;
            }
        }
        return new String(array);
    }
}
