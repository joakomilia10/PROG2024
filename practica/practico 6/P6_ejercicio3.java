import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6_ejercicio3 {
    public static final int MAXFILAS = 5;
    public static final int MAXCOLUMNAS = 10;
    public static void main(String[] args){
        int [][] Matriz = {     {1 ,  2,  3,  4,  5,  6,  7,  8,  9, 10},
                                
                                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
    
                                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},

                                {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},

                                {41, 42, 43, 44, 45, 46, 47, 48, 49, 50}
        };

        mostrar_matriz(Matriz);

        int fila_ingresada = obtener_fila();
        int columna_ingresada = obtener_columna();
        
        eliminar_objeto(Matriz, fila_ingresada,columna_ingresada);

        mostrar_matriz(Matriz);
    }

    public static int obtener_fila(){
        int fila = 0;
        boolean esValido = false;

        BufferedReader fila_entrada = new BufferedReader(new InputStreamReader(System.in));
        while(!esValido){
            try{
                System.out.println("ingrese fila");
                fila = Integer.valueOf(fila_entrada.readLine());
                esValido = true;
            }
            catch(Exception exc){
                System.out.println(exc);
            }
        }

        return fila;
    }

    public static int obtener_columna(){
        int columna = 0;
        boolean esValido = false;

        BufferedReader columna_entrada = new BufferedReader(new InputStreamReader(System.in));
        while(!esValido){
            try{
                System.out.println("ingrese la columna");
                columna = Integer.valueOf(columna_entrada.readLine());
                esValido = true;
            }
            catch(Exception exc){
                System.out.println(exc);
            }
        }
        return columna;
    }


    public static void eliminar_objeto(int[][] arr, int fila, int columna){
        while(fila<MAXFILAS && columna<MAXCOLUMNAS-1){
            arr[fila][columna] = arr[fila][columna+1];
            columna++;
        }
    }

    public static void mostrar_matriz(int[][] arr){
        for(int fila = 0 ; fila<MAXFILAS ; fila++){
            for(int columna = 0 ; columna<MAXCOLUMNAS ; columna++){
                System.out.println(arr[fila][columna]);
            }
        }
    }

}
