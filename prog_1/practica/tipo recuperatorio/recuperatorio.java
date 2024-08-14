public class recuperatorio {
    public static final int MAX_F = 3;;
    public static final int MAX_C = 20;
    public static final int R = 2;
    public static final int MAX_B = 3;
    
    int cant_eliminadas = 0;

    public static void main(String[] args){
        char [][] matriz = {        {'x' , 't' , 'a' , 'C' ,'M' ,'O' ,'t' , 'a' , 'a', 't' , 'O' ,'C' ,'t' ,'t' ,'a' , 'O' , 'M' ,'C' , 't', 'x'},
                                    {'x' , 'r' , 'r' , 'r' ,'C' ,'C' ,'O' , 'O' , 'r', 'r' , 'C' ,'r' ,'G' ,'G' ,'G' , 'r' , 'r' ,'x' , 'x', 'x'},
                                    {'x' , 'm' , 'G' , 'm' ,'h' ,'h' ,'L' , 'G' , 'G', 'O' , 'h' ,'h' ,'m' ,'m' ,'O' , 'B' , 'M' ,'C' , 'x', 'x'}
        };

        char [] b = {'C','O','L'};

        mostrar_matriz(matriz);

        eliminar_maleza(matriz,b);

        mostrar_matriz(matriz);

    }

    public static void mostrar_matriz(char[][] mat){
        for(int fila = 0 ; fila < MAX_F ; fila++){
            for(int columna = 0 ; columna < MAX_C ; columna++){
                System.out.println(mat[fila][columna]);
            }
        }
    }

    public static void eliminar_maleza(char[][] mat, char[] arrB){
        for(int fila = 0 ; fila<MAX_F ; fila++){
            int ini_sec = -1;
            int fin_sec = -1;
            while(ini_sec<MAX_C){
                ini_sec = buscar_ini(mat[fila], fin_sec+1);
                if(ini_sec < MAX_C){
                    fin_sec = buscar_fin(mat[fila], ini_sec);
                    int cant_elementos = fin_sec - ini_sec + 1 ;
                    if(cant_elementos > R){
                        eliminar_no_beneficiosa(mat[fila],ini_sec,fin_sec,arrB);
                        fin_sec = ini_sec -1;
                    }
                }
            }
        }
    }

    public static int buscar_ini(char[] arr, int d){
        while(d<MAX_C && (arr[d] > 'a' && arr[d] < 'z')){
            d++;
        }
        return d;
    }

    public static int buscar_fin(char[] arr, int d){
        while(d<MAX_C && (arr[d] > 'A' && arr[d] < 'Z')){
            d++;
        }
        return d-1;
    }

    public static void eliminar_no_beneficiosa(char[] arr, int ini, int fin, char[] arrB){
        while(ini<fin){
            boolean maleza = buscar_maleza(arrB, arr[ini]);

            if(maleza){
                corrimiento_izquierda(arr, ini);
            }
            ini++;
        }
    }

    public static boolean buscar_maleza(char[] arrB, char planta){
        boolean maleza = true;
        int i = 0;
        while(i<MAX_B){
            if(arrB[i] == planta){
                maleza = false;
                i = MAX_B;
            }
            i++;
        }

        return maleza;
    }

    public static void corrimiento_izquierda(char[] arr, int pos){
        while(pos<MAX_C-1){
            arr[pos] = arr[pos+1];
            pos++;
        }
    }

}
