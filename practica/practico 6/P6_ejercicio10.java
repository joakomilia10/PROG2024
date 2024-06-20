import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6_ejercicio10 {
    public static final int MAXFILAS = 5;
    public static final int MAXCOLUMNAS = 10;
    public static final int SEPARADOR = 0;
    public static void main(String[] args){
        int[][] Matriz = {      {0 ,  2,  3,  4,  0,  6,  7,  8,  9, 0},
                                
                                {0, 12, 13, 0, 15, 16, 0, 18, 19, 0},

                                {0, 22, 23, 24, 25, 0, 27, 28, 29, 0},

                                {0, 32, 33, 34, 35, 36, 0, 38, 39, 0},

                                {0, 42, 43, 0, 45, 13, 0, 48, 49, 0}
        };

        mostrar_matriz(Matriz);

        int fila_ingresada = obtener_fila();
        int columna_ingresada = obtener_columna();

        buscar_secuencia(Matriz,fila_ingresada,columna_ingresada);

    }

    public static void mostrar_matriz(int[][] arr){
        for(int fila = 0 ; fila < MAXFILAS; fila++){
            for(int columna = 0 ; columna < MAXCOLUMNAS ; columna++){
                System.out.println(arr[fila][columna]);
            }
        }
    }

    public static int obtener_fila(){
        int valor = 0 ;
        boolean esValido = false; 

        BufferedReader valor_entrada = new BufferedReader(new InputStreamReader(System.in));
        while(!esValido){
            try{
                System.out.println("ingrese la fila que quiere buscar");
                valor = Integer.valueOf(valor_entrada.readLine());
                esValido = true;
            }
            catch(Exception exc){
                System.out.println(exc);
            }
        }

        return valor;
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


    public static void buscar_secuencia(int[][] arr, int fila_ingresada, int colomuna_ingresada){
        for(int fila = 0 ; fila<MAXFILAS ; fila++){
            int ini_sec = -1;
            int fin_sec = -1;
            while(ini_sec<MAXCOLUMNAS){
                ini_sec = buscar_ini(arr[fila],fin_sec+1);
                if(ini_sec<MAXCOLUMNAS){
                    fin_sec = buscar_fin(arr[fila],ini_sec);
                    imprimir_secuencia_correcta(arr[fila],fila,ini_sec,fin_sec,fila_ingresada,colomuna_ingresada);
                }
            }
        }   
    }

    public static int buscar_ini(int[] arr, int d){
        while(d<MAXCOLUMNAS && arr[d] == SEPARADOR){
            d++;
        }
        return d;
    }

    public static int buscar_fin(int[] arr, int d){
        while(d<MAXCOLUMNAS && arr[d] != SEPARADOR){
            d++;
        }
        return d-1;
    }

    public static void imprimir_secuencia_correcta(int[] arr,int fila, int ini, int fin, int fila_ingresada, int columna_ingresada){
        if(fila== fila_ingresada && (columna_ingresada>= ini && columna_ingresada<=fin)){
            System.out.println(ini + "|"+ fin);
        }
    }
}
