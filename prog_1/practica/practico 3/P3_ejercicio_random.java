import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3_ejercicio_random {
    public static void main(String[] args){
        char letra = obtener_letra();
        int resultado = ' ';

        if(letra == 'a'){
            int primer_numero = obtener_primer_numero();
            int segundo_numero = obtener_segundo_numero();
            if((primer_numero < 10) && (segundo_numero < 10)){
                resultado = (primer_numero + segundo_numero);
                System.out.println(resultado);
            }
            else{
                System.out.println("los numeros tienen que ser menores a 10");
            }
        }
        else if(letra == 'b'){
            int primer_numero = obtener_primer_numero();
            int segundo_numero = obtener_segundo_numero();
            if((primer_numero < 10) && (segundo_numero < 10)){
                resultado = (primer_numero - segundo_numero);
                System.out.println(resultado);
            }
            else{
                System.out.println("los numeros tienen que ser menores a 10");
            }
        }
        else{
            System.out.println("ingrese nuevamente la letra");
        }
        
    }

    public static char obtener_letra(){
        char letra_ingresada = ' ';

        BufferedReader letra_entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("ingrese a si quiere realizar una suma o ingrese b si quiere realizar una resta");
            letra_ingresada = letra_entrada.readLine().charAt(0);
        }
        catch(Exception exc){
            System.out.println(exc);
        }

         return letra_ingresada;

    }

    public static int obtener_primer_numero(){
        int primer_numero_ingresado = ' ';

        BufferedReader numero_entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("ingrese el primer valor");
            primer_numero_ingresado = Integer.valueOf(numero_entrada.readLine());
        }
        catch(Exception exc){
            System.out.println(exc);
        }

        return primer_numero_ingresado;
    }

    public static int obtener_segundo_numero(){
        int segundo_numero_ingresado = ' ';

        BufferedReader numero_entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("ingrese el segundo valor");
            segundo_numero_ingresado = Integer.valueOf(numero_entrada.readLine());
        }
        catch(Exception exc){
            System.out.println(exc);
        }

        return segundo_numero_ingresado;
    }
}
