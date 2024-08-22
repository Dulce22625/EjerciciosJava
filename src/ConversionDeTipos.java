public class ConversionDeTipos {

    public static void main(String[] args) {
        String numeroStr =  "50";

        int numeroInt = Integer.parseInt(numeroStr);

        String realStr = "98765.43";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);


        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        //de primitivo a string

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = "+ otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);


        // de string a primitivo
        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = "+otroNumeroStr);

        // de decimal a un tipo string
        double otroRealDouble = 1.23456;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e2);
        System.out.println("otroRealStr = " + otroRealStr );


        // conversiones entre primitivos

        int i = 22768;
        short s = (short) i;
        System.out.println("s = "+ s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char b = (char) i;
        System.out.println("b = " +b);
        float f = i;
        System.out.println("f = " + f);

    }
}
