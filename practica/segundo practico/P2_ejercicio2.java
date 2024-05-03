import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2_ejercicio2 {
    public static void main(String[] args){
        int mes ;
        int anio ;

        try{
            BufferedReader entrada_mes = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el numero de mes");
            mes = Integer.valueOf(entrada_mes.readLine());

            BufferedReader entrada_anio = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese año");
            anio = Integer.valueOf(entrada_anio.readLine());

            switch (mes) {
                case 1 : System.out.println("31"); break;
                case 2 : 
                    if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
                    System.out.println("29"); 
                    }
                    else {
                        System.out.println("28");
                    } break;
                case 3 : System.out.println("31"); break;
                case 4 : System.out.println("30"); break;
                case 5 : System.out.println("31"); break;
                case 6 : System.out.println("30"); break;
                case 7 : System.out.println("31"); break;
                case 8 : System.out.println("31"); break;
                case 9 : System.out.println("30"); break;
                case 10 : System.out.println("31"); break;
                case 11 : System.out.println("30"); break;
                case 12 : System.out.println("31"); break;

                default : System.out.println("no existe ese numero de mes"); break;
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
