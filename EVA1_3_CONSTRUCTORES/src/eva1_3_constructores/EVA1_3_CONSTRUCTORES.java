/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_3_constructores;

/**
 *
 * @author invitado
 */
public class EVA1_3_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.setNomcliente("Pando");
        cuenta1.setNcuenta("18");
        cuenta1.setSaldo(101);
        System.out.println("datos del cliente");
        System.out.println(cuenta1.getNomcliente());
        System.out.println(cuenta1.getNcuenta());
        System.out.println(cuenta1.getSaldo());
    }
    
}
