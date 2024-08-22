public class PrimitivosFloat {
    public static void main(String[] args) {


        //si es positivo la , se recorre a la dereccha y si es negativo se recorre a la izquierda
        //lo que va la izquierda del exponente se llama mantiza, el e es el exponente, y valor correspondiente es valor de punto fijo
        float realFloat = 1.5e-10f;

        System.out.println(" el numero flotante es: " + realFloat);
        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("el valor maximo de un float es: " + Float.MAX_VALUE);
        System.out.println("el valor minimo de un float es: " + Float.MIN_VALUE);

        //DE DOBLE PRECISION

        double realDouble = 3.4028235E38f;
        System.out.println(" el numero double es: " + realDouble);
        System.out.println("float corresponde en byte a = " + Double.BYTES);
        System.out.println("float corresponde en bites a = " + Double.SIZE);
        System.out.println("el valor maximo de un double es: " + Double.MAX_VALUE);
        System.out.println("el valor minimo de un double es: " + Double.MIN_VALUE);

        var varFlotante = 3;
        System.out.println(" varFlotante = " + varFlotante);

    }
}
