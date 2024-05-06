import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2_ejercicio5 {
    public static void main(String[] args){
        int hora ;
        int temperatura ;

        char letra ;
        final char vocal_1 = 'a' ;
        final char vocal_2 = 'e' ;
        final char vocal_3 = 'i' ;
        final char vocal_4 = 'o' ;
        final char vocal_5 = 'u' ;

        final int clave = 246;
        int primer_clave ;
        int segunda_clave ;

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
            else if((hora >= 6) && (hora <= 11)) {
                BufferedReader entrada_letra = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("ingrese una letra");
                letra = entrada_letra.readLine().charAt(0);

                if((letra == vocal_1) || (letra == vocal_2) || (letra == vocal_3) || (letra == vocal_4) || (letra == vocal_5)){
                    switch(hora){
                        case 6 : case 8 : case 10 : case 11 :
                        System.out.println("tiene 2 vocales"); break;
                        case 7 : case 9 : 
                        System.out.println("tiene 3 vocales"); break;

                        default : System.out.println("no esta bien ingresada la hora");
                    }
                }
                else{
                    System.out.println("tiene 2 consonantes");
                }
            }
            else if((hora >= 12) && (hora <= 17)){
                switch(hora){
                    case 12 : case 14 : case 16 :
                    System.out.println((hora + 12) / 2); break;
                    case 13 : case 15 : case 17 :
                    System.out.println((hora + 17) / 2); break; 

                }
            }
            else if((hora >= 18) && (hora <= 23)){
                BufferedReader entrada_primer_clave = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("ingrese la primer clave");
                primer_clave = Integer.valueOf(entrada_primer_clave.readLine());

                if((primer_clave == clave) && (primer_clave >= 100) && (primer_clave <= 999)){
                    BufferedReader entrada_segunda_clave = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("ingrese la segunda clave");
                    segunda_clave = Integer.valueOf(entrada_segunda_clave.readLine());

                    if(((segunda_clave >= 200) && (segunda_clave <= 299)) || ((segunda_clave >= 400) && (segunda_clave <= 499)) || ((segunda_clave >= 600) && (segunda_clave <= 699)) || ((segunda_clave >= 800) && (segunda_clave <= 899))){
                        System.out.println("clave correcta");
                    }
                    else{
                        System.out.println("clave incorrecta");
                    }
                }
                else{
                    System.out.println("clave incorrecta");
                }

            }
            else{
                System.out.println("porfavor igrese correctamente la hora");
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
