import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5_ejercicio4 {
    public static void main(String[] args){
        int[] arrValores = {0, 5, 8, 12, 15, 18, 25, 29, 32, 35};
        int buscar_valor = obtener_valor();
        int posicion_valor_buscado = buscar_pos_valor(arrValores, buscar_valor); 

        if(posicion_valor_buscado < 10 && (arrValores[posicion_valor_buscado] == buscar_valor)){
            System.out.println("el numero esta en la posicion" + "\t" + posicion_valor_buscado);
        }
        else{
            System.out.println("el valor ingresado no se encuentra en este array");
        }
    }

    public static int obtener_valor(){
        int valor = 0;
        BufferedReader valor_entrada = new BufferedReader(new InputStreamReader(System.in));
        boolean esValido = false;
        while(!esValido){
            try{
                System.out.println("ingrese el numero que quiere buscar en el arreglo");
                valor = Integer.valueOf(valor_entrada.readLine());
                esValido = true;
            }
            catch(Exception exc){
                System.out.println(exc);
            }
        }
        return valor;
    }

    public static int buscar_pos_valor(int[] arrValores, int buscar_valor){
        int pos = 0;
        while((pos<10) && (arrValores[pos]<buscar_valor)){
            pos++;
        }

        return pos;
    }
}
