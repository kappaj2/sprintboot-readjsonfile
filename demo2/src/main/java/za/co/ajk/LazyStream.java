package za.co.ajk;

import java.util.stream.Stream;

/**
 * Created by andrekapp on 2017/07/07.
 * https://blog.jooq.org/2017/07/03/are-java-8-streams-truly-lazy-not-completely/
 */
public class LazyStream {
    
    public static void main(String[] args) {
        
        Stream.iterate(0, i -> i + 1)
                .map(i -> i + 1)
                .peek(i -> System.out.println("Map : " + i))
                .limit(5)
                .forEach(i -> {
                });
    
        System.out.println();
        System.out.println();
        
        Stream.iterate(0, i  -> i + 1)
                .limit(5)
                .map(i -> i + 1)
                .peek(i -> System.out.println("Map : " + i ))
                .forEach(i -> {});
    
        System.out.println();
        System.out.println();
    
        /*
            So, the first Stream pipeline will map all the 8 flatmapped values prior to applying the limit, 
            whereas the second Stream pipeline really limits the stream to 5 elements first, 
            and then maps only those.
         */
        Stream.iterate(0, i -> i + 1)
                .flatMap(i -> Stream.of(i, i, i, i))
                .map(i -> i + 1)
                .peek(i -> System.out.println("Map : "+i))
                .limit(29)       // limit here applies after the map - so will 
                .forEach(i -> {});
        
        System.out.println();
        System.out.println();
        
        /*
            As you can see, the result of the flatMap() operation is consumed eagerly with a terminal forEach() operation, 
            which will always produce all the four values in our case and send them to the next operation. 
            So, flatMap() isn’t lazy, and thus the next operation after it will get all of its results. 
            This is true for Java 8. Future Java versions might improve this, of course.
         */
        Stream.iterate(0, i -> i + 1)
                .flatMap(i -> Stream.of(i, i, i, i))
                .limit(5)       //   limit here applies before the map operation - we will only accept 5 values.
                .map(i -> i + 1)
                .peek(i -> System.out.println("Map : "+ i))
                .forEach(i -> {});
    }
}
