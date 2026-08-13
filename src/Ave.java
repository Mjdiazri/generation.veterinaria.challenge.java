public class Ave extends Animal{
    private double pesoGramos;

    public Ave(String nombre, String tipoAlimentacion, int anios, String acudiente, double pesoGramos) {
        super(nombre, tipoAlimentacion, anios, acudiente);
        this.pesoGramos = pesoGramos;
    }

    @Override
    public double costoConsulta() {
        return 28000 + (100 * pesoGramos);
    }
}
