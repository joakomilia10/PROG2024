public class P6_ejercicio11 {
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

        buscar_secuencias(Matriz);
    }

    public static void mostrar_matriz(int[][] mat){
        for(int fila = 0 ; fila<MAXFILAS ; fila++){
            for(int columna = 0 ; columna < MAXCOLUMNAS ; columna++){
                System.out.println(mat[fila][columna]);
            }
        }
    }

    public static void buscar_secuencias(int[][] arr){
        for(int fila = 0 ; fila<MAXFILAS ; fila++){
            int ini_sec = -1;
            int fin_sec = -1;
            int contador = 0;
            int ini_sec_MAX = 0;
            int fin_sec_MAX = 0;
            
            while(ini_sec<MAXCOLUMNAS){
                ini_sec = buscar_ini(arr[fila], fin_sec + 1);
                if(ini_sec<MAXCOLUMNAS){
                    fin_sec = buscar_fin(arr[fila], ini_sec);
                    int total_sec = calcular_sec(arr[fila],fila,ini_sec,fin_sec);

                    if(total_sec > contador){
                        contador = total_sec;
                        ini_sec_MAX = ini_sec;
                        fin_sec_MAX = fin_sec;
                    }
                }
            }
            System.out.println(ini_sec_MAX + "|" + fin_sec_MAX);
        }
    }

    public static int buscar_ini(int[] arr, int d){
        while(d<MAXCOLUMNAS && arr[d] == SEPARADOR){
            d++;
        }
        return d;
    }

    public static int buscar_fin(int[] arr, int d ){
        while(d<MAXCOLUMNAS && arr[d] != SEPARADOR){
            d++;
        }
        return d-1;
    }

    public static int calcular_sec(int[] arr, int fila, int ini, int fin){
        int suma = 0;
        while(ini <= fin){
            suma += arr[ini];
            ini++;
        }
        return suma;
    }
}
