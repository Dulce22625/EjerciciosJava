public class PrimitivosBoolean {
    public static void main(String[] args) {
//los primitivos booleanos sirven para flujo de control for, while, etc, para evaluar una condicion que retorna verdadero o falso y de acuer
//a esto retorna o hace uan funcion.

        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3; // 98.76543
        System.out.println("d = " + d);

        float f = 1.2345e2f;  // 123.45
        System.out.println("f = " + f);
        // <> operadores de relaciones para asignar valores logicos a expresiones booleanas
        datoLogico = d > f ;
        System.out.println("datoLogico = " + datoLogico);

        // = asignar valor
        // == comparar valores
        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);



    }
}
