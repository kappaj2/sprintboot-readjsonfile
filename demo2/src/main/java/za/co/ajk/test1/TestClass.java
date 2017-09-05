package za.co.ajk.test1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

/**
 * Created by andrekapp on 2017/07/05.
 */
public class TestClass {

    public <V extends Serializable> void testCodota(V v, IntFunction<Integer> intFunction){

        StringBuilder sb = new StringBuilder();
        sb.append("as");
        sb.append(12);

        String ss = sb.toString();
    
        List<Integer> testList = Arrays.asList(1,2,3,4,5);
        
        for (int var:testList) {
    
            if (intFunction.apply(var) > 4) {
                System.out.println("Entry below");
            } else {
                System.out.println("Entry is : " + var +" and aa is "+ var);
            }
        }

    }
}
