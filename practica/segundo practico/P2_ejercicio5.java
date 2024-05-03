import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2_ejercicio5 {
    public static void main(String[] args){
        int hora ;
        int temperatura ;

        try{
            BufferedReader entrada_hora = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese la hora actual");
            hora = Integer.valueOf(entrada_hora.readLine());

            if((hora >= 0) && (hora <= 5)) {
                BufferedReader entrada_temperatura = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("ingrese la temperatura actual");
                temperatura = Integer.valueOf(entrada_temperatura.readLine());

                if(temperatura < 20) {
                    System.out.println("encender el calefactor");
                }
                else if(temperatura > 25){
                    System.out.println("apagar calefactor");
                }
                else {
                    System.out.println("calefactor encendido, no abra las ventanas");
                }
            }
            else if()
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
