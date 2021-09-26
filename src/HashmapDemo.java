
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapDemo {
    public static void main(String[] args) {

        HashMap<String,String> capitalMap = new HashMap<>();
        capitalMap.put("India","New Delhi");
        capitalMap.put("UK","London");
        capitalMap.put("USA","Washington DC");

        System.out.println(capitalMap.get("India"));
        System.out.println(capitalMap.keySet());

        // iterator

        Iterator<String> it = capitalMap.keySet().iterator();

        while(it.hasNext()){

           String key = it.next();
           String value = capitalMap.get(key);
            System.out.println("key is = " + key +  ", value is = " + value);

        }
        System.out.println("----------------");

        Iterator<Map.Entry<String,String>> it1 = capitalMap.entrySet().iterator();

        while (it1.hasNext()){
            Map.Entry<String,String> entry = it1.next();
            System.out.println("key is " + entry.getKey()+ " and value is " +entry.getValue());
        }
    }
}
