import java.io.BufferedReader;
import java.io.InputStreamReader;


public class P1_ejercicio4 {
    public static void main(String[] args){
        int primero ;
        int segundo ;
        int tercero ; 
        int cuarto  ;
        int quinto  ;

        try {
            BufferedReader entrada1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el primer numero:");
            primero = Integer.valueOf(entrada1.readLine());
            
            BufferedReader entrada2 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el segundo numero:");
            segundo = Integer.valueOf(entrada2.readLine());

            BufferedReader entrada3 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el tercer numero:");
            tercero = Integer.valueOf(entrada3.readLine());

            BufferedReader entrada4 = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("ingrese el cuarto numero:");
            cuarto = Integer.valueOf(entrada4.readLine());

            BufferedReader entrada5 = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("ingrese el quinto numero :");
            quinto = Integer.valueOf(entrada5.readLine());

            System.out.println(quinto + "\t" + cuarto + "\t" + tercero + "\t" + segundo + "\t" + primero);
        }
        catch (Exception exc){
            System.out.println("mal");
        }
    }
}
