
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa numero 1: ");
        int intValue1 = scanner.nextInt();
        System.out.println("Ingresa numero 2 ");
        int intValue2 = scanner.nextInt();
        System.out.println("Ingresa numero 3 ");
        int intValue3 = scanner.nextInt();

        System.out.println("Numero 1 " + intValue1);
        System.out.println("Numero 2:" + intValue2);
        System.out.println("Numero 3:" + intValue3);

        if (intValue1 > intValue2 & intValue3 < intValue1 ){
            System.out.println("El numero 1 es mayor que el numero 2 y que el 3" + intValue1);
        }else if (intValue2 > intValue1 & intValue3 < intValue2){
            System.out.println("El numero 2 es mayor que el numero 1 y que el numero 3 " + intValue2);
        }else {
            System.out.println("El numero 3 es mayor que el numero 1 y que el numero 2" + intValue3);
        }

        scanner.close();
    }
}
