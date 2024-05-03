import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio11 {
    public static void main(String[] args){
        int numero ;        

        try{
            BufferedReader numero_ingresado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un numero entero");
            numero = Integer.valueOf(numero_ingresado.readLine());
            
            if(numero == 42){
                System.out.println( "el numero es multiplo de 6 y 7");
            } else{
                System.out.println("no es multiplo de 6 y 7");
            };

            if((numero > 30) && ((numero%2)==0)){
                System.out.println("el numero es mayor a 30 y es multiplo de 2");
            } else{
                System.out.println("el numero es menor que 30 o no es multiplo de 2");
            }

            if((numero / 5) > 10){
                System.out.println("el numero dividido por 5 es mayor a 10");
            } else{
                System.out.println("el numero dividido por 5 es menor a 10");    
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
