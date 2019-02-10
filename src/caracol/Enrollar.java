/*
    
 */
package caracol;

import static java.lang.Float.floatToIntBits;
/**
 *
 * @author kebuun
 */
public class Enrollar {
    Enrollar(String []vector){
        int v = vector.length ;
        double r = (double) Math.sqrt(v) ;
        int exeso = 0 ;
        if(r%1 == 0){
            int temporal = (int) r;
            
                    System.out.println(temporal);
            
        }else{
            int temp = floatToIntBits((int) r);
            r++;
            exeso = temp - v;
            
            System.out.println(exeso);
        }
    }
}
