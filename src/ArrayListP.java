import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListP {
    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<String>(Arrays.asList("A","B","C","D"));
        ArrayList<String> a2 = new ArrayList<String>(Arrays.asList("A","B","C","E"));

        Collections.sort(a1);
        Collections.sort(a2);

        //Array comparison --> Find out additional string
//        a1.removeAll(a2);
//        System.out.println(a1);

        // Array comparison --> Find out missing string
        a2.removeAll(a1);
        System.out.println(a2);

        ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("java","pytho","python","C++","php"));
        ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("java","python","C++","c"));

        lang1.retainAll(lang2);
        System.out.println(lang1);


    }
}
