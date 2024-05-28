import java.io.BufferedReader;
import java.io.InputStreamReader;


public class P2_ejercicio7 {
    public static void main(String []args){
        char letra = ' ';

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter: ");
            letra = (char)(entrada.readLine().charAt(0));

            if(letra>= 0 && letra<= 9 ){
                System.out.println("Es el dígito: " + letra);
            }
            else if ((letra>='a') && (letra<='z')){
                switch(letra){
                    case 'a':case 'e':case 'i':case 'o':case 'u':{
                    System.out.println("Es la vocal: " + letra);
                    break;
                }
                default: System.out.println("Es la consonante: " + letra);
                }
            }
            else System.out.println("Es cualquier otro caracter " + letra);
        }
        catch (Exception exc) {
            System.out.println("error");
        }
    }
}