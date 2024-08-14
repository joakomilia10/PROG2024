
public class TP_ejercicio1 {
    public static final int MAX = 20;
    public static final int SEPARADOR = 0;
    public static void main(String[] args){
        int[] arrValores = {0, 3, 5, 7, 0, 8, 11, 13, 14, 0, 17, 22, 24, 25, 0, 30, 33, 35, 38, 0};
        mostrar_arreglo(arrValores);
        eliminar_pares(arrValores);
        mostrar_arreglo(arrValores);
    }
    
    public static void mostrar_arreglo(int[] arr){
        for(int i = 0 ; i<MAX ; i++){
            System.out.println(arr[i] + "|" );
        }
    }

    public static void eliminar_pares(int[] arr){
        int ini_sec = -1;
        int fin_sec = -1;
        while(ini_sec < MAX){
            ini_sec = buscar_ini(arr, fin_sec+1);
            if(ini_sec<MAX){
                fin_sec = buscar_fin(arr, ini_sec);
                System.out.println("hhhhhhhhhhhhhhhhhhhhhhh");
                buscar_pares(arr, ini_sec, fin_sec);
            }

        
        }
    }

    public static int buscar_ini(int[] arr, int h){
        while(h<MAX && arr[h]==SEPARADOR){
            h++;
        }
        return h;
    }

    public static int buscar_fin(int[] arr, int h){
        while(h<MAX && arr[h] != SEPARADOR){
            h++;
        }
        return h-1;
    }

    public static void buscar_pares(int[] arr, int d, int h){
        while(d<=h){
            if(arr[d]%2 == 0){
                eliminar_secuencia(arr,d,h);

            }
            d++;
        }
    }

    public static void eliminar_secuencia(int[] arr, int d, int h){
        int  i = d;
        while(i <= h){
            corrimiento_izquierda(arr, d);
            i++;
        }
        
    }

    public static void corrimiento_izquierda(int[] arr, int pos){
        while(pos<MAX - 1){
            arr[pos] = arr[pos]+1;
            pos++;
        }
    }
}
