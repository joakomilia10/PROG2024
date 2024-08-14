
                //para ser comprimida todos los 
                    //elementos de la secuencia
                        //deben ser iguales

                //se comprime poniendo en el ini
                    //de la secuencia el numero
                        //negado de la cantidad de
                            //ocurrencias y seguido
                                //el valor q se repite
                
                // la matriz ya esta comprimida
                    // hay que volverla a la normalida

                //mostrar cantidad de elementos comprimidos
                    //mostrar fila de mayor cantidad de 
                        //elementos comprimidos
                



public class TR_ejercicio1 {
    public static final int MAXFILAS = 3;
    public static final int MAXCOLUMNAS = 20;
    public static final int SEPARADOR = 0;
    public static void main (String[] args){
        int [][] matriz = {         {0 ,-8 ,67 ,0 ,14 ,0 ,-4, 33, 0, 5 ,98 ,0, 0, 0, 0 ,0, 0, 0, 0, 0},
                                    {0 ,0 ,25, 25 ,0 ,-5, 3, 0, 25, 44, 44 ,0 ,-4, 1 ,0 ,0, 0 ,0, 0, 0},
                                    {0 ,44 ,44 ,44 ,0 ,-7 ,15 ,0 ,-4 ,9 ,0, 12, 0 ,0 ,0 ,0, 0 ,0, 0 ,0}
        };

        mostrar_matriz(matriz);

        descomprimir_secuencia(matriz);

        mostrar_matriz(matriz);

        cantidad_comprimidos(matriz);

        fila_comprimida(matriz);
    }

    public static void mostrar_matriz(int[][] mat){
        for(int fila = 0 ; fila < MAXFILAS ; fila++){
            for(int columna = 0 ; columna<MAXCOLUMNAS ; columna++){
                System.out.println(mat[fila][columna]);
            }
        }
    }

    public static void descomprimir_secuencia(int[][] mat){
        for(int fila = 0 ; fila < MAXFILAS ; fila++){
            int ini_sec = -1;
            int fin_sec = -1;

            

            while(ini_sec<MAXCOLUMNAS){
                ini_sec = buscar_ini(mat[fila], fin_sec+1);
                if(ini_sec<MAXCOLUMNAS){
                    fin_sec = buscar_fin(mat[fila], ini_sec);
                    
                    if(mat[fila][ini_sec] < 0){
                        descomprimir(mat[fila],ini_sec);
                    }
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

    public static void descomprimir(int[] arr, int ini){

        int cant_elementos = -(arr[ini]);
        
        int valor_elementos = arr[ini+1];

        int i = 0;

        arr[ini] = valor_elementos;

        while(i<cant_elementos-2){
            corrimiento_derecha(arr,ini,valor_elementos);
            i++;
        }
    }

    public static void corrimiento_derecha(int[] arr, int pos, int numero){
        int i = MAXCOLUMNAS-1;
        while(i>pos){
            arr[i] = arr[i-1];
            i--;
        }
    }

    public static void cantidad_comprimidos(int[][] mat){
        int cantidad = 0;

        for(int fila = 0 ; fila<MAXFILAS ; fila++){
            for(int columna = 0; columna<MAXCOLUMNAS ; columna++){
                if(mat[fila][columna] < 0){
                    cantidad += mat[fila][columna];
                }
            }
        }

        System.out.println("la cantidad de elementos comprimidos son :  " + cantidad);
    }

    public static void fila_comprimida(int[][] mat){
        int fila_comp = 0;
        int medidor = 0;
        for(int fila = 0 ; fila<MAXFILAS ; fila++){
            for(int columna = 0 ; columna<MAXCOLUMNAS ; columna++){
                if(mat[fila][columna] < medidor){
                    medidor = mat[fila][columna];
                    fila_comp = fila;
                }
            }
        }
        System.out.println("la fila mas comprimida es la fila :  " + fila_comp);
    }
}

