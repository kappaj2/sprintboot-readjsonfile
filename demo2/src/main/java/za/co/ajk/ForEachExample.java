package za.co.ajk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by andrekapp on 2017/07/07.
 */
public class ForEachExample {
    
    public static void main(String[] args) {
        
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
    
        System.out.println("Java 7 style \n");
        for (Map.Entry<String, Integer> entry: items.entrySet()){
            System.out.println("Key : "+entry.getKey()+" and value : "+entry.getValue());
        }
    
        System.out.println();
        System.out.println("Java 8 \n");
        items.forEach((k,v) -> System.out.println("Key : "+k+" and value : "+v ));
    
        System.out.println();
        System.out.println("Variable check \n");
        
        items.forEach((k ,v) ->
                {
                    System.out.println("K : " + k + " and v : " + v);
                    if (k.equals("E")){
                        System.out.println("Found entry with key E");
                    }
                }
        );
    
    
        System.out.println("Lists and Lambdas \n");
        List<String> litems = new ArrayList<>();
        litems.add("A");
        litems.add("B");
        litems.add("C");
        litems.add("D");
        litems.add("E");
    
        litems.forEach(item -> System.out.println("Item is : "+item));
        
        litems.forEach(item -> {
            System.out.println("Item is : "+item);
            if(item.equals("B")){
                System.out.println("Foudn item b");
            }
        });
        
        litems.forEach(System.out::println);
        
        //  Filter and check for B - print if found
        litems.stream().filter(s -> s.contains("B")).forEach(System.out::println);
    }
}
