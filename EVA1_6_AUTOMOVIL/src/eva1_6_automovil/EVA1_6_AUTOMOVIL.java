package eva1_6_automovil;

public class EVA1_6_AUTOMOVIL {

    public static void main(String[] args) {
        Automovil carro1 = new Automovil("FORD", "F-150", "GAL-34-24", 1979, "KENINI");
        carro1.imprimirDatos();
        carro1.setAño(2010);
        carro1.imprimirDatos();
    }

}
