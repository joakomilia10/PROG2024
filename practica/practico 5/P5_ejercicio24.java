public class P5_ejercicio24 {
    final static int MAX = 20;
    final static int SEPARADOR = 0;
    public static void main(String[] args){
        int[] arrValores = {0, 2, 5, 7, 0, 10, 13, 15, 16, 19, 0, 21, 24, 27, 29, 0, 33, 36, 38, 0};
        imprimirSecuenciaMayor(arrValores);
    }

    public static void imprimirSecuenciaMayor(int[] arr){
        int ini_secuencia = -1;
        int fin_secuencia = -1;
        int secuencia_mayor = -1;
        int ini_secuencia_mayor = -1;
        int fin_secuencia_mayor = -1;

        while(ini_secuencia < MAX-1){
            ini_secuencia = buscar_ini(arr, fin_secuencia+1);
            fin_secuencia = buscar_fin(arr,ini_secuencia);
            
            if(ini_secuencia < MAX){
                int sumar_elementos = sumarElementos(arr,ini_secuencia,fin_secuencia);
                if(sumar_elementos > secuencia_mayor){
                    secuencia_mayor = sumar_elementos;
                    ini_secuencia_mayor = ini_secuencia;
                    fin_secuencia_mayor = fin_secuencia;
                    
                }   
            }
        }

        System.out.println("la secuencia de mas valor es de " + ":"+ ini_secuencia_mayor + "a" + fin_secuencia_mayor);

    }

    public static int buscar_ini(int[] arr, int d){
        while(d<MAX && arr[d]==SEPARADOR){
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

    public static int sumarElementos(int[] arr, int d, int h){
        int suma = 0;
        while(d <= h){
            suma += arr[d];
            d++;
        }
        return suma;
    }
}
