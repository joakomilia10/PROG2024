import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3_ejercicio7 {
    public static void main(String[] args){
        int numero_ingresado = obtener_numero();
        int suma_enteros = sumatoria_enteros();

        while(numero_ingresado != 0){
            mostrar(suma_enteros);
            numero_ingresado = obtener_numero();
        }
    }

    public static int obtener_numero(){
        int numero_ingresado = 0;
        boolean esValido = false;

        BufferedReader numero_entrada = new BufferedReader(new InputStreamReader(System.in));
        while (!esValido) {
            try{
                System.out.println("ingrese un numero entero diferente a 0");
                numero_ingresado = Integer.valueOf(numero_entrada.readLine());
                esValido = true;
            }
            catch(Exception exc){
                System.out.println(exc);
            }
        }
    
        return numero_ingresado;
    }

    public static int sumatoria_enteros(){
        int suma_enteros = 0;

        for(int i = 1 ; i <= 200 ; i++){ 
            suma_enteros += i;
        }

        return suma_enteros;
    }

    public static void mostrar(int suma_enteros){
        int imprimir_entero = suma_enteros;

        System.out.println(imprimir_entero);
    }
}
