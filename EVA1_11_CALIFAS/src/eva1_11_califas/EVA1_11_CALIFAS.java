

package eva1_11_califas;

/**
 *
 * LAURA BALDERRAMA
 */
public class EVA1_11_CALIFAS {

    
    public static void main(String[] args) {
        System.out.println(convertirCalif(200));
    }
   public static String convertirCalif(int puntaje){
       String letra;
       if(puntaje > 0 || puntaje <=100)
       letra = ("CALIFICACION INVALIDA");
       else if(puntaje > 90 && puntaje <=100)
       letra = ("A");
       else if(puntaje > 80 && puntaje <=90)
          letra = ("B"); 
       else if(puntaje > 70&& puntaje <=80)
           letra = ("C");
       else 
           letra = ("D");
   return letra;
   }
}
