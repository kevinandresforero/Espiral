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
            for(int i=0; i<vector.length;i++){
                System.out.println(v);
            }
                                
        }else{
            int temp = floatToIntBits((int) r);
            r++;
            exeso = temp - v ;
            int crece = vector.length + exeso ;
            String Vtemp[] = null ;
            for(int i=0; i < crece ;i++){
                if(i>vector.length){
                    Vtemp[i] = "0" ;
                }else{
                    
                }
            }      
        }
    }
}
