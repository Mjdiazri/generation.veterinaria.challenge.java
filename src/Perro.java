import java.util.ArrayList;

public class Perro extends Animal implements Asegurable, Vacunable {
    private String raza;

    public Perro(String raza, String nombre, String tipoAlimentacion, int anios, String acudiente){
        super(nombre, tipoAlimentacion, anios, acudiente);;
        this.raza = raza;
    }

    //Variables
    ArrayList<String> vacunasP = new ArrayList<>();

    //mETODOS

    //Clase abs
    @Override
    public double costoConsulta() {
        return 45000 + (3000 * this.anios);
    }

    //Interfaz Asegurable
    @Override
    public double calcularPrimaSeguro() {
        return 80000 * this.anios;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-PERRO-"+this.nombre;
    }

    //Interaz Vacunable

    @Override
    public void registrarVacuna(String nombreVacuna) {
        vacunasP.add(nombreVacuna);
    }

    @Override
    public int getTotalVacunasAplicadas() {
        return vacunasP.size();
    }
}
