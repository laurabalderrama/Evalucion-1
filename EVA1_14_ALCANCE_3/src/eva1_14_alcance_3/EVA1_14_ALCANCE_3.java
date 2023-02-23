
package eva1_14_alcance_3;

/**
 *
 * laura balderrama
 */
public class EVA1_14_ALCANCE_3 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 100;
        System.out.println(x);//visible en todo el main
        for (int i = 0; i < 10; i++) {
          //  int x = 100;// no se puede, existe en el main
            System.out.println(i);
            System.out.println(x);
            if(i == 5){
                System.out.println(x);//visible en todo el main
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
public static void algo(int x){
}
public static void algo2(int x){
}