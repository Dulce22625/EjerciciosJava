import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {


        //creo mi objeto para leer entrada de datos de usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre o descripción de la factura: ");
        String descripcion = scanner.nextLine();

        //pedir precio primero producto
        System.out.println("Ingrese el precio del producto: ");
        double precio1 = scanner.nextDouble();


        // pedir segundo precio
        System.out.println("Ingrese el precio del segundo producto");
        double precio2 = scanner.nextDouble();


        //calcular total bruto sin impuesto
        double totalBruto = precio1 + precio2;

        //calcular total con impuesto 19%
        double impuesto = totalBruto * 0.19;

        //total neto calcular
        double totalNeto = totalBruto + impuesto;

        //mMostrar resultados

        System.out.println(" La factura " + descripcion + " tiene un total bruto de:  " + totalBruto+ ", con un impuesto de: " + impuesto + "y el monto después de impuesto es : "+ totalNeto);

        scanner.close();
    }
}
