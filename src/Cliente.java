public class Cliente {
    // Atributos generales
    private String nombre;
    private String apellido;

    // Atributos sensibles
    private String rfc;
    private String numeroDeTarjeta;
    private String fecha;
    private int cvv;

    // Constructor
    public Cliente(String nombre, String apellido, String rfc, String numeroDeTarjeta, String fecha, int cvv) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rfc = rfc;
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.fecha = fecha;
        this.cvv = cvv;
    }

    // Métodos para acceder a los atributos generales
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Métodos para acceder a los atributos sensibles (solo getters)
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNumeroDeTarjeta() {
        return numeroDeTarjeta;
    }

    public void setNumeroDeTarjeta(String numeroDeTarjeta) {
        this.numeroDeTarjeta = numeroDeTarjeta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCvv() {
        return cvv;
    }

    // Nota: No se proporciona un setter para CVV por seguridad.
}
