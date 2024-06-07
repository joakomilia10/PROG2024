import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5_ejercicio1 {
    final static int MAX = 15;
    final static int valor_MIN = 1;
    final static int valor_MAX = 12;
    public static void main(String[] args){
        int[] arrValores = new int[MAX];
        cargarArreglo(arrValores);

        int pos = 0;
        while((pos<MAX) && ((arrValores[pos] >= valor_MIN) && (arrValores[pos] <= valor_MAX)) ){
            pos++;
        }
        if(pos==MAX){
            mostrarArreglo(arrValores);
        }
        else{
            System.out.println("pusiste valores mayores a 12 o menores a 1");
        }
    }

    public static void cargarArreglo(int[] arrValores){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            for(int pos = 0 ; pos < MAX ; pos++){
                System.out.println("ingrese el entero de la posicion" + pos + ":");
                arrValores[pos] = Integer.valueOf(entrada.readLine());
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }

    public static void mostrarArreglo(int[] arrValores){
        for(int pos = 0 ; pos < MAX ; pos++){
            System.out.println("arrValores["+pos+"] -> " +arrValores[pos]);
        }
    }

}
