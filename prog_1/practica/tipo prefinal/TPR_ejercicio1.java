                            //EJERCICIO TIPO PREFINAL 1


public class TPR_ejercicio1 {
    public static final int MAX_C = 15;
    public static final int MAX_F = 3;

    public static final int SEPARADOR = 0;

    public static final int A_MAX = 3;

    public static final int X = 600;
     
    public static void main(String[] args){
        int[][] matriz ={       {0 , 0   , 150 , 200 , 165 , 0   , 154 , 352 , 240 , 256 , 0   , 900 , 750 , 0   , 0},
                                {0 , 940 , 105 , 265 , 845 , 215 , 0   , 245 , 765 , 348 , 0   , 741 , 125 , 541 , 0},
                                {0 , 851 , 543 , 625 , 845 , 914 , 0   , 754 , 184 , 452 , 637 , 917 , 0   , 0   , 0}
        };

        int[] A1 = {1,2,0};

        int[] A2 = {3,0,0};

        sacar_estadisticas(matriz,A1,A2);

    }

    public static void sacar_estadisticas(int[][] mat, int[] A1, int[] A2){
        for(int fila = 0 ; fila < MAX_F ; fila++){
            boolean estadistica = buscar_estadistica(fila,A1);

            if(estadistica){
                promedio_may_ventas(mat[fila]);
            }
            else{
                promedio_diario(mat[fila]);
            }
        }
    }

    public static boolean buscar_estadistica(int fila, int[] A1){
        boolean estadistica = false;
        int i = 0;
        while(i<A_MAX && estadistica == false){
            if(fila == A1[i-1]){
                estadistica = true;
            }
            i++;
        }
        return estadistica;
    }

    /////////////////////////////////////////////////////////////////////////////////

    public static void promedio_may_ventas(int[] mat){
        int total_ventas = 0;
        int cant_dias = 0;

        for(int columna = 0 ; columna < MAX_C ; columna++){
            int ini_sec = -1;
            int fin_sec = -1;
            while(ini_sec < MAX_C){
                ini_sec = buscar_ini(mat, fin_sec+1);
                if(ini_sec<MAX_C){
                    fin_sec = buscar_fin(mat, ini_sec);

                    total_ventas += obtener_venta(mat,ini_sec,fin_sec);
                    cant_dias++;
                }
            }
        }
        int promedio = (total_ventas / cant_dias );
        System.out.println(promedio);
    }
    
    public static int obtener_venta(int[] mat, int d , int h){
        int mayor_venta = 0;
        while(d <= h){
            if(mat[d] > mayor_venta){
                mayor_venta = mat[d];
            }
        }
        return mayor_venta;
    }

    //////////////////////////////////////////////////////////////////////////

    public static void promedio_diario(int[] mat){
        for(int columna = 0 ; columna < MAX_C ; columna++){
            int ini_sec = -1;
            int fin_sec = -1;

            boolean promedio = true;
            while(ini_sec < MAX_C && promedio == true){
                ini_sec = buscar_ini(mat, fin_sec+1);
                if(ini_sec < MAX_C){
                    fin_sec = buscar_fin(mat, ini_sec);

                    promedio = calcular_promedio(mat, ini_sec, fin_sec);

                }
            }

            if(promedio){
                System.out.println("se cumplio el promedio diario");
            }
            else{
                System.out.println("no se cumplio el promedio diario");
            }
        }
    }

    public static boolean calcular_promedio(int[] mat, int d , int h){
        boolean promedio = true;
        int total_ventas = 0;
        int cant_ventas = 0;
        while(d<=h){
            total_ventas += mat[d];
            d++;
            cant_ventas++;
        }
        if(total_ventas/cant_ventas > X){
            promedio = true;
        }
        else{
            promedio = false;
        }

        return promedio;
    }

    //////////////////////////////////////////////////////////////////////////

    public static int buscar_ini(int[] mat, int d){
        while(d<MAX_C && mat[d] == SEPARADOR){
            d++;
        }
        return d;
    }

    public static int buscar_fin(int[] mat, int d){
        while(d<MAX_C && mat[d] != SEPARADOR){
            d++;
        }
        return d-1;
    }


}
