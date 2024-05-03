import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio12 {
    public static void main(String[] args){
        int primer_numero ;
        int segundo_numero ;

        try{
        BufferedReader numero_ingresado1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese el primer numero");
        primer_numero = Integer.valueOf(numero_ingresado1.readLine());

        BufferedReader numero_ingresado2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese el segundo numero");
        segundo_numero = Integer.valueOf(numero_ingresado2.readLine());

        for(int i = 0 ; i < 10 ; i++){
            primer_numero++;
        };

        for(int i = 10 ; i > 0 ; i--){
            segundo_numero--;
        }

        System.out.println(primer_numero);
        System.out.println(segundo_numero);

        } catch(Exception exc){
            System.out.println(exc);
        }
    }
}
