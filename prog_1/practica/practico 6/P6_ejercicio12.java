                                //no salio
                                //no salio
                                //no salio
                                //no salio
                                //no salio
                                //no salio

public class P6_ejercicio12 {
    public static final int MAXFILAS = 5;
    public static final int MAXCOLUMNAS = 10;
    public static final int SEPARADOR = ' ';
    public static void main(String[] args){
        char[][] Matriz = {      {' ' ,  'h',  'o',  'l',  'a',  ' ',  'g',  'a',  'y', ' '},
                                
                                {' ' ,  'd',  'a',  'l',  'e',  ' ',  'p',  'a',  'z', ' '},

                                {' ' ,  'y',  'o',  ' ',  'y',  ' ',  'v',  'o',  's', ' '},

                                {' ' ,  'j',  'o',  's',  'e',  ' ',  'g',  'a',  'y', ' '},

                                {' ' ,  'm',  'i',  'l',  'a',  ' ',  'g',  'o',  'd', ' '},
        };

        mostrar_matriz(Matriz);
        buscar_secuencias(Matriz);
    }

    public static void mostrar_matriz(char[][] arr){
        for(int fila = 0 ; fila<MAXFILAS ; fila++){
            for(int columna = 0 ; columna<MAXCOLUMNAS ; columna++){
                System.out.println(arr[fila][columna]);
            }
        }
    }

    public static void buscar_secuencias(char[][] mat){
        for(int fila = 0 ; fila<MAXFILAS ; fila++){
            int ini_sec = MAXCOLUMNAS;
            int fin_sec = MAXCOLUMNAS;

            int contador = 0;

            while(ini_sec>-1){
                ini_sec = buscar_ini(mat[fila],fin_sec-1);
                if(ini_sec>-1){
                    fin_sec = buscar_fin(mat[fila],ini_sec);
                    contador++;
                    if(contador == 2){
                        imprimir_secuencia(mat[fila],ini_sec,fin_sec);
                    }
                }
            }
        }
    }

    public static int buscar_ini(char[] arr,int d){
        while(d>-1 && arr[d] == SEPARADOR){
            d--;
        }
        return d;
    }

    public static int buscar_fin(char[] arr, int d){
        while(d > -1 && arr[d] != SEPARADOR){
            d--;
        }
        return d+1;
    }

    public static void imprimir_secuencia(char[] arr, int ini, int fin){
        while(ini < fin){
            System.out.println(arr[ini]);
            ini++;
        }
    }
}
