public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        //tipo string de referencia no primititvo
        String curso ="Programación Java";
        String profesor = "Dulce Sanchez";
        String detalle = curso + "con el instructor" +profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroA + numeroA);

        System.out.println(detalle + (numeroA + numeroA));

        //Metodo Concat
        String detalle2 = curso.concat("con el ").concat(profesor);
        System.out.println("detalle2 = " +detalle2);


    }
}

