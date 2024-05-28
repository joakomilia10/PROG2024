import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2_ejercicio8 {
    public static void main(String[] args){
        int numero_ingresado ;
        int numero_ingresado2 ;

        try{
            BufferedReader entrada_numero = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un numero distinto a 0");
            numero_ingresado = Integer.valueOf(entrada_numero.readLine());


            for(int i = 0 ; i < 1 ; i++){
                if(numero_ingresado != 0){
                    BufferedReader entrada_numero2 = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("ingrese un numero cualquiera");
                    numero_ingresado2 = Integer.valueOf(entrada_numero2.readLine());

                    System.out.println(numero_ingresado2);
                }
                else{
                    System.out.println("el numero 0 no esta disponible");
                }
            };
        }
        catch(Exception exc){
            System.out.println(exc);
        }
          
    }
}
