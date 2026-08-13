public class Clinica implements Asegurable{
    String nombreClinica;
    String direccion;
    boolean esAsegurable;

    public Clinica(String nombreClinica, String direccion, boolean esAsegurable) {
        this.nombreClinica = nombreClinica;
        this.direccion = direccion;
        this.esAsegurable = esAsegurable;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 5000000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLINICA-"+ this.nombreClinica;
    }
}
