import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2_ejercicio1A {
    public static void main(String[] args){
        int primer_numero ;
        int segundo_numero ;
        int tercer_numero ;
        char primer_letra ;

        try{
            BufferedReader entrada_1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el numero");
            primer_numero = Integer.valueOf(entrada_1.readLine());

            if(primer_numero > 0 ){
                System.out.println("el numero es positivo");
            }
            else if(primer_numero < 0 ){
                System.out.println("el numero es negativo");
            }
            else{
                System.out.println("ingrese un numero diferente que 0");
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }

        try{
            BufferedReader entrada_2 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el segundo numero");
            segundo_numero = Integer.valueOf(entrada_2.readLine());

            if(segundo_numero >= 100){
                System.out.println("el numero ingresado es grande");
            }
            else{
                System.out.println("el numero ingresado es chico");
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }

        try{
            BufferedReader entrada_3 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un numero del 1 al 7");
            tercer_numero = Integer.valueOf(entrada_3.readLine());

            switch (tercer_numero) {
                case 1 : System.out.println("LUNES");     break;
                case 2 : System.out.println("MARTES");    break;
                case 3 : System.out.println("MIERCOLES"); break;
                case 4 : System.out.println("JUEVES");    break;
                case 5 : System.out.println("VIERNES");   break;
                case 6 : System.out.println("SABADO");    break;
                case 7 : System.out.println("DOMINGO");   break;
               
                default: System.out.println("el valor ingresado no esta entre 1 y 7");
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }

        try{
            BufferedReader entrada_4 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese una letra");
            primer_letra = entrada_4.readLine() .charAt(0);

            switch(primer_letra){
                case 'a' : case 'e' : case 'i' : case 'o' : case 'u' :
                    System.out.println("la letra ingresada es una vocal"); break;
                default : System.out.println("la letra ingresada es una consonante"); break;
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
