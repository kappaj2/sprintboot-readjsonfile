package za.co.ajk;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by andrekapp on 2017/07/07.
 * https://www.pluralsight.com/guides/java-and-j2ee/java-8-stream-api-part-2?aid=7010a000002BWqGAAW&promo=&oid=&utm_source=google&utm_medium=ppc&utm_campaign=EMEA_Dynamic&utm_content=&utm_term=&gclid=EAIaIQobChMIruHn-6r31AIVVkkZCh0RjAiwEAAYASAAEgJ9QPD_BwE
 * 
 */
public class StreamTesting {
    
    public static void main(String[] args) {
    
        List<Character> aToD = Arrays.asList('a', 'b', 'c', 'd'); 
        List<Character> eToG = Arrays.asList('e', 'f', 'g', 'b'); 
        Stream<List<Character>> stream = Stream.of(aToD, eToG);
        
        stream.flatMap(l ->  l.stream())
                .map(c -> (int)c)
                .forEach(i -> System.out.println("Formatted %d : "+i));
    }
}
