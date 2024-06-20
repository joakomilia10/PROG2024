                                //no pude
                                //no pude
                                //no pude
                                //no pude
                                //no pude
                                //no pude


public class P6_ejercicio14 {
    public static final int MAXFILAS = 5;
    public static final int MAXCOLUMNAS = 10;
    public static final char SEPARADOR = ' ';
    public static void main(String[] args){
        char[][] Matriz = {     {' ' ,  'j',  'o',  's',  'e',  'g',  'g',  'a',  'y', ' '},
                                
                                {' ' ,  'j',  'o',  's',  'e',  'g',  'g',  'a',  'y', ' '},

                                {' ' ,  'j',  'o',  's',  'e',  'g',  'g',  'a',  'y', ' '},

                                {' ' ,  'j',  'o',  's',  'e',  'g',  'g',  'a',  'y', ' '},

                                {' ' ,  'j',  'o',  's',  'e',  'g',  'g',  'a',  'y', ' '},
        };

        mostrar_matriz(Matriz);

        eliminar_patron(Matriz);

    }

    public static void mostrar_matriz(char[][] mat){
        for(int fila = 0 ; fila < MAXFILAS ; fila++){
            for(int columna = 0 ; columna < MAXCOLUMNAS ; columna++){
                System.out.println(mat[fila][columna]);
            }
        }
    }

    public static void eliminar_patron(char[][] mat){
        for(int fila = 0 ; fila<MAXFILAS; fila++){
            int ini_sec = -1;
            int fin_sec = -1;

            while(ini_sec<MAXCOLUMNAS){
                ini_sec = buscar_ini(mat[fila], fin_sec+1);
                if(ini_sec<MAXCOLUMNAS){
                    fin_sec = buscar_fin(mat[fila], ini_sec);

                    buscar_patron(mat[fila], ini_sec, fin_sec);

                }
            }
        }
    }

    public static int buscar_ini(char[] arr, int d){
        while(d<MAXCOLUMNAS && arr[d] == SEPARADOR){
            d++;
        }
        return d;
    }

    public static int buscar_fin(char[] arr, int d){
        while(d<MAXCOLUMNAS && arr[d] != SEPARADOR){
            d++;
        }
        return d-1;
    }


    public static void buscar_patron(char[] arr, int ini, int fin){
        while(ini <= fin){
            if(arr[ini] == arr[ini+1]){
                    int pos_dos = arr[ini+1];
                    corrimiento_izquierda(arr,ini,pos_dos);
                }
                
            }
            ini++;
    }
    

    public static void corrimiento_izquierda(char[] arr, int pos, int pos2){
        while(pos<MAXCOLUMNAS-1){
            System.out.println();
        }

    }


}
