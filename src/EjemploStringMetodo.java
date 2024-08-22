public class EjemploStringMetodo {
    public static void main(String[] args) {

        String nombre = "Dulce ";

        System.out.println("nombre.lenght() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Dulce\") = " + nombre.equals("Dulce"));
        System.out.println("nombre.equalsIgnoreCase(\"dulce\") =" + nombre.equalsIgnoreCase("dulce"));
        System.out.println("nombre.compareTo(\"Dulce\") = " + nombre.compareTo("Dulce"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nombre.lenght()-1 = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.susbtring(4, 5) = " + nombre.substring(4, 5));

//segunda parte

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas= " + trabalenguas.replace("a", "."));
//aqui me quede
    }
}
