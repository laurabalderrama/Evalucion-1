package eva1_18_static;

/**
 *
 * LAURA BALDERRAMA
 */
public class EVA1_18_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        prueba obj = new prueba();
        obj.mensaje();
        prueba.mensajeEstatico();
        System.out.println("PI " + Math.PI);
        
    }
    
}
class prueba{
public void mensaje(){// solo al crear objetos
    System.out.println("hi!!");
}    
public static void mensajeEstatico(){//directamaente de la clase 
    System.out.println("hola (estatico)");
  }
}
class otra{}
