import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2_ejercicio6 {
    public static void main(String[] args){
        int numero_ingresado ;
        final int numero_ingreso_max = 100 ;
        final int numero_ingreso_min = 1 ;
        final int primer_multiplo = 2;
        final int segundo_multiplo = 3;

        try{
            BufferedReader entrada_numero = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un numero entre 100 y 1");
            numero_ingresado = Integer.valueOf(entrada_numero.readLine());

            for(int i = 0 ; i < 1 ; i++){
                if((numero_ingresado >= numero_ingreso_min) && (numero_ingresado <= numero_ingreso_max)){
                    if(((numero_ingresado % primer_multiplo) == 0) && ((numero_ingresado % segundo_multiplo) == 0)) {
                        System.out.println("el numero es multiplo de 2 y de 3");
                    }
                    else{
                        System.out.println("el numero no es simultaneamente multiplo de 2 y 3");
                    }
                }
                else {
                    System.out.println("el numero no esta entre 1 y 100");
                }
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
