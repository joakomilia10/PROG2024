public class P5_ejercicio22 {
    final static int MAX = 10;
    public static void main(String[] args){
        int[] arrValores = {0, 5, 8, 12, 15, 18, 25, 29, 32, 35};
        mostrarArreglo(arrValores);

        int pos = 0;
        while (pos < MAX) {
            int posicion_par = buscarPares(arrValores);
            corrimientoIzquierda(arrValores, posicion_par);
            pos++;
            mostrarArreglo(arrValores);
        }

    }

    public static void mostrarArreglo(int[] arr){
        for(int pos = 0 ; pos < MAX ; pos++){
            System.out.println("-->" + "|" + arr[pos]);
        }
    }

    public static int buscarPares(int[] arr){
        int pos = 0;
        while (pos < MAX && arr[pos] %2 != 0) {
            pos++;
        }
        return pos;
    }

    public static void corrimientoIzquierda(int[] arr, int posicion){
        while (posicion<MAX-1) {
            arr[posicion] = arr[posicion+1];
            posicion++;
        }
    }
}
