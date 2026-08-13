public class Main {
    public static void main(String[] args) {

        System.out.println("\n------- Prueba 1 ---------");
        Animal[] animales = new Animal[3];
        animales[0] = new Perro("pincher", "Orion", "Omnivoro", 12, "Maria");
        animales[1] = new Gato("Pinguina", "Herbivoro", 6, "Angely", true);
        animales[2] = new Ave("Cokkie", "Herbivoro", 3, "Juan", 2550);

        for (int i = 0; i < animales.length; i++) {
            animales[i].mostrarFicha();
        }

        System.out.println("\n------- Prueba 2 ---------");
        Perro perrito = new Perro("criollo", "Laiser", "Omnivoro", 8, "Isabel");
        Gato gatico = new Gato("Caballo", "Omnivoro", 5, "Angely", false);
        Ave avecita = new Ave("piopi", "Herbivoro", 1, "Cristina", 50);

        perrito.registrarVacuna("Parbovirosis");
        perrito.registrarVacuna("Rabia");
        gatico.registrarVacuna("Rabia");
        //avecita.registrarVacuna("Moquillo");

        System.out.println("Vacunas perrito: " + perrito.getTotalVacunasAplicadas());
        System.out.println("Vacunas gatito: " + gatico.getTotalVacunasAplicadas());

        System.out.println("\n------- Prueba 3 ---------");
        Asegurable[] asegurables = new Asegurable[3];
        asegurables[0] = perrito;
        asegurables[1] = gatico;
        asegurables [2] = new Clinica("vetpet", "Calle falsa 123", true);

        for (int i = 0; i < asegurables.length; i++) {
            System.out.println(asegurables[i].calcularPrimaSeguro());
            System.out.println(asegurables[i].obtenerNumeroPoliza());
        }





    }
}
