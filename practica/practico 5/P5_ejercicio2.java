public class P5_ejercicio2 {
    final static int calculo_promedio = 10;
    public static void main(String[] args){
        int[] arrValores = {0, 5, 8, 12, 15, 18, 25, 29, 32, 35};

        int resultado = obtenerPromedio(arrValores);
        System.out.println("el promedio de este array es" + resultado);

    }

    public static int obtenerPromedio(int[] arrValores){
        int resultado = 0;
        int suma = 0;

        for(int pos = 0 ; pos<10 ; pos++){
            suma += arrValores[pos];  
        }

        resultado = (suma/calculo_promedio);
        return resultado;
    }
}
