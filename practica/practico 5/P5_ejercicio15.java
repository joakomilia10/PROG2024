public class P5_ejercicio15 {
    final static int MAX = 10;
    public static void main(String[] args){
        int[] arrValores = {0, 5, 8, 12, 15, 18, 25, 29, 32, 35};
        mostrarArreglo(arrValores);

        int posicion = 7;
        int nuevo_valor = 28;
        corrimientoDerecha(arrValores,posicion);
        arrValores[posicion] = nuevo_valor;
        mostrarArreglo(arrValores);
    }

    public static void mostrarArreglo(int[] arr){
        for(int pos = 0 ; pos<MAX ; pos++){
            System.out.println("-->" + '|' + arr[pos]);
        }
    }

    public static void corrimientoDerecha(int[] arr, int posicion){
        int i = MAX-1;
        while(i > posicion){
            arr[i] = arr[i-1];
            i--;
        }
    }


}
