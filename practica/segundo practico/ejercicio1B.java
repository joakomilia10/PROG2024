import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio1B {
    public static void main(String[] args){
        int primer_numero;
        int segundo_numero;
        int tercer_numero;

        try{
            BufferedReader entrada_1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el primer numero");
            primer_numero = Integer.valueOf(entrada_1.readLine());

            BufferedReader entrada_2 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el segundo valor");
            segundo_numero = Integer.valueOf(entrada_2.readLine());

            BufferedReader entrada_3 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el tercer numero");
            tercer_numero = Integer.valueOf(entrada_3.readLine());

            if((primer_numero > segundo_numero) && (segundo_numero > tercer_numero)){
                System.out.println("el valor esta decrementando");
            }
            else if((primer_numero < segundo_numero) && (segundo_numero < tercer_numero)){
                System.out.println("el valor esta incrementando");
            }
            else{
                System.out.println("error");
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
