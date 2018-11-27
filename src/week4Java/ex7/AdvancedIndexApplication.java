package week4Java.ex7;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvancedIndexApplication {
    public static void main(String[] args) {
        Map<Integer, List<Topic>> index = new HashMap<>();
        System.out.println("Index: "+index);
        Integer pageNumber1 = new Integer(1);
        Integer pageNumber2 = new Integer(2);
        Topic topic1 = new Topic("connecting");
        Topic topic2 = new Topic("positive things");
        Topic topic3 = new Topic("ecologic economy");
        List<Topic> topics1 = new ArrayList<>();
        List<Topic> topics2 = new ArrayList<>();
        topics1.add(topic1);
        topics2.add(topic2);
        topics2.add(topic3);
        index.put(pageNumber1,topics1);
        index.put(pageNumber2,topics2);
        System.out.println("Index: "+index);
        System.out.println("Index keys: "+index.keySet());
        System.out.println("Index values: "+index.values());
        Topic topic4 = new Topic("teaching methods");
        List<Topic> stored = index.get(1);
        stored.add(topic4);
        System.out.println("Index entry sets: "+index);
        boolean isKey1InMap =  index.containsKey(1);
        if(isKey1InMap){
            System.out.println("The page number 1 exists as key");
        }
        List<Topic> stored2 = index.get(2);
        System.out.println("The topics in page number 2 are"+stored2);
        System.out.println("Index size: "+index.size());
    }
}
