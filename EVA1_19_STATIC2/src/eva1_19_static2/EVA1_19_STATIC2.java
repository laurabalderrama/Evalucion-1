/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_19_static2;

/**
 *
 * @author invitado
 */
public class EVA1_19_STATIC2 {
  int x = 100;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println(x);
        //mensajeNoEstatico();
        EVA1_19_STATIC2 obj = new EVA1_19_STATIC2();
        System.out.println(obj.x);
        obj.mensajeNoEstatico();
        // METODOS ESTATICOS
        
    }
    public void mensajeNoEstatico(){//no existe
        System.out.println("Mensaje no estático");
    }
    public void mensajeEstatico(){
        System.out.println("Mensaje estático");
    }
}
