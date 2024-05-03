import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio6 {
    public static void main(String[] args){
        String  factura_tipo    ;
        int     numero_factura  ;
        String  nombre_cliente  ;
        String  producto1       ;
        double     importe1        ;
        String  producto2       ;
        double     importe2        ;
        double     importe_total   ;

        try {
            BufferedReader factura_ingresada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el tipo de factura:");
            factura_tipo = factura_ingresada.readLine();

            BufferedReader num_fac_ingresada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese numero de factura:");
            numero_factura = Integer.valueOf(num_fac_ingresada.readLine());

            BufferedReader nombre_ingresado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese su nombre:");
            nombre_cliente = nombre_ingresado.readLine();

            BufferedReader producto1_ingresado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el primer producto:");
            producto1 = producto1_ingresado.readLine();
            
            BufferedReader importe1_ingresado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el importe del producto:");
            importe1 = Double.valueOf(importe1_ingresado.readLine());

            BufferedReader producto2_ingresado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el segundo producto:");
            producto2 = producto2_ingresado.readLine();

            BufferedReader importe2_ingresado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese el precio del segundo producto:");
            importe2 = Double.valueOf(importe2_ingresado.readLine());

            importe_total = (importe1 + importe2);

            System.out.println("factura" + "\t" + factura_tipo + "\t" + "n" + numero_factura + "\n" +
                                "nombre:" + "\t" + nombre_cliente + "\n" +
                                "Producto" + "\t" + "Importe" + "\n" +
                                producto1 + "\t" + importe1 + "\n" +
                                producto2 + "\t" + importe2 + "\n" +
                                "el importe total es de:" + "\t" + importe_total);
        }
        catch(Exception exc){
            System.out.println("mal");
        }
    }
}
