import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2_ejercicio4 {
    public static void main(String[] args){
        int numero ;
        final int numero_MIN = 99;
        final int numero_MAX = 1000;
        final int numero_negativo_MIN = -99;
        final int numero_negativo_MAX = -1000;

        try{
            BufferedReader entrada_numero = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un numero de 3 digitos ");
            numero = Integer.valueOf(entrada_numero.readLine());

            if(((numero > numero_MIN) && (numero < numero_MAX)) || ((numero > numero_negativo_MAX) && (numero < numero_negativo_MIN))) {
                System.out.println(numero);
            }
            else{
                System.out.println("el numero no es de 3 digitos");
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
