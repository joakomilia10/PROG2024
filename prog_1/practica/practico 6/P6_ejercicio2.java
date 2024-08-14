
public class P6_ejercicio2 { 
    final static  int MAXFILAS = 5;
    final static  int MAXCOLUMNAS = 10; 
    public static void main(String[] args){
        int [][] Matriz = {     {1 ,  2,  3,  4,  5,  6,  7,  8,  9, 10},
                                
                                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
    
                                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},

                                {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},

                                {41, 42, 43, 44, 45, 46, 47, 48, 49, 50}
    };
        imprimir_pares(Matriz);
        
    }
    
    public static void imprimir_pares(int[][] arr){
        int total = 0;
        for(int fila = 0; fila < MAXFILAS; fila++){
            int cant_pares = buscar_pares(arr,fila);
            total += cant_pares;
        }
        System.out.println(total);
    }

    public static int buscar_pares(int[][] arr, int fila){
        int contador = 0;
        for(int columna = 0 ; columna<MAXCOLUMNAS ; columna++){
            if(arr[fila][columna]%2 == 0){
                contador++;
            }
        }
        return contador;
    }

}
