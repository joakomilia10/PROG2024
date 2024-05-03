import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio5 {
    public static void main(String[] args){
        String   nombre    ;
        int      edad      ;
        float   altura    ;
        String     ocupacion ;

        try {
            BufferedReader nombreingresado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese su nombre:");
            nombre = nombreingresado.readLine();

            BufferedReader edadingresada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese su edad:");
            edad = Integer.valueOf(edadingresada.readLine());

            BufferedReader alturaingresada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese su altura:");
            altura = Float.valueOf(alturaingresada.readLine());

            BufferedReader ocupacioningresada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese su ocupacion:");
            ocupacion = ocupacioningresada.readLine();

            System.out.println(nombre + "\t" + edad + "\t" + altura + "\t" + ocupacion);
        }
        catch(Exception exc){
            System.out.println("mal");
        }
    }
}
