import java.util.ArrayList;

public class Gato extends Animal implements Asegurable, Vacunable{
    private boolean esEsterilizado;

    public Gato(String nombre, String tipoAlimentacion, int anios, String acudiente, boolean esEsterilizado) {
        super(nombre, tipoAlimentacion, anios, acudiente);
        this.esEsterilizado = esEsterilizado;
    }

    //Variables
    ArrayList<String> vacunasG = new ArrayList<>();

    //Metodos
    @Override
    public double costoConsulta() {
        return 38000;
    }

    @Override
    public double calcularPrimaSeguro() {
        return this.esEsterilizado ? 120000 : 200000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-GATO-"+this.nombre;
    }

    @Override
    public void registrarVacuna(String nombreVacuna) {
        vacunasG.add(nombreVacuna);
    }

    @Override
    public int getTotalVacunasAplicadas() {
        return vacunasG.size();
    }
}
