package caracol;

import java.io.*;

public class Archivo {


    public void leer(String Archivo) throws FileNotFoundException, IOException
    {
            File archivo = new File(Archivo);
        String[] arreglo;
        String[][] matriz;
        
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String texto = br.readLine();
        arreglo = separar(texto);
        
        matriz = new String[arreglo.length][arreglo.length];        
        for(int j=0; j<matriz.length;j++)
        {
            matriz[0][j]=arreglo[j];
        }
        int i = 1;
         while(texto!=null)
         {        
             texto = br.readLine();
             if(texto==null)break;
             arreglo = separar(texto);
             matriz = organizar(arreglo,matriz,i);
             i++;
        }
         mostrarMatriz(matriz);
         matrizEspiral(matriz);
    }

   
    public final String[][] organizar(String[] array,String[][] matriz,int i)
    {  
        for(int j=0; j<matriz.length;j++)
        {
            matriz[i][j]=array[j];
        }
        return matriz;
    }
    public final String[] separar(String texto)
    {
        
        String[] partido = texto.split(" ");
        return partido;
    }
    public void mostrarMatriz(String[][] matriz)
    {
        for (String[] matriz1 : matriz) {
            for (int j = 0; j<matriz.length; j++) 
            {
                System.out.print(matriz1[j]+" ");
            }
            System.out.println();
        }
        System.out.println("");
    }
    public void matrizEspiral(String[][] matriz)
    {
        int TamañoMatriz=matriz.length;
        int inicio = 0;
        int borde = TamañoMatriz-1;
        int aux = 1;
        
        while(aux < TamañoMatriz*TamañoMatriz )
        {
            for(int i=inicio; i<=borde; i++)
            {
                System.out.print(matriz[inicio][i] + " ");
                aux++;
            }
            
            for(int i=inicio+1; i<=borde; i++)
            {
                System.out.print(matriz[i][borde] + " ");
                aux++;
            }
            
            for(int i=borde-1; i>=inicio; i--)
            {
                System.out.print(matriz[borde][i] + " ");
                aux++;
            }
            
            for(int i=borde-1; i>=inicio+1; i--)
            {
                System.out.print(matriz[i][inicio] + " ");
                aux++;
            }
           
            inicio++;
            borde--;
        }
    }

}
   
