package caracol;

import java.io.*;

public class Archivo {

   public void leer(String Archivo){
         
       try {
           
            FileReader r = new FileReader(Archivo);
            BufferedReader buffer = new BufferedReader(r);
           
            String temp = "";
            
            while(temp != null){
                temp = buffer.readLine();
                String x;
                x = temp;
                String []vector = x.split("  ");
                Enrollar e = new Enrollar(vector);
            }
        } catch (Exception e) {
            System.out.println("");
        }
   }
   
}
