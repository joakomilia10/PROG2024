public class P5_ejercicio23 {
    final static int MAX = 20;
    final static int SEPARADOR = 0;
    public static void main(String[] args){
        int arrValores[] = {0, 2, 5, 7, 0, 10, 13, 15, 16, 19, 0, 21, 24, 27, 29, 0, 33, 36, 38, 40};

        int ini_secuencia = -1;
        int fin_secuencia = -1;

    
        ini_secuencia = buscarIni(arrValores, fin_secuencia + 1);
        fin_secuencia = buscarFin(arrValores, ini_secuencia);

        mostrarSecuencia(arrValores,ini_secuencia,fin_secuencia);
   

    }

    public static int buscarIni(int[] arr, int d){
        while(d < MAX && arr[d] == SEPARADOR){
            d++;
        }
        return d;
    }

    public static int buscarFin(int[] arr, int d){
        while(d<MAX && arr[d] != SEPARADOR){
            d++;
        }
        return d-1;
    }

    public static void mostrarSecuencia(int[] arr, int d, int h){
        for(int i = d ; i<=h ; i++){
            System.out.println("las posiciones de la primer secuencia son" + "|" + i + "|");
        }
    }

}