import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1_ejercicio10 {
    public static void main(String[] args){
        int primer_numero ;
        int segundo_numero ;

        try{
            BufferedReader numero1_ingresado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el primer numero:");
            primer_numero = Integer.valueOf(numero1_ingresado.readLine());

            BufferedReader numero2_ingresado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el segundo numero:");
            segundo_numero = Integer.valueOf(numero2_ingresado.readLine());

            if(primer_numero > segundo_numero){
                System.out.println(primer_numero + "\t" + "es mas grande que" + "\t" + segundo_numero);
            }else{
                System.out.println(primer_numero + "\t" + "es mas chico que" + "\t" + segundo_numero);
            };

            if( ((primer_numero % 2) ==0) && ((segundo_numero%2)==0)){
                System.out.println(primer_numero + "\t" + "y" + "\t" + segundo_numero + "\t" + "son multiplos de 2");
            }else{
                System.out.println("un valor no es multiplo de 2");
            }
            
        }
        catch(Exception exc){
            System.out.println("mal" + exc);
        }
    }
}
