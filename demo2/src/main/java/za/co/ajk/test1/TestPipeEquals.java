package za.co.ajk.test1;

/**
 * Created by andrekapp on 2017/07/10.
 */
public class TestPipeEquals {
    
    public static void main(String[] args) {
        
        boolean aa = Boolean.FALSE;
        boolean bb = Boolean.FALSE;
        boolean cc = Boolean.TRUE;
        boolean dd = Boolean.FALSE;
        boolean ee = Boolean.FALSE;
        boolean ff = Boolean.FALSE;
        
        boolean ans = aa |= bb |= cc |= dd |= ee |= ff; 
        
        System.out.println(ans);
    
        System.out.println();
    
        
        int x=0b101;
        int y=0b110;
        
        int z = x |= y;
    
        System.out.println(Integer.toBinaryString(z));
    
    }
}
