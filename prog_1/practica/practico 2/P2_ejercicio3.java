import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2_ejercicio3 {
    public static void main(String[] args){
        int numero ;
        final int num_MIN = 50;

        try{
            BufferedReader entrada_numero = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un numero mayor a 50");
            numero = Integer.valueOf(entrada_numero.readLine());

            if(numero > num_MIN){
                if((numero % 2) == 0 || (numero % 3) == 0 ){
                    System.out.println(numero);
                }
            }
            else{
                System.out.println("el numero ingresado no es mayor a 50");
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
