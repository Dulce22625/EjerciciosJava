public class HolaMundo {
    public static void main(String[] args){
        String saludar = "Hola Mundo desde la casa de Dulce";

        System.out.println(saludar);

        System.out.println("saludar.tupperCase() = " + saludar.toUpperCase());

        int numero =10;
        System.out.println("numero = " + numero);
        boolean valor= true;
        int numero2 = 5;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);
        String nombre;
        nombre = "Dulce";

        if(numero>10) {
            nombre = "Zayda";
        }
        System.out.println("nombre = " + nombre);

        int edadPersona = 5;
    }

}
