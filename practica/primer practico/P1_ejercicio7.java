import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1_ejercicio7 {
    public static void main(String[] args){
        int primer_numero;
        int segundo_numero;
        int tercer_numero;

        try{
            BufferedReader primer_numero_ingresado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el primer numero:");
            primer_numero = Integer.valueOf(primer_numero_ingresado.readLine());

            BufferedReader segundo_numero_ingresado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el segundo numero:");
            segundo_numero = Integer.valueOf(segundo_numero_ingresado.readLine());

            BufferedReader tercer_numero_ingresado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el tercer numero:");
            tercer_numero = Integer.valueOf(tercer_numero_ingresado.readLine());

            int primera_operacion = (primer_numero / segundo_numero) ;
            int resultado_final = (primera_operacion - tercer_numero);
            
            System.out.println("el resultado es:" + "\t" + resultado_final);
        }
        catch(Exception exc){
            System.out.println("mal" + exc );
        }
    }
}
