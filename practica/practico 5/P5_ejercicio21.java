import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5_ejercicio21 {
final static int MAX = 10;
    public static void main(String[] args){
        int[] arrValores = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        mostrarArreglo(arrValores);

        int modificar_pos = obtener_pos();
        int nuevo_elemento = obtener_elemento();

        corrimientoDerecha(arrValores, modificar_pos);
        arrValores[modificar_pos] = nuevo_elemento;
        mostrarArreglo(arrValores);
    }

    public static void mostrarArreglo(int[] arr){
        for(int pos = 0 ; pos<MAX ; pos++){
            System.out.println("-->" + "|" + arr[pos] + "|");
        }
    }

    public static int obtener_pos(){
        int pos = 0;
        boolean esValido = false;
        BufferedReader pos_entrada = new BufferedReader(new InputStreamReader(System.in));
        while(!esValido){
            try{
                System.out.println("ingrese la posicion que desea modificar");
                pos = Integer.valueOf(pos_entrada.readLine());
                esValido = true;
            }
            catch(Exception exc){
                System.out.println(exc);
            }
        }
        return pos;
    }

    public static int obtener_elemento(){
        int elemento = 0;
        boolean esValido = false;
        BufferedReader elemento_entrada = new BufferedReader(new InputStreamReader(System.in));
        while(!esValido){
            try{
                System.out.println("ingrese el nuevo elemento");
                elemento = Integer.valueOf(elemento_entrada.readLine());
                esValido = true;
            }
            catch(Exception exc){
                System.out.println(exc);
            }
        }
        return elemento;
    }

    public static void corrimientoDerecha(int[] arr, int modificar_pos){
        for(int i = 9 ; i > modificar_pos ; i--){
            arr[i] = arr[i-1];
        }
    }
}
