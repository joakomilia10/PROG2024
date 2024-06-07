public class P5_ejercicio25 {
    public static final int MAX = 20;
    public static final int SEPARADOR = 0;
    public static void main(String[] args){
        int[] arrValores = {0, 2, 5, 7, 0, 10, 13, 15, 16, 19, 0, 21, 24, 27, 29, 0, 33, 36, 38, 0};
        imprimirSecuencia(arrValores);
    }

    public static void imprimirSecuencia(int[] arr){
        int ini_secuencia = -1;
        int fin_secuencia = -1;

        int sec = 0;
        while (ini_secuencia < MAX-1){
            ini_secuencia = buscar_ini(arr,fin_secuencia+1);
            fin_secuencia = buscar_fin(arr,ini_secuencia);
            sec++;
            
            if(sec == 3){
                System.out.println("la tercer secuencia es de:" + "\t" +ini_secuencia+ "a" + "\t" +fin_secuencia);
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
}
