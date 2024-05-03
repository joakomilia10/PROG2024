import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ejercicio3 {
    public static void main(String[] args){
        int valor ; 
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un valor entero:");
            valor = Integer.valueOf(entrada.readLine());
            System.out.println("numero ingresado " + "\t" + valor);

        }
        catch (Exception exc) {
            System.out.println("mal");
        }
    }
}
// no se puede pedir q ingresen el valor de una constante. la constante se declara con valor si o si.