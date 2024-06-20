                                        //ini falla
                                        //ini falla
                                        //ini falla
                                        //ini falla
                                        //ini falla



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6_ejercicio13 {
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

        int dimension_secuencia = obtener_dimension();

        buscar_secuencias(Matriz,dimension_secuencia);

        mostrar_matriz(Matriz);
    }

    public static void mostrar_matriz(int [][] mat){
        for(int fila = 0 ; fila<MAXFILAS; fila++){
            for(int columna = 0 ; columna<MAXCOLUMNAS ; columna++){
                System.out.println(mat[fila][columna]);
            }
        }
    }

    public static int obtener_dimension(){
        int valor = 0;
        boolean esValido = false;

        BufferedReader valor_entrada = new BufferedReader(new InputStreamReader(System.in));
        while(!esValido){
            try{
                System.out.println("ingrese dimension de secuencia que quiere eliminar");
                valor = Integer.valueOf(valor_entrada.readLine());
                esValido = true;
            }
            catch(Exception exc){
                System.out.println(exc);
            }
        }
        return valor;
    }

    public static void buscar_secuencias(int[][] mat, int dimension_sec){
        for(int fila = 0 ; fila<MAXCOLUMNAS ; fila++){
            int ini_sec = -1;
            int fin_sec = -1;

            while(ini_sec<MAXCOLUMNAS){
                ini_sec = buscar_ini(mat[fila], fin_sec + 1);
                if(ini_sec < MAXCOLUMNAS){
                    fin_sec = buscar_fin(mat[fila], ini_sec);

                    int calculo_dim = fin_sec - (ini_sec + 1);
                    
                    if(calculo_dim == dimension_sec){
                        eliminar_secuencia(mat[fila], ini_sec, fin_sec);
                    }
                }
            }
        }
    }

    public static int buscar_ini(int[] arr, int d){
        while(d<MAXCOLUMNAS && arr[d]==SEPARADOR){
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

    public static void eliminar_secuencia(int[] arr, int ini, int fin){
        int i = ini;
        while(i<=fin){
            corrimiento_izquierda(arr, ini);
            i++;
        }
    }

    public static void corrimiento_izquierda(int[] arr, int pos){
        while(pos<MAXCOLUMNAS-1){
            arr[pos] = arr[pos+1];
            pos++;
        }

    }


}
