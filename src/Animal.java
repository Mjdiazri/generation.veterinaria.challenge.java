public abstract class Animal {

    protected String nombre;
    protected String tipoAlimentacion;
    protected int anios;
    protected String acudiente;

    public Animal(String nombre, String tipoAlimentacion, int anios, String acudiente) {
        this.nombre = nombre;
        this.tipoAlimentacion = tipoAlimentacion;
        this.anios = anios;
        this.acudiente = acudiente;
    }

    //Metodos
    public abstract double costoConsulta();

    public void mostrarFicha(){
        System.out.println(""" 
                Ficha:
                Nombre: %s,
                Alimentacion: %s,
                años: %d,
                Dueño: %s,
                Costo de la consulta = %,.2f
                """.formatted(this.nombre, this.tipoAlimentacion, this.anios, this.acudiente, costoConsulta()));
    }
}
