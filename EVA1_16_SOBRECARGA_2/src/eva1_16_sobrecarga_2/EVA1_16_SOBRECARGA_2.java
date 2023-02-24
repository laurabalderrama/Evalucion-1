
package eva1_16_sobrecarga_2;

/**
 *
 * @author invitado
 */
public class EVA1_16_SOBRECARGA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("suma: " + suma(4,9));
        System.out.println("suma: " + suma(4.0,9.0));
        System.out.println("suma: " + suma("Hola ","mundo"));
        suma();
    }
    //SUMA DE DOS NUMEROS
      // SUMA (int,int)
    public static int suma(int val1, int val2){
    return val1 + val2;
    }
    // SUMA (duble,double)
    public static double suma(double val1, double val2){
    return val1 + val2;
    }
    // SUMA (string,string)
    public static String suma(String val1, String val2){
    return val1 + val2;
    }
    // SUMA ()
    public static void suma(){
        System.out.println("suma: sin argumentos");
    }
}
