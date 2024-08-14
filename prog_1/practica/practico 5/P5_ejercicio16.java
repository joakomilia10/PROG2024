public class P5_ejercicio16 {
    final static int MAX = 10;
    public static void main(String[] args){
        int[] arrValores = {0, 5, 8, 12, 15, 18, 25, 29, 32, 35};

        mostrarArreglo(arrValores);
        int posicion = 4;
        correrIzquierda(arrValores, posicion);
        mostrarArreglo(arrValores);
    }
    
    public static void mostrarArreglo(int[] arrValores){
        for(int pos = 0 ; pos<MAX ; pos++){
            System.out.println("-->"+ "|" + arrValores[pos]);
        }
    }

    public static void correrIzquierda(int[] arrValores, int posicion){
        while(posicion < MAX-1){
            arrValores[posicion] = arrValores[posicion + 1];
            posicion++;
        }
    }
}
