//          NO ME SALIO             //
//          NO ME SALIO             //
//          NO ME SALIO             //
//          NO ME SALIO             //
//          NO ME SALIO             //
//          NO ME SALIO             //
//          NO ME SALIO             //
//          NO ME SALIO             //
//          NO ME SALIO             //
//          NO ME SALIO             //


public class P5_ejercicio29 {
    public static final int MAX = 20;
    public static final int SEPARADOR = 0;
    public static void main(String[] args){
        int[] arrValores = {0, 2, 5, 7, 0, 10, 13, 15, 16, 19, 0, 29, 27, 24, 21, 0, 33, 36, 38, 0};
        mostrarArreglo(arrValores);
        eliminar_descendiente(arrValores);
        mostrarArreglo(arrValores);
    }
    
    public static void mostrarArreglo(int[] arr){
        for(int i = 0; i<MAX ; i++){
            System.out.println(arr[i] + "|");
        }
    }

    public static void eliminar_descendiente(int[] arr){
        int ini_secuencia = -1;
        int fin_secuencia = -1;

        while(ini_secuencia<MAX){
            ini_secuencia = buscar_ini(arr,fin_secuencia+1);
            if(ini_secuencia<MAX){
                fin_secuencia = buscar_fin(arr,ini_secuencia);
            }

            boolean verificacion = controlSecuencia(arr,ini_secuencia,fin_secuencia);
            

            if(verificacion){
                eliminarSecuencia(arr,ini_secuencia,fin_secuencia);
                
                fin_secuencia = ini_secuencia;
            }

        }
    }

    public static int buscar_ini(int[] arr, int d){
        while(d<MAX && arr[d] == SEPARADOR){
            d++;
        }
        return d;
    }

    public static int buscar_fin(int[] arr, int d){
        while(d<MAX && arr[d] != SEPARADOR){
            d++;
        }
        return d-1;
    }

    public static boolean controlSecuencia(int[] arr, int d, int h){
        boolean descendente = false;
        while(d<=h){
            if(arr[d] < arr[d-1]){
                if(d==h){
                    descendente = true;
                }
            }
            d++;
        }
        return descendente;
    }

    public static void eliminarSecuencia(int[] arr, int ini, int fin){
        int i = ini;
        while(i <= fin){
            corrimiento_Izq(arr, ini);
            i++;
        }
    }

    public static void corrimiento_Izq(int[] arr, int pos){
        while(pos<MAX-1){
            arr[pos] = arr[pos]+1;
            pos++;
        }
    }


}
