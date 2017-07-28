import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by JaMachine on 7/28/2017.
 */
public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> m = new HashMap<Integer, String>();
        m.put(3, "c");
        m.put(5, "a");
        m.put(1, "e");
        m.put(2, "d");
        m.put(4, "b");
        System.out.println(m);
        //
        //
        //

        LinkedHashMap<Integer, String> lm = new LinkedHashMap<Integer, String>();
        lm.put(3, "c");
        lm.put(5, "a");
        lm.put(1, "e");
        lm.put(2, "d");
        lm.put(4, "b");
        System.out.println(lm);
        //
        //
        //

        LinkedHashMap<Integer, String> lmi = new LinkedHashMap<Integer, String>(5, 1, true);
        lmi.put(5, "a");
        lmi.put(4, "b");
        lmi.put(3, "c");
        lmi.put(2, "d");
        lmi.put(1, "e");

        lmi.get(3);
        lmi.get(5);
        lmi.get(1);
        System.out.println(lmi);
        //
        //
        //

        LinkedHashMap<Integer, String> cashe = new Cache<Integer, String>(2);
        cashe.put(1, "a");
        cashe.put(2, "b");
        cashe.put(3, "c");

        cashe.get(2);

        cashe.put(9, "jz");
        System.out.println(cashe);
        //
        //
        //


    }
}
