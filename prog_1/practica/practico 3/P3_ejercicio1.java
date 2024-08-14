import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3_ejercicio1 {
    public static void main(String[] args){
        int numero_ingresado = obtener_valor();
        int segundo_ingresado = ' ';

        if(numero_ingresado != 0){
            try{
                BufferedReader segundo_entrada = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("ingrese el numero q quiere mostrar");
                segundo_ingresado = Integer.valueOf(segundo_entrada.readLine());

                System.out.println(segundo_ingresado);
            }
            catch(Exception exc){
                System.out.println(exc);
            }
        }
        else{
            System.out.println("el digito 0 no esta avilitado");
        }
        
    }

    public static int obtener_valor() {
        int numero_ingresado = ' ';

        try{
            BufferedReader numero_entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un numero distinto a 0");
            numero_ingresado = Integer.valueOf(numero_entrada.readLine());

        }
        catch(Exception exc){
            System.out.println(exc);
        }

        return numero_ingresado;
    }
}
