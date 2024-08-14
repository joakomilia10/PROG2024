public class P5_ejercicio3 {
    final static int promedio_calculado = 17;
    public static void main(String[] args){
        int[] arrValores = {0, 5, 8, 12, 15, 18, 25, 29, 32, 35};

        int elementos_may_prom = calcular_elementos(arrValores);
        System.out.println("la cantidad de elementos mayores al promedio son" + '\t' + elementos_may_prom);
    }

    public static int calcular_elementos(int[] arrValores){
        int elementos_may_prom = 0;
        for(int pos = 0 ; pos < 10 ; pos++){
            if(arrValores[pos] > promedio_calculado){
                elementos_may_prom++;
            }
        }

        return elementos_may_prom;
    }
}
