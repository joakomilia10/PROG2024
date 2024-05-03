import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio9 {
    public static void main(String[] args){
        int numero_entrada ;
        int primer_divisor = 2;
        int segundo_divisor = 3;
        int tercer_divisor = 4;

        try{
            BufferedReader numero_ingresado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un numero:");
            numero_entrada = Integer.valueOf(numero_ingresado.readLine());

            int primer_resultado = (numero_entrada / primer_divisor);
            int segundo_resultado = (numero_entrada / segundo_divisor);
            int tercer_resultado = (numero_entrada / tercer_divisor);

            System.out.println(primer_resultado + "\n" + segundo_resultado + "\n" + tercer_resultado);
        }
        catch(Exception exc){
            System.out.println("mal" + exc);
        }
    }
}
