public class Conejo extends Animal{

    public Conejo(String nombre, String tipoAlimentacion, int anios, String acudiente) {
        super(nombre, tipoAlimentacion, anios, acudiente);
    }

    @Override
    public double costoConsulta() {
        return 35000;
    }

    @Override
    public void mostrarFicha() {
        super.mostrarFicha();
    }
}
