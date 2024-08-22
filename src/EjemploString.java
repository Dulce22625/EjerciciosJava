public class EjemploString {
    public static void main(String[] args) {
        //tipo string de referencia no primititvo
        String curso ="Programación Java";
        String curso2 = new String("Programación Java");

        //comparación
        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);

        //comparando con metodo equals por valor
        //comparanco con el metodo IgnoreCase por si cambia alguna mayuscula o minuscula
        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);

//comparando dos objetos del mismo valor en la literal
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual);


    }
}

