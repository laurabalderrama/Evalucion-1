
package eva1_17_sobrecarga_areas;

/**
 *
 * @author invitado
 */
public class EVA1_17_SOBRECARGA_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("circulo = " + areaCirculo(5.0));
        System.out.println("triangulo = " + areaTriangulo(5.0, 5.0));
        System.out.println("trapecio = " + areaTrapecio(5.0, 5.0,5.0));
    }
    public static double areaCirculo(double radio ){
     return  Math.PI*radio*radio;
    }
    public static double areaTriangulo(double base, double altura){
     return  (base*altura/2);
    }
    public static double areaTrapecio(double baseMayor, double baseMenor,double altura){
     return  altura*(baseMayor*baseMenor)/2;
    }
}
