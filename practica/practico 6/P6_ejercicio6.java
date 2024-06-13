import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6_ejercicio6 {
    public static final int MAXFILAS = 5;
    public static final int MAXCOLUMNAS = 10;
    public static void main(String[] args){
        int[][] Matriz = {     {1 ,  2,  3,  4,  5,  6,  7,  8,  9, 10},
                                
        {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},

        {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},

        {31, 32, 33, 34, 35, 36, 13, 38, 39, 40},

        {41, 42, 43, 44, 45, 13, 47, 48, 49, 50}
        };

        mostrar_matriz(Matriz);

        int valor = obtener_valor();

        buscar_valor(Matriz, valor);

        mostrar_matriz(Matriz);
    }

    public static void mostrar_matriz(int[][] arr){
        for(int fila = 0 ; fila < MAXFILAS ; fila++){
            for(int columna = 0 ; columna<MAXCOLUMNAS ; columna++){
                System.out.println(arr[fila][columna]);
            }
        }
    }

    public static int obtener_valor(){
        int valor = -1;
        boolean esValido = false;

        BufferedReader valor_entrada = new BufferedReader(new InputStreamReader(System.in));
        while(!esValido){
            try{
                System.out.println("ingrese el numero que quiere buscar");
                valor = Integer.valueOf(valor_entrada.readLine());
                esValido = true;
            }
            catch(Exception exc){
                System.out.println(exc);
            }
        }
        return valor;
    }

    public static void buscar_valor(int[][] arr, int valor){
        boolean encontro = false;

        for(int fila = 0 ; fila<MAXFILAS ; fila++){
            for(int columna = 0 ; columna<MAXCOLUMNAS ; columna++){
                if(arr[fila][columna] == valor){
                    encontro = true;
                    corrimiento_izquierda(arr,fila,columna);
                }
            }
        }
        if(encontro){
            System.out.println("se encontro el numero y se borro."+ "\t" + "la matriz queda asi:");
        }
        else{
            System.out.println("no se encontro el numero");
        }
    }

    public static void corrimiento_izquierda(int[][] arr, int fila, int columna){
        while(fila<MAXFILAS && columna<MAXCOLUMNAS-1){
            arr[fila][columna] = arr[fila][columna+1];
            columna++;
        }
    }
}
