package week4Java.ex3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BasicIndexApplication {
    public static void main(String[] args) {
        Map<Integer, String> Index = new HashMap<>();
        Index.put(1,"connecting");
        Index.put(2,"positive things");
        Index.put(3,"ecologic economy");
        System.out.println("your empty index is "+Index);
        System.out.println("Index Keys : "+Index.keySet());
        System.out.println("Index Values : "+Index.values());
        Index.put(1,"teaching methods");
        System.out.println("Index : "+Index);
        boolean isPage1Exists = Index.containsKey(1);
        System.out.println("is page number 1 exists as a key? "+isPage1Exists);
        System.out.println("the topic in page number 3 is : "+Index.get(3));
        System.out.println("Index size : "+Index.size());

    }
}
