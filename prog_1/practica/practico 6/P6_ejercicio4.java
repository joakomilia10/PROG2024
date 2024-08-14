import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6_ejercicio4 {    
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
        int nuevo_valor = obtener_valor();

        agregar_objeto(Matriz, fila_ingresada, columna_ingresada, nuevo_valor);

        mostrar_matriz(Matriz);
    }

    public static void mostrar_matriz(int[][] arr){
        for(int fila = 0 ; fila<MAXFILAS ; fila++){
            for(int columna = 0 ; columna<MAXCOLUMNAS ; columna++){
                System.out.println(arr[fila][columna]);
            }
        }
    }

    public static int obtener_fila(){
        int fila = -1;
        boolean esValido = false;

        BufferedReader entrada_fila = new BufferedReader(new InputStreamReader(System.in));
        while(!esValido){
            try{
                System.out.println("ingrese la fila");
                fila = Integer.valueOf(entrada_fila.readLine());
                esValido = true;
            }
            catch(Exception exc){
                System.out.println(exc);
            }
        }
        return fila;
    }

    public static int obtener_columna(){
        int columna = -1;
        boolean esValido = false;
        
        BufferedReader entrada_columna = new BufferedReader(new InputStreamReader(System.in));
        while(!esValido){
            try{
                System.out.println("ingrese la columna");
                columna = Integer.valueOf(entrada_columna.readLine());
                esValido = true;
            }
            catch(Exception exc){
                System.out.println(exc);
            }
        }

        return columna;
    }

    public static int obtener_valor(){
        int valor = -1;
        boolean esValido = false;

        BufferedReader valor_entrada = new BufferedReader(new InputStreamReader(System.in));
        while(!esValido){
            try{
                System.out.println("ingrese el vlaor que quiere agregar");
                valor = Integer.valueOf(valor_entrada.readLine());
                esValido = true;
            }
            catch(Exception exc){
                System.out.println(exc);
            }
        }
        return valor;
    }

    public static void agregar_objeto(int[][] arr, int fila, int columna, int numero){
        int i = MAXCOLUMNAS -1;
        while(i>columna){
            arr[fila][i] = arr[fila][i-1];
            i--;
        }
        arr[fila][columna] = numero;
    }
}
