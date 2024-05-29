import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3_ejercicio18 {
    public static void main(String[] args){
        char letra_ingresada = obtener_letra();

        while((letra_ingresada >= 'a') && (letra_ingresada <= 'z')){
            int numero_ingresado = obtener_numero();
            if((numero_ingresado>=1)&&(numero_ingresado<=5)){
                mostrar_tabla(numero_ingresado);
            }
            else{
                System.out.println("el numero ingresado no esta entre 1 y 5");
            }
            letra_ingresada = obtener_letra();
        }
    }

    public static char obtener_letra(){
        char letra_ingresada = ' ';
        boolean esValido = false;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while(!esValido){
            try{
            System.out.println("ingrese una letra minuscula");
            letra_ingresada = entrada.readLine().charAt(0);
            esValido = true;
            }
            catch(Exception exc){
                System.out.println(exc);
            }
        }
        return letra_ingresada;
    }

    public static int obtener_numero(){
        int numero_ingresado = 0;
        boolean esValido = false;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while(!esValido){
            try{
            System.out.println("ingrese un numero entre el 1 y 5 para ver su tabla de multiplicar");
            numero_ingresado = Integer.valueOf(entrada.readLine());
            esValido = true;
            }
            catch(Exception exc){
                System.out.println(exc);
            }
        }
        return numero_ingresado;
    }

    public static void mostrar_tabla(int numero_ingresado){
        int numero = numero_ingresado;

        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(numero * i);
        }
    }

}
