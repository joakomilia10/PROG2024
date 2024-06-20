public class parcial2024 {
    final static int SEPARADOR = 0;
    final static int N = 3;
    final static int M = 20;

    public static void main(String[] args) {
        int[][] matriz = {
                {0, -8, 67, 0, 14, 0, -4, 33, 0, 5, 98, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 25, 25, 0, -5, 3, 0, 25, 44, 44, 0, -4, 1, 0, 0, 0, 0, 0, 0},
                {0, 44, 44, 44, 0, -7, 15, 0, -4, 9, 0, 12, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        recorrerMatriz(matriz);
        for (int i = 0; i < N; i++) {

            mostrarArr(matriz[i]);
            System.out.println();
        }

    }

    private static void recorrerMatriz(int[][] arr) {
        int totalPixeles = 0, mayorPixeles = 0,pixeles,filaMayor=0;
        for (int i = 0; i < N; i++) {
            pixeles = procesarDispositivo(arr[i]);
            totalPixeles += pixeles;
            if (pixeles > mayorPixeles) {
                mayorPixeles = pixeles;
                filaMayor = i;
            }
        }
        System.out.println(totalPixeles);
        System.out.println(filaMayor);

    }

    private static int procesarDispositivo(int[] arr) {
        int ini = 0, fin = -1, cantidadPixeles = 0;

        while (ini < M) {
            ini = buscarIni(arr,fin + 1 );

            if(ini < M){
                fin = buscarFin(arr,ini);
                if(arr[ini]<0){
                    int cantCorrimiento = -arr[ini] - 2;
                    cantidadPixeles += -arr[ini];
                    int numeroRep= arr[ini+1];
                    fin=descomprimir(arr,ini,fin,cantCorrimiento,numeroRep);


                }
            }
        }
        return cantidadPixeles;
    }

    private static int descomprimir(int[] arr, int ini, int fin, int cantCorrimiento, int numeroRep) {
        int i = cantCorrimiento;
        int iniAux = ini;
        while (i != 0) {
            corrimientoderecha(arr,ini);
            ini++;
            fin++;
            i--;
        }
        for(int j = iniAux;j<=fin;j++){
            arr[j] = numeroRep;
        }

        return fin;
    }

    private static void corrimientoderecha(int[] arr, int pos) {
        int ini = M-1;

        while (ini > pos) {
            arr[ini] = arr[ini-1];
            ini--;
        }
    }

    private static void mostrarArr(int[] ints) {
        for (int i = 0; i < M; i++) {
            System.out.print(ints[i] + "|");
        }
    }

    private static int buscarFin(int[] arrPedido, int pos) {
        while(pos<M && arrPedido[pos] !=0){
            pos++;
        }
        return pos-1;
    }

    public static int buscarIni(int[]arrPedido,int pos){
            while(pos < M && arrPedido[pos] == 0){
            pos++;
        }
        return pos;
    }
}
